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
  @scala.inline
  implicit class PutContainerPolicyInputOps[Self <: PutContainerPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerName(value: ContainerName): Self = this.set("ContainerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: ContainerPolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
  }
  
}

