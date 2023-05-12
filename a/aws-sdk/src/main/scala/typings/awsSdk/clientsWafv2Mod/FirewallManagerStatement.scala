package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallManagerStatement extends StObject {
  
  /**
    * A statement used by Firewall Manager to run the rules that are defined in a managed rule group. This is managed by Firewall Manager for an Firewall Manager WAF policy.
    */
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ManagedRuleGroupStatement] = js.undefined
  
  /**
    * A statement used by Firewall Manager to run the rules that are defined in a rule group. This is managed by Firewall Manager for an Firewall Manager WAF policy.
    */
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RuleGroupReferenceStatement] = js.undefined
}
object FirewallManagerStatement {
  
  inline def apply(): FirewallManagerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallManagerStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallManagerStatement] (val x: Self) extends AnyVal {
    
    inline def setManagedRuleGroupStatement(value: ManagedRuleGroupStatement): Self = StObject.set(x, "ManagedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupStatementUndefined: Self = StObject.set(x, "ManagedRuleGroupStatement", js.undefined)
    
    inline def setRuleGroupReferenceStatement(value: RuleGroupReferenceStatement): Self = StObject.set(x, "RuleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupReferenceStatementUndefined: Self = StObject.set(x, "RuleGroupReferenceStatement", js.undefined)
  }
}
