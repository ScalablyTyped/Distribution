package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyFirewallFirewallPolicy extends StObject {
  
  /**
    * The ID of the specified firewall policy.
    */
  var FirewallPolicyId: js.UndefOr[typings.awsSdk.fmsMod.FirewallPolicyId] = js.undefined
  
  /**
    * The name of the specified firewall policy.
    */
  var FirewallPolicyName: js.UndefOr[typings.awsSdk.fmsMod.FirewallPolicyName] = js.undefined
}
object ThirdPartyFirewallFirewallPolicy {
  
  inline def apply(): ThirdPartyFirewallFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyFirewallFirewallPolicy]
  }
  
  extension [Self <: ThirdPartyFirewallFirewallPolicy](x: Self) {
    
    inline def setFirewallPolicyId(value: FirewallPolicyId): Self = StObject.set(x, "FirewallPolicyId", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyIdUndefined: Self = StObject.set(x, "FirewallPolicyId", js.undefined)
    
    inline def setFirewallPolicyName(value: FirewallPolicyName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyNameUndefined: Self = StObject.set(x, "FirewallPolicyName", js.undefined)
  }
}
