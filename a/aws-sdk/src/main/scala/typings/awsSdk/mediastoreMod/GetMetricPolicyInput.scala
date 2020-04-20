package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricPolicyInput extends js.Object {
  /**
    * The name of the container that is associated with the metric policy.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object GetMetricPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricPolicyInput]
  }
}

