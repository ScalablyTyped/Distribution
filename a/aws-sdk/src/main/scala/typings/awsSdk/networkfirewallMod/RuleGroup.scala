package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroup extends StObject {
  
  /**
    * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule groups. 
    */
  var RuleVariables: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleVariables] = js.native
  
  /**
    * The stateful rules or stateless rules for the rule group. 
    */
  var RulesSource: typings.awsSdk.networkfirewallMod.RulesSource = js.native
}
object RuleGroup {
  
  @scala.inline
  def apply(RulesSource: RulesSource): RuleGroup = {
    val __obj = js.Dynamic.literal(RulesSource = RulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  @scala.inline
  implicit class RuleGroupMutableBuilder[Self <: RuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleVariables(value: RuleVariables): Self = StObject.set(x, "RuleVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVariablesUndefined: Self = StObject.set(x, "RuleVariables", js.undefined)
    
    @scala.inline
    def setRulesSource(value: RulesSource): Self = StObject.set(x, "RulesSource", value.asInstanceOf[js.Any])
  }
}
