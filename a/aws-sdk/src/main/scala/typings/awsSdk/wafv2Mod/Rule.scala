package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The action that AWS WAF should take on a web request when it matches the rule statement. Settings at the web ACL level can override the rule action setting.  This is used only for rules whose statements do not reference a rule group. Rule statements that reference a rule group include RuleGroupReferenceStatement and ManagedRuleGroupStatement.  You must specify either this Action setting or the rule OverrideAction setting, but not both:   If the rule statement does not reference a rule group, use this rule action setting and not the rule override action setting.    If the rule statement references a rule group, use the override action setting and not this action setting.   
    */
  var Action: js.UndefOr[RuleAction] = js.native
  /**
    * The name of the rule. You can't change the name of a Rule after you create it. 
    */
  var Name: EntityName = js.native
  /**
    * The override action to apply to the rules in a rule group. Used only for rule statements that reference a rule group, like RuleGroupReferenceStatement and ManagedRuleGroupStatement.  Set the override action to none to leave the rule actions in effect. Set it to count to only count matches, regardless of the rule action settings.  In a Rule, you must specify either this OverrideAction setting or the rule Action setting, but not both:   If the rule statement references a rule group, use this override action setting and not the action setting.    If the rule statement does not reference a rule group, use the rule action setting and not this rule override action setting.   
    */
  var OverrideAction: js.UndefOr[typings.awsSdk.wafv2Mod.OverrideAction] = js.native
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. AWS WAF processes rules with lower priority first. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority = js.native
  /**
    * The AWS WAF processing statement for the rule, for example ByteMatchStatement or SizeConstraintStatement. 
    */
  var Statement: typings.awsSdk.wafv2Mod.Statement = js.native
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object Rule {
  @scala.inline
  def apply(Name: EntityName, Priority: RulePriority, Statement: Statement, VisibilityConfig: VisibilityConfig): Rule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
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
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: RulePriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement(value: Statement): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = this.set("VisibilityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: RuleAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setOverrideAction(value: OverrideAction): Self = this.set("OverrideAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideAction: Self = this.set("OverrideAction", js.undefined)
  }
  
}

