package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFirewallPolicyResponse extends StObject {
  
  /**
    * The policy for the specified firewall policy. 
    */
  var FirewallPolicy: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallPolicy] = js.undefined
  
  /**
    * The high-level properties of a firewall policy. This, along with the FirewallPolicy, define the policy. You can retrieve all objects for a firewall policy by calling DescribeFirewallPolicy. 
    */
  var FirewallPolicyResponse: typings.awsSdk.networkfirewallMod.FirewallPolicyResponse
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall policy. The token marks the state of the policy resource at the time of the request.  To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall policy again to get a current copy of it with current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken
}
object DescribeFirewallPolicyResponse {
  
  inline def apply(FirewallPolicyResponse: FirewallPolicyResponse, UpdateToken: UpdateToken): DescribeFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFirewallPolicyResponse]
  }
  
  extension [Self <: DescribeFirewallPolicyResponse](x: Self) {
    
    inline def setFirewallPolicy(value: FirewallPolicy): Self = StObject.set(x, "FirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = StObject.set(x, "FirewallPolicyResponse", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "FirewallPolicy", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
