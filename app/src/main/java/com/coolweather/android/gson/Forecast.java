package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZHan on 2018/3/11.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
