package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEC2RecommendationProjectedMetricsRequest extends StObject {
  
  /**
    * The time stamp of the last projected metrics data point to return.
    */
  var endTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
    */
  var instanceArn: InstanceArn
  
  /**
    * The granularity, in seconds, of the projected metrics data points.
    */
  var period: Period
  
  /**
    * The time stamp of the first projected metrics data point to return.
    */
  var startTime: Timestamp
  
  /**
    * The statistic of the projected metrics.
    */
  var stat: MetricStatistic
}
object GetEC2RecommendationProjectedMetricsRequest {
  
  inline def apply(
    endTime: Timestamp,
    instanceArn: InstanceArn,
    period: Period,
    startTime: Timestamp,
    stat: MetricStatistic
  ): GetEC2RecommendationProjectedMetricsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceArn = instanceArn.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsRequest]
  }
  
  extension [Self <: GetEC2RecommendationProjectedMetricsRequest](x: Self) {
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStat(value: MetricStatistic): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
