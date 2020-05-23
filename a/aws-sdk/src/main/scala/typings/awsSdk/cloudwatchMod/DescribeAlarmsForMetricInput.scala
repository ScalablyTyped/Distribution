package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsForMetricInput extends js.Object {
  /**
    * The dimensions associated with the metric. If the metric has any associated dimensions, you must specify them in order for the call to succeed.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The percentile statistic for the metric. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: typings.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsSdk.cloudwatchMod.Period] = js.native
  /**
    * The statistic for the metric, other than percentiles. For percentile statistics, use ExtendedStatistics.
    */
  var Statistic: js.UndefOr[typings.awsSdk.cloudwatchMod.Statistic] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object DescribeAlarmsForMetricInput {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: Namespace,
    Dimensions: Dimensions = null,
    ExtendedStatistic: ExtendedStatistic = null,
    Period: js.UndefOr[Period] = js.undefined,
    Statistic: Statistic = null,
    Unit: StandardUnit = null
  ): DescribeAlarmsForMetricInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (ExtendedStatistic != null) __obj.updateDynamic("ExtendedStatistic")(ExtendedStatistic.asInstanceOf[js.Any])
    if (!js.isUndefined(Period)) __obj.updateDynamic("Period")(Period.get.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricInput]
  }
}

