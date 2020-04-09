package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricToRetain extends js.Object {
  /**
    * What is measured by the behavior.
    */
  var metric: BehaviorMetric = js.native
  /**
    * The dimension of a metric.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.native
}

object MetricToRetain {
  @scala.inline
  def apply(metric: BehaviorMetric, metricDimension: MetricDimension = null): MetricToRetain = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any])
    if (metricDimension != null) __obj.updateDynamic("metricDimension")(metricDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricToRetain]
  }
}

