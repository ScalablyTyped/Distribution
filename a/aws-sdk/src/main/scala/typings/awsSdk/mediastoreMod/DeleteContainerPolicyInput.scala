package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContainerPolicyInput extends js.Object {
  /**
    * The name of the container that holds the policy.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteContainerPolicyInput]
  }
}

