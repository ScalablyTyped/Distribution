package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSamplingRuleRequest extends StObject {
  
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}
object DeleteSamplingRuleRequest {
  
  inline def apply(): DeleteSamplingRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSamplingRuleRequest]
  }
  
  extension [Self <: DeleteSamplingRuleRequest](x: Self) {
    
    inline def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
    
    inline def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
    
    inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
  }
}
