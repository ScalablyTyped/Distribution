package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallManagerStatement extends StObject {
  
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupStatement] = js.undefined
  
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
