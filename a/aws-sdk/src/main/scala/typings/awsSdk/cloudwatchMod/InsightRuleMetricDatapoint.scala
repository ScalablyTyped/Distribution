package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightRuleMetricDatapoint extends js.Object {
  /**
    * The average value from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Average: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so the identity of the max contributor could be different for each timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The maximum value from a single occurence from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Maximum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The minimum value from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Minimum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The number of occurrences that matched the rule during this data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var SampleCount: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The sum of the values from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Sum: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * The timestamp of the data point.
    */
  var Timestamp: typings.awsSdk.cloudwatchMod.Timestamp = js.native
  /**
    * The number of unique contributors who published data during this timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var UniqueContributors: js.UndefOr[InsightRuleUnboundDouble] = js.native
}

object InsightRuleMetricDatapoint {
  @scala.inline
  def apply(
    Timestamp: Timestamp,
    Average: Int | Double = null,
    MaxContributorValue: Int | Double = null,
    Maximum: Int | Double = null,
    Minimum: Int | Double = null,
    SampleCount: Int | Double = null,
    Sum: Int | Double = null,
    UniqueContributors: Int | Double = null
  ): InsightRuleMetricDatapoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (Average != null) __obj.updateDynamic("Average")(Average.asInstanceOf[js.Any])
    if (MaxContributorValue != null) __obj.updateDynamic("MaxContributorValue")(MaxContributorValue.asInstanceOf[js.Any])
    if (Maximum != null) __obj.updateDynamic("Maximum")(Maximum.asInstanceOf[js.Any])
    if (Minimum != null) __obj.updateDynamic("Minimum")(Minimum.asInstanceOf[js.Any])
    if (SampleCount != null) __obj.updateDynamic("SampleCount")(SampleCount.asInstanceOf[js.Any])
    if (Sum != null) __obj.updateDynamic("Sum")(Sum.asInstanceOf[js.Any])
    if (UniqueContributors != null) __obj.updateDynamic("UniqueContributors")(UniqueContributors.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleMetricDatapoint]
  }
}

