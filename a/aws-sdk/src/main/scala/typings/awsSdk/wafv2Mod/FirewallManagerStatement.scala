package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallManagerStatement extends StObject {
  
  var ManagedRuleGroupStatement: js.UndefOr[typings.awsSdk.wafv2Mod.ManagedRuleGroupStatement] = js.native
  
  var RuleGroupReferenceStatement: js.UndefOr[typings.awsSdk.wafv2Mod.RuleGroupReferenceStatement] = js.native
}
object FirewallManagerStatement {
  
  @scala.inline
  def apply(): FirewallManagerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallManagerStatement]
  }
  
  @scala.inline
  implicit class FirewallManagerStatementMutableBuilder[Self <: FirewallManagerStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedRuleGroupStatement(value: ManagedRuleGroupStatement): Self = StObject.set(x, "ManagedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedRuleGroupStatementUndefined: Self = StObject.set(x, "ManagedRuleGroupStatement", js.undefined)
    
    @scala.inline
    def setRuleGroupReferenceStatement(value: RuleGroupReferenceStatement): Self = StObject.set(x, "RuleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupReferenceStatementUndefined: Self = StObject.set(x, "RuleGroupReferenceStatement", js.undefined)
  }
}
