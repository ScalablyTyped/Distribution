package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartConfigRulesEvaluationRequest extends StObject {
  
  /**
    * The list of names of AWS Config rules that you want to run evaluations for.
    */
  var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined
}
object StartConfigRulesEvaluationRequest {
  
  inline def apply(): StartConfigRulesEvaluationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
  }
  
  extension [Self <: StartConfigRulesEvaluationRequest](x: Self) {
    
    inline def setConfigRuleNames(value: ReevaluateConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    inline def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
  }
}
