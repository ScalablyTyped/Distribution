package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMemberFromGroupRequest extends js.Object {
  /**
    * The identifier for the group from which members are removed.
    */
  var GroupId: WorkMailIdentifier = js.native
  /**
    * The identifier for the member to be removed to the group.
    */
  var MemberId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DisassociateMemberFromGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, MemberId: WorkMailIdentifier, OrganizationId: OrganizationId): DisassociateMemberFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberFromGroupRequest]
  }
  @scala.inline
  implicit class DisassociateMemberFromGroupRequestOps[Self <: DisassociateMemberFromGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupId(value: WorkMailIdentifier): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberId(value: WorkMailIdentifier): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

