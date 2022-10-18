package typings.awsSdk.clientsWorkspacesMod

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
  
  inline def apply(GroupId: IpGroupId, UserRules: IpRuleList): UpdateRulesOfIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
  }
  
  extension [Self <: UpdateRulesOfIpGroupRequest](x: Self) {
    
    inline def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setUserRules(value: IpRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    inline def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "UserRules", js.Array(value*))
  }
}
