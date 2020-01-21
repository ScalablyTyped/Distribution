package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightRuleReportOutput extends js.Object {
  /**
    * The sum of the values from all individual contributors that match the rule.
    */
  var AggregateValue: js.UndefOr[InsightRuleUnboundDouble] = js.native
  /**
    * Specifies whether this rule aggregates contributor data by COUNT or SUM.
    */
  var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic] = js.native
  /**
    * An approximate count of the unique contributors found by this rule in this time period.
    */
  var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong] = js.native
  /**
    * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys, each combination of values for the keys counts as a unique contributor.
    */
  var Contributors: js.UndefOr[InsightRuleContributors] = js.native
  /**
    * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify contributors. If the rule contains more than one key, then each unique combination of values for the keys is counted as a unique contributor.
    */
  var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels] = js.native
  /**
    * A time series of metric data points that matches the time period in the rule request.
    */
  var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints] = js.native
}

object GetInsightRuleReportOutput {
  @scala.inline
  def apply(
    AggregateValue: Int | Double = null,
    AggregationStatistic: InsightRuleAggregationStatistic = null,
    ApproximateUniqueCount: Int | Double = null,
    Contributors: InsightRuleContributors = null,
    KeyLabels: InsightRuleContributorKeyLabels = null,
    MetricDatapoints: InsightRuleMetricDatapoints = null
  ): GetInsightRuleReportOutput = {
    val __obj = js.Dynamic.literal()
    if (AggregateValue != null) __obj.updateDynamic("AggregateValue")(AggregateValue.asInstanceOf[js.Any])
    if (AggregationStatistic != null) __obj.updateDynamic("AggregationStatistic")(AggregationStatistic.asInstanceOf[js.Any])
    if (ApproximateUniqueCount != null) __obj.updateDynamic("ApproximateUniqueCount")(ApproximateUniqueCount.asInstanceOf[js.Any])
    if (Contributors != null) __obj.updateDynamic("Contributors")(Contributors.asInstanceOf[js.Any])
    if (KeyLabels != null) __obj.updateDynamic("KeyLabels")(KeyLabels.asInstanceOf[js.Any])
    if (MetricDatapoints != null) __obj.updateDynamic("MetricDatapoints")(MetricDatapoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightRuleReportOutput]
  }
}

