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
}

