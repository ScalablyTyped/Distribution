package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorMetric extends StObject {
  
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
  implicit class ErrorMetricMutableBuilder[Self <: ErrorMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastType(value: ForecastType): Self = StObject.set(x, "ForecastType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastTypeUndefined: Self = StObject.set(x, "ForecastType", js.undefined)
    
    @scala.inline
    def setRMSE(value: Double): Self = StObject.set(x, "RMSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRMSEUndefined: Self = StObject.set(x, "RMSE", js.undefined)
    
    @scala.inline
    def setWAPE(value: Double): Self = StObject.set(x, "WAPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWAPEUndefined: Self = StObject.set(x, "WAPE", js.undefined)
  }
}
