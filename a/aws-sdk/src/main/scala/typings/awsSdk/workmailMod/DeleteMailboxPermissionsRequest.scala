package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMailboxPermissionsRequest extends js.Object {
  /**
    * The identifier of the member (user or group)that owns the mailbox.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier of the member (user or group) for which to delete granted permissions.
    */
  var GranteeId: WorkMailIdentifier = js.native
  /**
    * The identifier of the organization under which the member (user or group) exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteMailboxPermissionsRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, GranteeId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], GranteeId = GranteeId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMailboxPermissionsRequest]
  }
  @scala.inline
  implicit class DeleteMailboxPermissionsRequestOps[Self <: DeleteMailboxPermissionsRequest] (val x: Self) extends AnyVal {
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
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGranteeId(value: WorkMailIdentifier): Self = this.set("GranteeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

