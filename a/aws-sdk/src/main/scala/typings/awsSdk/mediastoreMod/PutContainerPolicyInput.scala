package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutContainerPolicyInput extends js.Object {
  /**
    * The name of the container.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  /**
    * The contents of the policy, which includes the following:    One Version tag   One Statement tag that contains the standard tags for the policy.  
    */
  var Policy: ContainerPolicy = js.native
}

object PutContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, Policy: ContainerPolicy): PutContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContainerPolicyInput]
  }
}

