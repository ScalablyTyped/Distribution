package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datapoint extends js.Object {
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.native
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.native
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.native
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.native
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.native
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.native
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamp] = js.native
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object Datapoint {
  @scala.inline
  def apply(
    Average: js.UndefOr[DatapointValue] = js.undefined,
    ExtendedStatistics: DatapointValueMap = null,
    Maximum: js.UndefOr[DatapointValue] = js.undefined,
    Minimum: js.UndefOr[DatapointValue] = js.undefined,
    SampleCount: js.UndefOr[DatapointValue] = js.undefined,
    Sum: js.UndefOr[DatapointValue] = js.undefined,
    Timestamp: Timestamp = null,
    Unit: StandardUnit = null
  ): Datapoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Average)) __obj.updateDynamic("Average")(Average.get.asInstanceOf[js.Any])
    if (ExtendedStatistics != null) __obj.updateDynamic("ExtendedStatistics")(ExtendedStatistics.asInstanceOf[js.Any])
    if (!js.isUndefined(Maximum)) __obj.updateDynamic("Maximum")(Maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Minimum)) __obj.updateDynamic("Minimum")(Minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleCount)) __obj.updateDynamic("SampleCount")(SampleCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Sum)) __obj.updateDynamic("Sum")(Sum.get.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datapoint]
  }
}

