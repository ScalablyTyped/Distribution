package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCostForecastRequest extends StObject {
  
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
  implicit class GetCostForecastRequestMutableBuilder[Self <: GetCostForecastRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: Metric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionIntervalLevel(value: PredictionIntervalLevel): Self = StObject.set(x, "PredictionIntervalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionIntervalLevelUndefined: Self = StObject.set(x, "PredictionIntervalLevel", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
