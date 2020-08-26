package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostForecastResponse extends js.Object {
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
  implicit class GetCostForecastResponseOps[Self <: GetCostForecastResponse] (val x: Self) extends AnyVal {
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

