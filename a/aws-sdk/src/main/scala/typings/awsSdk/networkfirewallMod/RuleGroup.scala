package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroup extends StObject {
  
  /**
    * Settings that are available for use in the rules in the rule group. You can only use these for stateful rule groups. 
    */
  var RuleVariables: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleVariables] = js.undefined
  
  /**
    * The stateful rules or stateless rules for the rule group. 
    */
  var RulesSource: typings.awsSdk.networkfirewallMod.RulesSource
}
object RuleGroup {
  
  inline def apply(RulesSource: RulesSource): RuleGroup = {
    val __obj = js.Dynamic.literal(RulesSource = RulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  extension [Self <: RuleGroup](x: Self) {
    
    inline def setRuleVariables(value: RuleVariables): Self = StObject.set(x, "RuleVariables", value.asInstanceOf[js.Any])
    
    inline def setRuleVariablesUndefined: Self = StObject.set(x, "RuleVariables", js.undefined)
    
    inline def setRulesSource(value: RulesSource): Self = StObject.set(x, "RulesSource", value.asInstanceOf[js.Any])
  }
}
