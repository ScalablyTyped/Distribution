package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartConfigRulesEvaluationRequest extends StObject {
  
  /**
    * The list of names of AWS Config rules that you want to run evaluations for.
    */
  var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.native
}
object StartConfigRulesEvaluationRequest {
  
  @scala.inline
  def apply(): StartConfigRulesEvaluationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartConfigRulesEvaluationRequest]
  }
  
  @scala.inline
  implicit class StartConfigRulesEvaluationRequestMutableBuilder[Self <: StartConfigRulesEvaluationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleNames(value: ReevaluateConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value :_*))
  }
}
