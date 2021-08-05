package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleGroupResponse extends StObject {
  
  /**
    * The high-level properties of a rule group. This, along with the RuleGroup, define the rule group. You can retrieve all objects for a rule group by calling DescribeRuleGroup. 
    */
  var RuleGroupResponse: typings.awsSdk.networkfirewallMod.RuleGroupResponse
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the rule group. The token marks the state of the rule group resource at the time of the request.  To make changes to the rule group, you provide the token in your request. Network Firewall uses the token to ensure that the rule group hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the rule group again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken
}
object UpdateRuleGroupResponse {
  
  inline def apply(RuleGroupResponse: RuleGroupResponse, UpdateToken: UpdateToken): UpdateRuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupResponse = RuleGroupResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleGroupResponse]
  }
  
  extension [Self <: UpdateRuleGroupResponse](x: Self) {
    
    inline def setRuleGroupResponse(value: RuleGroupResponse): Self = StObject.set(x, "RuleGroupResponse", value.asInstanceOf[js.Any])
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
