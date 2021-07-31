package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageForecastResponse extends StObject {
  
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ForecastResultsByTime] = js.undefined
  
  /**
    * How much you're forecasted to use over the forecast period.
    */
  var Total: js.UndefOr[MetricValue] = js.undefined
}
object GetUsageForecastResponse {
  
  @scala.inline
  def apply(): GetUsageForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageForecastResponse]
  }
  
  @scala.inline
  implicit class GetUsageForecastResponseMutableBuilder[Self <: GetUsageForecastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastResultsByTime(value: ForecastResultsByTime): Self = StObject.set(x, "ForecastResultsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastResultsByTimeUndefined: Self = StObject.set(x, "ForecastResultsByTime", js.undefined)
    
    @scala.inline
    def setForecastResultsByTimeVarargs(value: ForecastResult*): Self = StObject.set(x, "ForecastResultsByTime", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: MetricValue): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
