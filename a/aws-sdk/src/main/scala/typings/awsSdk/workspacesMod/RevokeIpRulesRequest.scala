package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeIpRulesRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  /**
    * The rules to remove from the group.
    */
  var UserRules: IpRevokedRuleList = js.native
}

object RevokeIpRulesRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRevokedRuleList): RevokeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeIpRulesRequest]
  }
}

