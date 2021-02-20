package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallManagerRuleGroup extends StObject {
  
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
  implicit class FirewallManagerRuleGroupMutableBuilder[Self <: FirewallManagerRuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallManagerStatement(value: FirewallManagerStatement): Self = StObject.set(x, "FirewallManagerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAction(value: OverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
