package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupMembershipResponse extends js.Object {
  /**
    * The group member.
    */
  var GroupMember: js.UndefOr[typings.awsSdk.quicksightMod.GroupMember] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateGroupMembershipResponse {
  @scala.inline
  def apply(
    GroupMember: GroupMember = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): CreateGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMember != null) __obj.updateDynamic("GroupMember")(GroupMember.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupMembershipResponse]
  }
}

