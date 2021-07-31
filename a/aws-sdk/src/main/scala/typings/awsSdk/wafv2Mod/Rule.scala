package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The action that AWS WAF should take on a web request when it matches the rule statement. Settings at the web ACL level can override the rule action setting.  This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule group include RuleGroupReferenceStatement and ManagedRuleGroupStatement.  You must specify either this Action setting or the rule OverrideAction setting, but not both:   If the rule statement does not reference a rule group, use this rule action setting and not the rule override action setting.    If the rule statement references a rule group, use the override action setting and not this action setting.   
    */
  var Action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The name of the rule. You can't change the name of a Rule after you create it. 
    */
  var Name: EntityName
  
  /**
    * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule group, like RuleGroupReferenceStatement and ManagedRuleGroupStatement.  Set the override action to none to leave the rule actions in effect. Set it to count to only count matches, regardless of the rule action settings.  In a Rule, you must specify either this OverrideAction setting or the rule Action setting, but not both:   If the rule statement references a rule group, use this override action setting and not the action setting.    If the rule statement does not reference a rule group, use the rule action setting and not this rule override action setting.   
    */
  var OverrideAction: js.UndefOr[typings.awsSdk.wafv2Mod.OverrideAction] = js.undefined
  
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. AWS WAF processes rules with lower priority first. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority
  
  /**
    * The AWS WAF processing statement for the rule, for example ByteMatchStatement or SizeConstraintStatement. 
    */
  var Statement: typings.awsSdk.wafv2Mod.Statement
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig
}
object Rule {
  
  @scala.inline
  def apply(Name: EntityName, Priority: RulePriority, Statement: Statement, VisibilityConfig: VisibilityConfig): Rule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAction(value: OverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    @scala.inline
    def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
