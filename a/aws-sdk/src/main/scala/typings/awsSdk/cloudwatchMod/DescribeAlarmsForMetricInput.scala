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
  def apply(MetricName: MetricName, Namespace: Namespace): DescribeAlarmsForMetricInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricInput]
  }
  @scala.inline
  implicit class DescribeAlarmsForMetricInputOps[Self <: DescribeAlarmsForMetricInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setExtendedStatistic(value: ExtendedStatistic): Self = this.set("ExtendedStatistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedStatistic: Self = this.set("ExtendedStatistic", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("Period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    @scala.inline
    def setStatistic(value: Statistic): Self = this.set("Statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistic: Self = this.set("Statistic", js.undefined)
    @scala.inline
    def setUnit(value: StandardUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

