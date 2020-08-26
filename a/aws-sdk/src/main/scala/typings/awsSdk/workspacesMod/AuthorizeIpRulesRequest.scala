package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeIpRulesRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  /**
    * The rules to add to the group.
    */
  var UserRules: IpRuleList = js.native
}

object AuthorizeIpRulesRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): AuthorizeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeIpRulesRequest]
  }
  @scala.inline
  implicit class AuthorizeIpRulesRequestOps[Self <: AuthorizeIpRulesRequest] (val x: Self) extends AnyVal {
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

