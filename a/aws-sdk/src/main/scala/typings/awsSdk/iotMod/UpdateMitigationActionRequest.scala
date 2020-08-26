package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMitigationActionRequest extends js.Object {
  /**
    * The friendly name for the mitigation action. You can't change the name by using UpdateMitigationAction. Instead, you must delete and re-create the mitigation action with the new name.
    */
  var actionName: MitigationActionName = js.native
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object UpdateMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): UpdateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMitigationActionRequest]
  }
  @scala.inline
  implicit class UpdateMitigationActionRequestOps[Self <: UpdateMitigationActionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionName(value: MitigationActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionParams(value: MitigationActionParams): Self = this.set("actionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionParams: Self = this.set("actionParams", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

