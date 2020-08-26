package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorCriteria extends js.Object {
  /**
    * The operator that relates the thing measured (metric) to the criteria (containing a value or statisticalThreshold).
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.native
  /**
    * If a device is in violation of the behavior for the specified number of consecutive datapoints, an alarm occurs. If not specified, the default is 1.
    */
  var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.native
  /**
    * If an alarm has occurred and the offending device is no longer in violation of the behavior for the specified number of consecutive datapoints, the alarm is cleared. If not specified, the default is 1.
    */
  var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.native
  /**
    * Use this to specify the time duration over which the behavior is evaluated, for those criteria which have a time dimension (for example, NUM_MESSAGES_SENT). For a statisticalThreshhold metric comparison, measurements from all devices are accumulated over this time duration before being used to calculate percentiles, and later, measurements from an individual device are also accumulated over this time duration before being given a percentile rank.
    */
  var durationSeconds: js.UndefOr[DurationSeconds] = js.native
  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  var statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.native
  /**
    * The value to be compared with the metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}

object BehaviorCriteria {
  @scala.inline
  def apply(): BehaviorCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BehaviorCriteria]
  }
  @scala.inline
  implicit class BehaviorCriteriaOps[Self <: BehaviorCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonOperator: Self = this.set("comparisonOperator", js.undefined)
    @scala.inline
    def setConsecutiveDatapointsToAlarm(value: ConsecutiveDatapointsToAlarm): Self = this.set("consecutiveDatapointsToAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsecutiveDatapointsToAlarm: Self = this.set("consecutiveDatapointsToAlarm", js.undefined)
    @scala.inline
    def setConsecutiveDatapointsToClear(value: ConsecutiveDatapointsToClear): Self = this.set("consecutiveDatapointsToClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsecutiveDatapointsToClear: Self = this.set("consecutiveDatapointsToClear", js.undefined)
    @scala.inline
    def setDurationSeconds(value: DurationSeconds): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
    @scala.inline
    def setStatisticalThreshold(value: StatisticalThreshold): Self = this.set("statisticalThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatisticalThreshold: Self = this.set("statisticalThreshold", js.undefined)
    @scala.inline
    def setValue(value: MetricValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

