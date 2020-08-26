package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMitigationActionResponse extends js.Object {
  /**
    * The ARN that identifies this migration action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * A unique identifier for this action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.native
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * Parameters that control how the mitigation action is applied, specific to the type of mitigation action.
    */
  var actionParams: js.UndefOr[MitigationActionParams] = js.native
  /**
    * The type of mitigation action.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.native
  /**
    * The date and time when the mitigation action was added to your AWS account.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time when the mitigation action was last changed.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the IAM role used to apply this action.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object DescribeMitigationActionResponse {
  @scala.inline
  def apply(): DescribeMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMitigationActionResponse]
  }
  @scala.inline
  implicit class DescribeMitigationActionResponseOps[Self <: DescribeMitigationActionResponse] (val x: Self) extends AnyVal {
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
    def setActionArn(value: MitigationActionArn): Self = this.set("actionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionArn: Self = this.set("actionArn", js.undefined)
    @scala.inline
    def setActionId(value: MitigationActionId): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    @scala.inline
    def setActionName(value: MitigationActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    @scala.inline
    def setActionParams(value: MitigationActionParams): Self = this.set("actionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionParams: Self = this.set("actionParams", js.undefined)
    @scala.inline
    def setActionType(value: MitigationActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

