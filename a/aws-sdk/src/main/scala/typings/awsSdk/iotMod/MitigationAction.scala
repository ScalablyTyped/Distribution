package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationAction extends js.Object {
  /**
    * The set of parameters for this mitigation action. The parameters vary, depending on the kind of action you apply.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * A unique identifier for the mitigation action.
    */
  var id: js.UndefOr[MitigationActionId] = js.native
  /**
    * A user-friendly name for the mitigation action.
    */
  var name: js.UndefOr[MitigationActionName] = js.native
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object MitigationAction {
  @scala.inline
  def apply(): MitigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationAction]
  }
  @scala.inline
  implicit class MitigationActionOps[Self <: MitigationAction] (val x: Self) extends AnyVal {
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
    def setActionParams(value: MitigationActionParams): Self = this.set("actionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionParams: Self = this.set("actionParams", js.undefined)
    @scala.inline
    def setId(value: MitigationActionId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: MitigationActionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

