package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerPolicyOutput extends js.Object {
  /**
    * The contents of the access policy.
    */
  var Policy: ContainerPolicy = js.native
}

object GetContainerPolicyOutput {
  @scala.inline
  def apply(Policy: ContainerPolicy): GetContainerPolicyOutput = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyOutput]
  }
  @scala.inline
  implicit class GetContainerPolicyOutputOps[Self <: GetContainerPolicyOutput] (val x: Self) extends AnyVal {
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
    def setPolicy(value: ContainerPolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
  }
  
}

