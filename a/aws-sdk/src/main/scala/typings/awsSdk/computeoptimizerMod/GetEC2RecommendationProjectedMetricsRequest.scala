package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEC2RecommendationProjectedMetricsRequest extends StObject {
  
  /**
    * The timestamp of the last projected metrics data point to return.
    */
  var endTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
    */
  var instanceArn: InstanceArn
  
  /**
    * The granularity, in seconds, of the projected metrics data points.
    */
  var period: Period
  
  /**
    * An object to specify the preferences for the Amazon EC2 recommendation projected metrics to return in the response.
    */
  var recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
  
  /**
    * The timestamp of the first projected metrics data point to return.
    */
  var startTime: js.Date
  
  /**
    * The statistic of the projected metrics.
    */
  var stat: MetricStatistic
}
object GetEC2RecommendationProjectedMetricsRequest {
  
  inline def apply(
    endTime: js.Date,
    instanceArn: InstanceArn,
    period: Period,
    startTime: js.Date,
    stat: MetricStatistic
  ): GetEC2RecommendationProjectedMetricsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceArn = instanceArn.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsRequest]
  }
  
  extension [Self <: GetEC2RecommendationProjectedMetricsRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setRecommendationPreferences(value: RecommendationPreferences): Self = StObject.set(x, "recommendationPreferences", value.asInstanceOf[js.Any])
    
    inline def setRecommendationPreferencesUndefined: Self = StObject.set(x, "recommendationPreferences", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStat(value: MetricStatistic): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
