package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFirewallPolicyResponse extends StObject {
  
  /**
    * The high-level properties of a firewall policy. This, along with the FirewallPolicy, define the policy. You can retrieve all objects for a firewall policy by calling DescribeFirewallPolicy. 
    */
  var FirewallPolicyResponse: typings.awsSdk.networkfirewallMod.FirewallPolicyResponse = js.native
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall policy. The token marks the state of the policy resource at the time of the request.  To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall policy again to get a current copy of it with current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken = js.native
}
object UpdateFirewallPolicyResponse {
  
  @scala.inline
  def apply(FirewallPolicyResponse: FirewallPolicyResponse, UpdateToken: UpdateToken): UpdateFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallPolicyResponse]
  }
  
  @scala.inline
  implicit class UpdateFirewallPolicyResponseMutableBuilder[Self <: UpdateFirewallPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = StObject.set(x, "FirewallPolicyResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
