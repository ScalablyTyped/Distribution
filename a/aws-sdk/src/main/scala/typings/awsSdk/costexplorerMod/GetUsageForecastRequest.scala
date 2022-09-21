package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageForecastRequest extends StObject {
  
  /**
    * The filters that you want to use to filter your forecast. The GetUsageForecast API supports filtering by the following dimensions:    AZ     INSTANCE_TYPE     LINKED_ACCOUNT     LINKED_ACCOUNT_NAME     OPERATION     PURCHASE_TYPE     REGION     SERVICE     USAGE_TYPE     USAGE_TYPE_GROUP     RECORD_TYPE     OPERATING_SYSTEM     TENANCY     SCOPE     PLATFORM     SUBSCRIPTION_ID     LEGAL_ENTITY_NAME     DEPLOYMENT_OPTION     DATABASE_ENGINE     INSTANCE_TYPE_FAMILY     BILLING_ENTITY     RESERVATION_ID     SAVINGS_PLAN_ARN   
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetUsageForecast operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: typings.awsSdk.costexplorerMod.Granularity
  
  /**
    * Which metric Cost Explorer uses to create your forecast. Valid values for a GetUsageForecast call are the following:   USAGE_QUANTITY   NORMALIZED_USAGE_AMOUNT  
    */
  var Metric: typings.awsSdk.costexplorerMod.Metric
  
  /**
    * Amazon Web Services Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
    */
  var PredictionIntervalLevel: js.UndefOr[typings.awsSdk.costexplorerMod.PredictionIntervalLevel] = js.undefined
  
  /**
    * The start and end dates of the period that you want to retrieve usage forecast for. The start date is included in the period, but the end date isn't included in the period. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01. The start date must be equal to or later than the current date to avoid a validation error.
    */
  var TimePeriod: DateInterval
}
object GetUsageForecastRequest {
  
  inline def apply(Granularity: Granularity, Metric: Metric, TimePeriod: DateInterval): GetUsageForecastRequest = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageForecastRequest]
  }
  
  extension [Self <: GetUsageForecastRequest](x: Self) {
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalLevel(value: PredictionIntervalLevel): Self = StObject.set(x, "PredictionIntervalLevel", value.asInstanceOf[js.Any])
    
    inline def setPredictionIntervalLevelUndefined: Self = StObject.set(x, "PredictionIntervalLevel", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
