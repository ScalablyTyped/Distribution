package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallManagerRuleGroup extends js.Object {
  /**
    * The processing guidance for an AWS Firewall Manager rule. This is like a regular rule Statement, but it can only contain a rule group reference.
    */
  var FirewallManagerStatement: typings.awsSdk.wafv2Mod.FirewallManagerStatement = js.native
  /**
    * The name of the rule group. You cannot change the name of a rule group after you create it.
    */
  var Name: EntityName = js.native
  var OverrideAction: typings.awsSdk.wafv2Mod.OverrideAction = js.native
  /**
    * If you define more than one rule group in the first or last Firewall Manager rule groups, AWS WAF evaluates each request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority = js.native
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object FirewallManagerRuleGroup {
  @scala.inline
  def apply(
    FirewallManagerStatement: FirewallManagerStatement,
    Name: EntityName,
    OverrideAction: OverrideAction,
    Priority: RulePriority,
    VisibilityConfig: VisibilityConfig
  ): FirewallManagerRuleGroup = {
    val __obj = js.Dynamic.literal(FirewallManagerStatement = FirewallManagerStatement.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OverrideAction = OverrideAction.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallManagerRuleGroup]
  }
  @scala.inline
  implicit class FirewallManagerRuleGroupOps[Self <: FirewallManagerRuleGroup] (val x: Self) extends AnyVal {
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
    def setFirewallManagerStatement(value: FirewallManagerStatement): Self = this.set("FirewallManagerStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideAction(value: OverrideAction): Self = this.set("OverrideAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: RulePriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = this.set("VisibilityConfig", value.asInstanceOf[js.Any])
  }
  
}

