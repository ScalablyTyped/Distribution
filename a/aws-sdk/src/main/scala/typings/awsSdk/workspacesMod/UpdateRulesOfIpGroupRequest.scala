package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRulesOfIpGroupRequest extends StObject {
  
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId
  
  /**
    * One or more rules.
    */
  var UserRules: IpRuleList
}
object UpdateRulesOfIpGroupRequest {
  
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): UpdateRulesOfIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateRulesOfIpGroupRequestMutableBuilder[Self <: UpdateRulesOfIpGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRules(value: IpRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "UserRules", js.Array(value :_*))
  }
}
