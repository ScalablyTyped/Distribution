package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessRule extends js.Object {
  
  /**
    * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority setting. You must ensure that the priority settings are unique for the rule group.  Each stateless rule group uses exactly one StatelessRulesAndCustomActions object, and each StatelessRulesAndCustomActions contains exactly one StatelessRules object. To ensure unique priority settings for your rule groups, set unique priorities for the stateless rules that you define inside any single StatelessRules object. You can change the priority settings of your rules at any time. To make it easier to insert rules later, number them so there's a wide range in between, for example use 100, 200, and so on. 
    */
  var Priority: typings.awsSdk.networkfirewallMod.Priority = js.native
  
  /**
    * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. 
    */
  var RuleDefinition: typings.awsSdk.networkfirewallMod.RuleDefinition = js.native
}
object StatelessRule {
  
  @scala.inline
  def apply(Priority: Priority, RuleDefinition: RuleDefinition): StatelessRule = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], RuleDefinition = RuleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRule]
  }
  
  @scala.inline
  implicit class StatelessRuleOps[Self <: StatelessRule] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Priority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDefinition(value: RuleDefinition): Self = this.set("RuleDefinition", value.asInstanceOf[js.Any])
  }
}
