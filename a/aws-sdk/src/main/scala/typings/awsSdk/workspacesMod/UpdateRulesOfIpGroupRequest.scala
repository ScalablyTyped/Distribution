package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRulesOfIpGroupRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  /**
    * One or more rules.
    */
  var UserRules: IpRuleList = js.native
}

object UpdateRulesOfIpGroupRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): UpdateRulesOfIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
  }
}

