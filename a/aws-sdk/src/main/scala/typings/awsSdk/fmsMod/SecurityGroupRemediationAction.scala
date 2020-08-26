package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupRemediationAction extends js.Object {
  /**
    * Brief description of the action that will be performed.
    */
  var Description: js.UndefOr[RemediationActionDescription] = js.native
  /**
    * Indicates if the current action is the default action.
    */
  var IsDefaultAction: js.UndefOr[Boolean] = js.native
  /**
    * The remediation action that will be performed.
    */
  var RemediationActionType: js.UndefOr[typings.awsSdk.fmsMod.RemediationActionType] = js.native
  /**
    * The final state of the rule specified in the ViolationTarget after it is remediated.
    */
  var RemediationResult: js.UndefOr[SecurityGroupRuleDescription] = js.native
}

object SecurityGroupRemediationAction {
  @scala.inline
  def apply(): SecurityGroupRemediationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRemediationAction]
  }
  @scala.inline
  implicit class SecurityGroupRemediationActionOps[Self <: SecurityGroupRemediationAction] (val x: Self) extends AnyVal {
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
    def setDescription(value: RemediationActionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIsDefaultAction(value: Boolean): Self = this.set("IsDefaultAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultAction: Self = this.set("IsDefaultAction", js.undefined)
    @scala.inline
    def setRemediationActionType(value: RemediationActionType): Self = this.set("RemediationActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediationActionType: Self = this.set("RemediationActionType", js.undefined)
    @scala.inline
    def setRemediationResult(value: SecurityGroupRuleDescription): Self = this.set("RemediationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediationResult: Self = this.set("RemediationResult", js.undefined)
  }
  
}

