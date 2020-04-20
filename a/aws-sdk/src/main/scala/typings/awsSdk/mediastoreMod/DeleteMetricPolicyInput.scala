package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMetricPolicyInput extends js.Object {
  /**
    * The name of the container that is associated with the metric policy that you want to delete.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteMetricPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricPolicyInput]
  }
}

