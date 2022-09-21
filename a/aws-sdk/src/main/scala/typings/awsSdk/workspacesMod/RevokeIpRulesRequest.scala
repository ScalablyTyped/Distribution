package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeIpRulesRequest extends StObject {
  
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId
  
  /**
    * The rules to remove from the group.
    */
  var UserRules: IpRevokedRuleList
}
object RevokeIpRulesRequest {
  
  inline def apply(GroupId: IpGroupId, UserRules: IpRevokedRuleList): RevokeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeIpRulesRequest]
  }
  
  extension [Self <: RevokeIpRulesRequest](x: Self) {
    
    inline def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setUserRules(value: IpRevokedRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    inline def setUserRulesVarargs(value: IpRule*): Self = StObject.set(x, "UserRules", js.Array(value*))
  }
}
