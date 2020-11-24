package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class RevokeIpRulesRequestOps[Self <: RevokeIpRulesRequest] (val x: Self) extends AnyVal {
    
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
    def setUserRulesVarargs(value: IpRule*): Self = this.set("UserRules", js.Array(value :_*))
    
    @scala.inline
    def setUserRules(value: IpRevokedRuleList): Self = this.set("UserRules", value.asInstanceOf[js.Any])
  }
}
