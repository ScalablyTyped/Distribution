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
  @scala.inline
  implicit class UpdateRulesOfIpGroupRequestOps[Self <: UpdateRulesOfIpGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupId(value: IpGroupId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = this.set("UserRules", js.Array(value :_*))
    @scala.inline
    def setUserRules(value: IpRuleList): Self = this.set("UserRules", value.asInstanceOf[js.Any])
  }
  
}

