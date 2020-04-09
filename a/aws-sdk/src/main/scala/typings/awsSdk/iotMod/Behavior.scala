package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Behavior extends js.Object {
  /**
    * The criteria that determine if a device is behaving normally in regard to the metric.
    */
  var criteria: js.UndefOr[BehaviorCriteria] = js.native
  /**
    * What is measured by the behavior.
    */
  var metric: js.UndefOr[BehaviorMetric] = js.native
  /**
    * The dimension for a metric in your behavior. For example, using a TOPIC_FILTER dimension, you can narrow down the scope of the metric only to MQTT topics whose name match the pattern specified in the dimension.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.native
  /**
    * The name you have given to the behavior.
    */
  var name: BehaviorName = js.native
}

object Behavior {
  @scala.inline
  def apply(
    name: BehaviorName,
    criteria: BehaviorCriteria = null,
    metric: BehaviorMetric = null,
    metricDimension: MetricDimension = null
  ): Behavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (metricDimension != null) __obj.updateDynamic("metricDimension")(metricDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
}

