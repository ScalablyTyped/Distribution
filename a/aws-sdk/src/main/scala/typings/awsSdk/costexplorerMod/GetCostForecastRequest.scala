package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCostForecastRequest extends js.Object {
  
  /**
    * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer filters.
    */
  var Filter: js.UndefOr[Expression] = js.native
  
  /**
    * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetCostForecast operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: typings.awsSdk.costexplorerMod.Granularity = js.native
  
  /**
    * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values for a GetCostForecast call are the following:   AMORTIZED_COST   BLENDED_COST   NET_AMORTIZED_COST   NET_UNBLENDED_COST   UNBLENDED_COST  
    */
  var Metric: typings.awsSdk.costexplorerMod.Metric = js.native
  
  /**
    * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
    */
  var PredictionIntervalLevel: js.UndefOr[typings.awsSdk.costexplorerMod.PredictionIntervalLevel] = js.native
  
  /**
    * The period of time that you want the forecast to cover. The start date must be equal to or no later than the current date to avoid a validation error.
    */
  var TimePeriod: DateInterval = js.native
}
object GetCostForecastRequest {
  
  @scala.inline
  def apply(Granularity: Granularity, Metric: Metric, TimePeriod: DateInterval): GetCostForecastRequest = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostForecastRequest]
  }
  
  @scala.inline
  implicit class GetCostForecastRequestOps[Self <: GetCostForecastRequest] (val x: Self) extends AnyVal {
    
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
    def setGranularity(value: Granularity): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: Metric): Self = this.set("Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = this.set("TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Expression): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setPredictionIntervalLevel(value: PredictionIntervalLevel): Self = this.set("PredictionIntervalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionIntervalLevel: Self = this.set("PredictionIntervalLevel", js.undefined)
  }
}
