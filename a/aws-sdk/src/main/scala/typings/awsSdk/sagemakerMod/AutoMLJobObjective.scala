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
}

