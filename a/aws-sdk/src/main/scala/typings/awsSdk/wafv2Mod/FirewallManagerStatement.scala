package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallManagerStatement extends js.Object {
  
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
  implicit class FirewallManagerStatementOps[Self <: FirewallManagerStatement] (val x: Self) extends AnyVal {
    
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
    def setManagedRuleGroupStatement(value: ManagedRuleGroupStatement): Self = this.set("ManagedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedRuleGroupStatement: Self = this.set("ManagedRuleGroupStatement", js.undefined)
    
    @scala.inline
    def setRuleGroupReferenceStatement(value: RuleGroupReferenceStatement): Self = this.set("RuleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroupReferenceStatement: Self = this.set("RuleGroupReferenceStatement", js.undefined)
  }
}
