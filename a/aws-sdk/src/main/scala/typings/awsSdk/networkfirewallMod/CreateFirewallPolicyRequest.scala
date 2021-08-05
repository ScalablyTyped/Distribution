package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallPolicyRequest extends StObject {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the request.  If set to TRUE, Network Firewall checks whether the request can run successfully, but doesn't actually make the requested changes. The call returns the value that the request would return if you ran it with dry run set to FALSE, but doesn't make additions or changes to your resources. This option allows you to make sure that you have the required permissions to run the request and that your request parameters are valid.  If set to FALSE, Network Firewall makes the requested changes to your resources. 
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rule groups and policy actions to use in the firewall policy.
    */
  var FirewallPolicy: typings.awsSdk.networkfirewallMod.FirewallPolicy
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var FirewallPolicyName: ResourceName
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFirewallPolicyRequest {
  
  inline def apply(FirewallPolicy: FirewallPolicy, FirewallPolicyName: ResourceName): CreateFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal(FirewallPolicy = FirewallPolicy.asInstanceOf[js.Any], FirewallPolicyName = FirewallPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallPolicyRequest]
  }
  
  extension [Self <: CreateFirewallPolicyRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFirewallPolicy(value: FirewallPolicy): Self = StObject.set(x, "FirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
