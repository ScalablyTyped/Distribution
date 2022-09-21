package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL level can override the rule action setting.  This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule group include RuleGroupReferenceStatement and ManagedRuleGroupStatement.  You must specify either this Action setting or the rule OverrideAction setting, but not both:   If the rule statement does not reference a rule group, use this rule action setting and not the rule override action setting.    If the rule statement references a rule group, use the override action setting and not this action setting.   
    */
  var Action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * Specifies how WAF should handle CAPTCHA evaluations. If you don't specify this, WAF uses the CAPTCHA configuration that's defined for the web ACL. 
    */
  var CaptchaConfig: js.UndefOr[typings.awsSdk.wafv2Mod.CaptchaConfig] = js.undefined
  
  /**
    * The name of the rule. You can't change the name of a Rule after you create it. 
    */
  var Name: EntityName
  
  /**
    * The action to use in the place of the action that results from the rule group evaluation. Set the override action to none to leave the result of the rule group alone. Set it to count to override the result to count only.  You can only use this for rule statements that reference a rule group, like RuleGroupReferenceStatement and ManagedRuleGroupStatement.   This option is usually set to none. It does not affect how the rules in the rule group are evaluated. If you want the rules in the rule group to only count matches, do not use this and instead exclude those rules in your rule group reference statement settings.  
    */
  var OverrideAction: js.UndefOr[typings.awsSdk.wafv2Mod.OverrideAction] = js.undefined
  
  /**
    * If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the value of Priority. WAF processes rules with lower priority first. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority
  
  /**
    * Labels to apply to web requests that match the rule match statement. WAF applies fully qualified labels to matching web requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web ACL defines the label namespace.  Rules that run after this rule in the web ACL can match against these labels using a LabelMatchStatement. For each label, provide a case-sensitive string containing optional namespaces and a label name, according to the following guidelines:   Separate each component of the label with a colon.    Each namespace or name can have up to 128 characters.   You can specify up to 5 namespaces in a label.   Don't use the following reserved words in your label specification: aws, waf, managed, rulegroup, webacl, regexpatternset, or ipset.   For example, myLabelName or nameSpace1:nameSpace2:myLabelName. 
    */
  var RuleLabels: js.UndefOr[Labels] = js.undefined
  
  /**
    * The WAF processing statement for the rule, for example ByteMatchStatement or SizeConstraintStatement. 
    */
  var Statement: typings.awsSdk.wafv2Mod.Statement
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig
}
object Rule {
  
  inline def apply(Name: EntityName, Priority: RulePriority, Statement: Statement, VisibilityConfig: VisibilityConfig): Rule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setCaptchaConfig(value: CaptchaConfig): Self = StObject.set(x, "CaptchaConfig", value.asInstanceOf[js.Any])
    
    inline def setCaptchaConfigUndefined: Self = StObject.set(x, "CaptchaConfig", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOverrideAction(value: OverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRuleLabels(value: Labels): Self = StObject.set(x, "RuleLabels", value.asInstanceOf[js.Any])
    
    inline def setRuleLabelsUndefined: Self = StObject.set(x, "RuleLabels", js.undefined)
    
    inline def setRuleLabelsVarargs(value: Label*): Self = StObject.set(x, "RuleLabels", js.Array(value*))
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
