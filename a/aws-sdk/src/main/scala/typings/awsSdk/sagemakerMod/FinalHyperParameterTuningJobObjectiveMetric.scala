package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
  /**
    * The name of the objective metric.
    */
  var MetricName: typings.awsSdk.sagemakerMod.MetricName = js.native
  /**
    * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.native
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue = js.native
}

object FinalHyperParameterTuningJobObjectiveMetric {
  @scala.inline
  def apply(MetricName: MetricName, Value: MetricValue, Type: HyperParameterTuningJobObjectiveType = null): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
}

