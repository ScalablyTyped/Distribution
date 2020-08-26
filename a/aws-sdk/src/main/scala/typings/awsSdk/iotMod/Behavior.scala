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
  def apply(name: BehaviorName): Behavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  @scala.inline
  implicit class BehaviorOps[Self <: Behavior] (val x: Self) extends AnyVal {
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
    def setName(value: BehaviorName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCriteria(value: BehaviorCriteria): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setMetric(value: BehaviorMetric): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setMetricDimension(value: MetricDimension): Self = this.set("metricDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricDimension: Self = this.set("metricDimension", js.undefined)
  }
  
}

