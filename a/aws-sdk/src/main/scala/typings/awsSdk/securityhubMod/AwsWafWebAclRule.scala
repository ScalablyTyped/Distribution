package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafWebAclRule extends StObject {
  
  /**
    * Specifies the action that CloudFront or WAF takes when a web request matches the conditions in the rule. 
    */
  var Action: js.UndefOr[WafAction] = js.undefined
  
  /**
    * Rules to exclude from a rule group.
    */
  var ExcludedRules: js.UndefOr[WafExcludedRuleList] = js.undefined
  
  /**
    * Use the OverrideAction to test your RuleGroup. Any rule in a RuleGroup can potentially block a request. If you set the OverrideAction to None, the RuleGroup blocks a request if any individual rule in the RuleGroup matches the request and is configured to block that request. However, if you first want to test the RuleGroup, set the OverrideAction to Count. The RuleGroup then overrides any block action specified by individual rules contained within the group. Instead of blocking matching requests, those requests are counted.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a web ACL. In this case you do not use ActivatedRule Action. For all other update requests, ActivatedRule Action is used instead of ActivatedRule OverrideAction.
    */
  var OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined
  
  /**
    * Specifies the order in which the rules in a web ACL are evaluated. Rules with a lower value for Priority are evaluated before rules with a higher value. The value must be a unique integer. If you add multiple rules to a web ACL, the values do not need to be consecutive.
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The identifier for a rule.
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The rule type. Valid values: REGULAR | RATE_BASED | GROUP  The default is REGULAR.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafWebAclRule {
  
  inline def apply(): AwsWafWebAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclRule]
  }
  
  extension [Self <: AwsWafWebAclRule](x: Self) {
    
    inline def setAction(value: WafAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setExcludedRules(value: WafExcludedRuleList): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: WafExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value*))
    
    inline def setOverrideAction(value: WafOverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
