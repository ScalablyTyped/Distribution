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
  def apply(
    comparisonOperator: ComparisonOperator = null,
    consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined,
    consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined,
    durationSeconds: js.UndefOr[DurationSeconds] = js.undefined,
    statisticalThreshold: StatisticalThreshold = null,
    value: MetricValue = null
  ): BehaviorCriteria = {
    val __obj = js.Dynamic.literal()
    if (comparisonOperator != null) __obj.updateDynamic("comparisonOperator")(comparisonOperator.asInstanceOf[js.Any])
    if (!js.isUndefined(consecutiveDatapointsToAlarm)) __obj.updateDynamic("consecutiveDatapointsToAlarm")(consecutiveDatapointsToAlarm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(consecutiveDatapointsToClear)) __obj.updateDynamic("consecutiveDatapointsToClear")(consecutiveDatapointsToClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationSeconds)) __obj.updateDynamic("durationSeconds")(durationSeconds.get.asInstanceOf[js.Any])
    if (statisticalThreshold != null) __obj.updateDynamic("statisticalThreshold")(statisticalThreshold.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorCriteria]
  }
}

