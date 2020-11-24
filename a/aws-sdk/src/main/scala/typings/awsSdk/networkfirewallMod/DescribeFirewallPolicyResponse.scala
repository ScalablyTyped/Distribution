package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFirewallPolicyResponse extends js.Object {
  
  /**
    * The policy for the specified firewall policy. 
    */
  var FirewallPolicy: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallPolicy] = js.native
  
  /**
    * The high-level properties of a firewall policy. This, along with the FirewallPolicy, define the policy. You can retrieve all objects for a firewall policy by calling DescribeFirewallPolicy. 
    */
  var FirewallPolicyResponse: typings.awsSdk.networkfirewallMod.FirewallPolicyResponse = js.native
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall policy. The token marks the state of the policy resource at the time of the request.  To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall policy again to get a current copy of it with current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken = js.native
}
object DescribeFirewallPolicyResponse {
  
  @scala.inline
  def apply(FirewallPolicyResponse: FirewallPolicyResponse, UpdateToken: UpdateToken): DescribeFirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyResponse = FirewallPolicyResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFirewallPolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeFirewallPolicyResponseOps[Self <: DescribeFirewallPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setFirewallPolicyResponse(value: FirewallPolicyResponse): Self = this.set("FirewallPolicyResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = this.set("UpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicy(value: FirewallPolicy): Self = this.set("FirewallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicy: Self = this.set("FirewallPolicy", js.undefined)
  }
}
