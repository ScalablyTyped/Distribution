package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationMetric extends js.Object {
  /**
    * The name of the utilization metric.  Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  /**
    * The statistic of the utilization metric.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}

object UtilizationMetric {
  @scala.inline
  def apply(name: MetricName = null, statistic: MetricStatistic = null, value: Int | Double = null): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (statistic != null) __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilizationMetric]
  }
}

