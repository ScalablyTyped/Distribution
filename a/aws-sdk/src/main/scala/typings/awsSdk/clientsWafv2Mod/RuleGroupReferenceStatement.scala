package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn
  
  /**
    * Rules in the referenced rule group whose actions are set to Count.   Instead of this option, use RuleActionOverrides. It accepts any valid action setting, including Count. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ExcludedRules] = js.undefined
  
  /**
    * Action settings to use in the place of the rule actions that are configured inside the rule group. You specify one override for each rule whose action you want to change.  You can use overrides for testing, for example you can override all of rule actions to Count and then monitor the resulting count metrics to understand how the rule group would handle your web traffic. You can also permanently override some or all actions, to modify how the rule group manages your web traffic.
    */
  var RuleActionOverrides: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RuleActionOverrides] = js.undefined
}
object RuleGroupReferenceStatement {
  
  inline def apply(ARN: ResourceArn): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value*))
    
    inline def setRuleActionOverrides(value: RuleActionOverrides): Self = StObject.set(x, "RuleActionOverrides", value.asInstanceOf[js.Any])
    
    inline def setRuleActionOverridesUndefined: Self = StObject.set(x, "RuleActionOverrides", js.undefined)
    
    inline def setRuleActionOverridesVarargs(value: RuleActionOverride*): Self = StObject.set(x, "RuleActionOverrides", js.Array(value*))
  }
}
