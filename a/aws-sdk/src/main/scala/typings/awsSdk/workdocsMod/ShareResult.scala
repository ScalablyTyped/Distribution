package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareResult extends js.Object {
  /**
    * The ID of the invited user.
    */
  var InviteePrincipalId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the principal.
    */
  var PrincipalId: js.UndefOr[IdType] = js.native
  /**
    * The role.
    */
  var Role: js.UndefOr[RoleType] = js.native
  /**
    * The ID of the resource that was shared.
    */
  var ShareId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[ShareStatusType] = js.native
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[MessageType] = js.native
}

object ShareResult {
  @scala.inline
  def apply(): ShareResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareResult]
  }
  @scala.inline
  implicit class ShareResultOps[Self <: ShareResult] (val x: Self) extends AnyVal {
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
    def setInviteePrincipalId(value: IdType): Self = this.set("InviteePrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteePrincipalId: Self = this.set("InviteePrincipalId", js.undefined)
    @scala.inline
    def setPrincipalId(value: IdType): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    @scala.inline
    def setRole(value: RoleType): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    @scala.inline
    def setShareId(value: ResourceIdType): Self = this.set("ShareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareId: Self = this.set("ShareId", js.undefined)
    @scala.inline
    def setStatus(value: ShareStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: MessageType): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

