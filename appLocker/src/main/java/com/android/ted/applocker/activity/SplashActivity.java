package com.android.ted.applocker.activity;

import android.content.Intent;
import android.os.Bundle;
import com.android.ted.applocker.R;
import com.android.ted.applocker.base.TApplication;
import com.android.tedframework.Activity.TActivity;


/**
 * Created by Ted on 2014/11/20.
 */
public class SplashActivity extends TActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(TApplication.getInstance().isHasPwd()){
            /***/
            setContentView(R.layout.activity_splash_pattern_unlock);
        }else {
            /***/
            callCreatePwdPage();
        }
    }



    /***
     * 调用创建密码页面
     */
    private void callCreatePwdPage(){
        Intent intent = new Intent(this,CreatePwdActivity.class);
        startActivity(intent);
        finish();
    }



}
