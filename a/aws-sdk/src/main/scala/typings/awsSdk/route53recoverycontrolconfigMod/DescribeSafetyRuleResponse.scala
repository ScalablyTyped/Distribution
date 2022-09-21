package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSafetyRuleResponse extends StObject {
  
  /**
    * The assertion rule in the response.
    */
  var AssertionRule: js.UndefOr[typings.awsSdk.route53recoverycontrolconfigMod.AssertionRule] = js.undefined
  
  /**
    * The gating rule in the response.
    */
  var GatingRule: js.UndefOr[typings.awsSdk.route53recoverycontrolconfigMod.GatingRule] = js.undefined
}
object DescribeSafetyRuleResponse {
  
  inline def apply(): DescribeSafetyRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSafetyRuleResponse]
  }
  
  extension [Self <: DescribeSafetyRuleResponse](x: Self) {
    
    inline def setAssertionRule(value: AssertionRule): Self = StObject.set(x, "AssertionRule", value.asInstanceOf[js.Any])
    
    inline def setAssertionRuleUndefined: Self = StObject.set(x, "AssertionRule", js.undefined)
    
    inline def setGatingRule(value: GatingRule): Self = StObject.set(x, "GatingRule", value.asInstanceOf[js.Any])
    
    inline def setGatingRuleUndefined: Self = StObject.set(x, "GatingRule", js.undefined)
  }
}
