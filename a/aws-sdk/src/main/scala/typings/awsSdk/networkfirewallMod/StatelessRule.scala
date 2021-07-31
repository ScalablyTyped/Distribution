package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessRule extends StObject {
  
  /**
    * A setting that indicates the order in which to run this rule relative to all of the rules that are defined for a stateless rule group. Network Firewall evaluates the rules in a rule group starting with the lowest priority setting. You must ensure that the priority settings are unique for the rule group.  Each stateless rule group uses exactly one StatelessRulesAndCustomActions object, and each StatelessRulesAndCustomActions contains exactly one StatelessRules object. To ensure unique priority settings for your rule groups, set unique priorities for the stateless rules that you define inside any single StatelessRules object. You can change the priority settings of your rules at any time. To make it easier to insert rules later, number them so there's a wide range in between, for example use 100, 200, and so on. 
    */
  var Priority: typings.awsSdk.networkfirewallMod.Priority
  
  /**
    * Defines the stateless 5-tuple packet inspection criteria and the action to take on a packet that matches the criteria. 
    */
  var RuleDefinition: typings.awsSdk.networkfirewallMod.RuleDefinition
}
object StatelessRule {
  
  @scala.inline
  def apply(Priority: Priority, RuleDefinition: RuleDefinition): StatelessRule = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], RuleDefinition = RuleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRule]
  }
  
  @scala.inline
  implicit class StatelessRuleMutableBuilder[Self <: StatelessRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDefinition(value: RuleDefinition): Self = StObject.set(x, "RuleDefinition", value.asInstanceOf[js.Any])
  }
}
