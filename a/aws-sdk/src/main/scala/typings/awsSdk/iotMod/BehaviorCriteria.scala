package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehaviorCriteria extends StObject {
  
  /**
    * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
  
  /**
    * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
    */
  var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined
  
  /**
    * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
    */
  var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined
  
  /**
    * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time dimension (for example, NUM_MESSAGES_SENT). For a statisticalThreshhold metric comparison, measurements from all devices are accumulated over this time duration before being used to calculate percentiles, and later, measurements from an individual device are also accumulated over this time duration before being given a percentile rank.
    */
  var durationSeconds: js.UndefOr[DurationSeconds] = js.undefined
  
  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  var statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined
  
  /**
    * The value to be compared with the metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object BehaviorCriteria {
  
  @scala.inline
  def apply(): BehaviorCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BehaviorCriteria]
  }
  
  @scala.inline
  implicit class BehaviorCriteriaMutableBuilder[Self <: BehaviorCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonOperatorUndefined: Self = StObject.set(x, "comparisonOperator", js.undefined)
    
    @scala.inline
    def setConsecutiveDatapointsToAlarm(value: ConsecutiveDatapointsToAlarm): Self = StObject.set(x, "consecutiveDatapointsToAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsecutiveDatapointsToAlarmUndefined: Self = StObject.set(x, "consecutiveDatapointsToAlarm", js.undefined)
    
    @scala.inline
    def setConsecutiveDatapointsToClear(value: ConsecutiveDatapointsToClear): Self = StObject.set(x, "consecutiveDatapointsToClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsecutiveDatapointsToClearUndefined: Self = StObject.set(x, "consecutiveDatapointsToClear", js.undefined)
    
    @scala.inline
    def setDurationSeconds(value: DurationSeconds): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    @scala.inline
    def setStatisticalThreshold(value: StatisticalThreshold): Self = StObject.set(x, "statisticalThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticalThresholdUndefined: Self = StObject.set(x, "statisticalThreshold", js.undefined)
    
    @scala.inline
    def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
