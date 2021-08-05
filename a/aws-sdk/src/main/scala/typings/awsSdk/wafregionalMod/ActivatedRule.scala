package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatedRule extends StObject {
  
  /**
    * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule. Valid values for Action include the following:    ALLOW: CloudFront responds with the requested object.    BLOCK: CloudFront responds with an HTTP 403 (Forbidden) status code.    COUNT: AWS WAF increments a counter of requests that match the conditions in the rule and then continues to inspect the web request based on the remaining rules in the web ACL.     ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
    */
  var Action: js.UndefOr[WafAction] = js.undefined
  
  /**
    * An array of rules to exclude from a rule group. This is applicable only when the ActivatedRule refers to a RuleGroup. Sometimes it is necessary to troubleshoot rule groups that are blocking traffic unexpectedly (false positives). One troubleshooting technique is to identify the specific rule within the rule group that is blocking the legitimate traffic and then disable (exclude) that particular rule. You can exclude rules from both your own rule groups and AWS Marketplace rule groups that have been associated with a web ACL. Specifying ExcludedRules does not remove those rules from the rule group. Rather, it changes the action for the rules to COUNT. Therefore, requests that match an ExcludedRule are counted but not blocked. The RuleGroup owner will receive COUNT metrics for each ExcludedRule. If you want to exclude rules from a rule group that is already associated with a web ACL, perform the following steps:   Use the AWS WAF logs to identify the IDs of the rules that you want to exclude. For more information about the logs, see Logging Web ACL Traffic Information.   Submit an UpdateWebACL request that has two actions:   The first action deletes the existing rule group from the web ACL. That is, in the UpdateWebACL request, the first Updates:Action should be DELETE and Updates:ActivatedRule:RuleId should be the rule group that contains the rules that you want to exclude.   The second action inserts the same rule group back in, but specifying the rules to exclude. That is, the second Updates:Action should be INSERT, Updates:ActivatedRule:RuleId should be the rule group that you just removed, and ExcludedRules should contain the rules that you want to exclude.    
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafregionalMod.ExcludedRules] = js.undefined
  
  /**
    * Use the OverrideAction to test your RuleGroup. Any rule in a RuleGroup can potentially block a request. If you set the OverrideAction to None, the RuleGroup will block a request if any individual rule in the RuleGroup matches the request and is configured to block that request. However if you first want to test the RuleGroup, set the OverrideAction to Count. The RuleGroup will then override any block action specified by individual rules contained within the group. Instead of blocking matching requests, those requests will be counted. You can view a record of counted requests using GetSampledRequests.   ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
    */
  var OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined
  
  /**
    * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a WebACL, the values don't need to be consecutive.
    */
  var Priority: RulePriority
  
  /**
    * The RuleId for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
  
  /**
    * The rule type, either REGULAR, as defined by Rule, RATE_BASED, as defined by RateBasedRule, or GROUP, as defined by RuleGroup. The default is REGULAR. Although this field is optional, be aware that if you try to add a RATE_BASED rule to a web ACL without setting the type, the UpdateWebACL request will fail because the request tries to add a REGULAR rule with the specified ID, which does not exist. 
    */
  var Type: js.UndefOr[WafRuleType] = js.undefined
}
object ActivatedRule {
  
  inline def apply(Priority: RulePriority, RuleId: ResourceId): ActivatedRule = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatedRule]
  }
  
  extension [Self <: ActivatedRule](x: Self) {
    
    inline def setAction(value: WafAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value :_*))
    
    inline def setOverrideAction(value: WafOverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: WafRuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
