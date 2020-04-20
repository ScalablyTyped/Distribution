package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricPolicyOutput extends js.Object {
  /**
    * The metric policy that is associated with the specific container.
    */
  var MetricPolicy: typings.awsSdk.mediastoreMod.MetricPolicy = js.native
}

object GetMetricPolicyOutput {
  @scala.inline
  def apply(MetricPolicy: MetricPolicy): GetMetricPolicyOutput = {
    val __obj = js.Dynamic.literal(MetricPolicy = MetricPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricPolicyOutput]
  }
}

