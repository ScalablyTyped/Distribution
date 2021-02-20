package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFirewallPolicyRequest extends StObject {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The updated firewall policy to use for the firewall. 
    */
  var FirewallPolicy: typings.awsSdk.networkfirewallMod.FirewallPolicy = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyName: js.UndefOr[ResourceName] = js.native
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall policy. The token marks the state of the policy resource at the time of the request.  To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall policy again to get a current copy of it with current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.networkfirewallMod.UpdateToken = js.native
}
object UpdateFirewallPolicyRequest {
  
  @scala.inline
  def apply(FirewallPolicy: FirewallPolicy, UpdateToken: UpdateToken): UpdateFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal(FirewallPolicy = FirewallPolicy.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallPolicyRequest]
  }
  
  @scala.inline
  implicit class UpdateFirewallPolicyRequestMutableBuilder[Self <: UpdateFirewallPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFirewallPolicy(value: FirewallPolicy): Self = StObject.set(x, "FirewallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyArnUndefined: Self = StObject.set(x, "FirewallPolicyArn", js.undefined)
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyNameUndefined: Self = StObject.set(x, "FirewallPolicyName", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
