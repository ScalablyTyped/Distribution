package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallManagerStatement extends StObject {
  
  /**
    * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor name and the name of the rule group in this statement. You can retrieve the required names by calling ListAvailableManagedRuleGroups. You cannot nest a ManagedRuleGroupStatement, for example for use inside a NotStatement or OrStatement. It can only be referenced as a top-level statement within a rule.
    */
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupStatement] = js.undefined
  
  /**
    * A rule statement used to run the rules that are defined in a RuleGroup. To use this, create a rule group with your rules, then provide the ARN of the rule group in this statement. You cannot nest a RuleGroupReferenceStatement, for example for use inside a NotStatement or OrStatement. You can only use a rule group reference statement at the top level inside a web ACL. 
    */
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RuleGroupReferenceStatement] = js.undefined
}
object FirewallManagerStatement {
  
  inline def apply(): FirewallManagerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallManagerStatement]
  }
  
  extension [Self <: FirewallManagerStatement](x: Self) {
    
    inline def setManagedRuleGroupStatement(value: ManagedRuleGroupStatement): Self = StObject.set(x, "ManagedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupStatementUndefined: Self = StObject.set(x, "ManagedRuleGroupStatement", js.undefined)
    
    inline def setRuleGroupReferenceStatement(value: RuleGroupReferenceStatement): Self = StObject.set(x, "RuleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupReferenceStatementUndefined: Self = StObject.set(x, "RuleGroupReferenceStatement", js.undefined)
  }
}
