package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackPolicyInput extends js.Object {
  /**
    * The name or unique stack ID that is associated with the stack whose policy you want to get.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName = js.native
}

object GetStackPolicyInput {
  @scala.inline
  def apply(StackName: StackName): GetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackPolicyInput]
  }
  @scala.inline
  implicit class GetStackPolicyInputOps[Self <: GetStackPolicyInput] (val x: Self) extends AnyVal {
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
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
  }
  
}

