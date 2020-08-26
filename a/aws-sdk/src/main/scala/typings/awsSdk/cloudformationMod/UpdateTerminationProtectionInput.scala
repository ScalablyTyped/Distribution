package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTerminationProtectionInput extends js.Object {
  /**
    * Whether to enable termination protection on the specified stack.
    */
  var EnableTerminationProtection: typings.awsSdk.cloudformationMod.EnableTerminationProtection = js.native
  /**
    * The name or unique ID of the stack for which you want to set termination protection.
    */
  var StackName: StackNameOrId = js.native
}

object UpdateTerminationProtectionInput {
  @scala.inline
  def apply(EnableTerminationProtection: EnableTerminationProtection, StackName: StackNameOrId): UpdateTerminationProtectionInput = {
    val __obj = js.Dynamic.literal(EnableTerminationProtection = EnableTerminationProtection.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTerminationProtectionInput]
  }
  @scala.inline
  implicit class UpdateTerminationProtectionInputOps[Self <: UpdateTerminationProtectionInput] (val x: Self) extends AnyVal {
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
    def setEnableTerminationProtection(value: EnableTerminationProtection): Self = this.set("EnableTerminationProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackName(value: StackNameOrId): Self = this.set("StackName", value.asInstanceOf[js.Any])
  }
  
}

