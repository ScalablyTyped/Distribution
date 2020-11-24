package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageForecastResponse extends js.Object {
  
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ForecastResultsByTime] = js.native
  
  /**
    * How much you're forecasted to use over the forecast period.
    */
  var Total: js.UndefOr[MetricValue] = js.native
}
object GetUsageForecastResponse {
  
  @scala.inline
  def apply(): GetUsageForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageForecastResponse]
  }
  
  @scala.inline
  implicit class GetUsageForecastResponseOps[Self <: GetUsageForecastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForecastResultsByTimeVarargs(value: ForecastResult*): Self = this.set("ForecastResultsByTime", js.Array(value :_*))
    
    @scala.inline
    def setForecastResultsByTime(value: ForecastResultsByTime): Self = this.set("ForecastResultsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastResultsByTime: Self = this.set("ForecastResultsByTime", js.undefined)
    
    @scala.inline
    def setTotal(value: MetricValue): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
}
