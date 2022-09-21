package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFirewallRuleGroupPolicyRequest extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the rule group that you want to share.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn
  
  /**
    * The Identity and Access Management (Amazon Web Services IAM) policy to attach to the rule group.
    */
  var FirewallRuleGroupPolicy: typings.awsSdk.route53resolverMod.FirewallRuleGroupPolicy
}
object PutFirewallRuleGroupPolicyRequest {
  
  inline def apply(Arn: Arn, FirewallRuleGroupPolicy: FirewallRuleGroupPolicy): PutFirewallRuleGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], FirewallRuleGroupPolicy = FirewallRuleGroupPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFirewallRuleGroupPolicyRequest]
  }
  
  extension [Self <: PutFirewallRuleGroupPolicyRequest](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupPolicy(value: FirewallRuleGroupPolicy): Self = StObject.set(x, "FirewallRuleGroupPolicy", value.asInstanceOf[js.Any])
  }
}
