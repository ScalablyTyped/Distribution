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
  def apply(
    InviteePrincipalId: IdType = null,
    PrincipalId: IdType = null,
    Role: RoleType = null,
    ShareId: ResourceIdType = null,
    Status: ShareStatusType = null,
    StatusMessage: MessageType = null
  ): ShareResult = {
    val __obj = js.Dynamic.literal()
    if (InviteePrincipalId != null) __obj.updateDynamic("InviteePrincipalId")(InviteePrincipalId.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (ShareId != null) __obj.updateDynamic("ShareId")(ShareId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareResult]
  }
}

