package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCostForecastResponse extends StObject {
  
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ForecastResultsByTime] = js.native
  
  /**
    * How much you are forecasted to spend over the forecast period, in USD.
    */
  var Total: js.UndefOr[MetricValue] = js.native
}
object GetCostForecastResponse {
  
  @scala.inline
  def apply(): GetCostForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostForecastResponse]
  }
  
  @scala.inline
  implicit class GetCostForecastResponseMutableBuilder[Self <: GetCostForecastResponse] (val x: Self) extends AnyVal {
    
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
