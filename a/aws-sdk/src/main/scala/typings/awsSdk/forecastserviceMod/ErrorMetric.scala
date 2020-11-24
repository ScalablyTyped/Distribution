package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorMetric extends js.Object {
  
  /**
    *  Forecast types can be quantiles from 0.01 to 0.99 (by increments of 0.01), and the mean. 
    */
  var ForecastType: js.UndefOr[typings.awsSdk.forecastserviceMod.ForecastType] = js.native
  
  /**
    *  The root-mean-square error (RMSE). 
    */
  var RMSE: js.UndefOr[Double] = js.native
  
  /**
    *  The weighted absolute percentage error (WAPE). 
    */
  var WAPE: js.UndefOr[Double] = js.native
}
object ErrorMetric {
  
  @scala.inline
  def apply(): ErrorMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMetric]
  }
  
  @scala.inline
  implicit class ErrorMetricOps[Self <: ErrorMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForecastType(value: ForecastType): Self = this.set("ForecastType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastType: Self = this.set("ForecastType", js.undefined)
    
    @scala.inline
    def setRMSE(value: Double): Self = this.set("RMSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRMSE: Self = this.set("RMSE", js.undefined)
    
    @scala.inline
    def setWAPE(value: Double): Self = this.set("WAPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWAPE: Self = this.set("WAPE", js.undefined)
  }
}
