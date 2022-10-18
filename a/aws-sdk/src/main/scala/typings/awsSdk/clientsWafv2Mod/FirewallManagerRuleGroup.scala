package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallManagerRuleGroup extends StObject {
  
  /**
    * The processing guidance for an Firewall Manager rule. This is like a regular rule Statement, but it can only contain a rule group reference.
    */
  var FirewallManagerStatement: typings.awsSdk.clientsWafv2Mod.FirewallManagerStatement
  
  /**
    * The name of the rule group. You cannot change the name of a rule group after you create it.
    */
  var Name: EntityName
  
  /**
    * The action to use in the place of the action that results from the rule group evaluation. Set the override action to none to leave the result of the rule group alone. Set it to count to override the result to count only.  You can only use this for rule statements that reference a rule group, like RuleGroupReferenceStatement and ManagedRuleGroupStatement.   This option is usually set to none. It does not affect how the rules in the rule group are evaluated. If you want the rules in the rule group to only count matches, do not use this and instead exclude those rules in your rule group reference statement settings.  
    */
  var OverrideAction: typings.awsSdk.clientsWafv2Mod.OverrideAction
  
  /**
    * If you define more than one rule group in the first or last Firewall Manager rule groups, WAF evaluates each request against the rule groups in order, starting from the lowest priority setting. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.clientsWafv2Mod.VisibilityConfig
}
object FirewallManagerRuleGroup {
  
  inline def apply(
    FirewallManagerStatement: FirewallManagerStatement,
    Name: EntityName,
    OverrideAction: OverrideAction,
    Priority: RulePriority,
    VisibilityConfig: VisibilityConfig
  ): FirewallManagerRuleGroup = {
    val __obj = js.Dynamic.literal(FirewallManagerStatement = FirewallManagerStatement.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OverrideAction = OverrideAction.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallManagerRuleGroup]
  }
  
  extension [Self <: FirewallManagerRuleGroup](x: Self) {
    
    inline def setFirewallManagerStatement(value: FirewallManagerStatement): Self = StObject.set(x, "FirewallManagerStatement", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOverrideAction(value: OverrideAction): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
