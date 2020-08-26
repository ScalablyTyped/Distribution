package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobObjective extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: AutoMLMetricEnum = js.native
}

object AutoMLJobObjective {
  @scala.inline
  def apply(MetricName: AutoMLMetricEnum): AutoMLJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobObjective]
  }
  @scala.inline
  implicit class AutoMLJobObjectiveOps[Self <: AutoMLJobObjective] (val x: Self) extends AnyVal {
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
    def setMetricName(value: AutoMLMetricEnum): Self = this.set("MetricName", value.asInstanceOf[js.Any])
  }
  
}

