package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that holds the object lifecycle policy.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyInput]
  }
}

