package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupPolicyResponse extends StObject {
  
  /**
    * The Identity and Access Management (Amazon Web Services IAM) policy for sharing the specified rule group. You can use the policy to share the rule group using Resource Access Manager (RAM). 
    */
  var FirewallRuleGroupPolicy: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallRuleGroupPolicy] = js.undefined
}
object GetFirewallRuleGroupPolicyResponse {
  
  inline def apply(): GetFirewallRuleGroupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallRuleGroupPolicyResponse]
  }
  
  extension [Self <: GetFirewallRuleGroupPolicyResponse](x: Self) {
    
    inline def setFirewallRuleGroupPolicy(value: FirewallRuleGroupPolicy): Self = StObject.set(x, "FirewallRuleGroupPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupPolicyUndefined: Self = StObject.set(x, "FirewallRuleGroupPolicy", js.undefined)
  }
}
