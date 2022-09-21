package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileDeviceAccessEffectResponse extends StObject {
  
  /**
    * The effect of the simulated access, ALLOW or DENY, after evaluating mobile device access rules in the Amazon WorkMail organization for the simulated user parameters.
    */
  var Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined
  
  /**
    * A list of the rules which matched the simulated user input and produced the effect.
    */
  var MatchedRules: js.UndefOr[MobileDeviceAccessMatchedRuleList] = js.undefined
}
object GetMobileDeviceAccessEffectResponse {
  
  inline def apply(): GetMobileDeviceAccessEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMobileDeviceAccessEffectResponse]
  }
  
  extension [Self <: GetMobileDeviceAccessEffectResponse](x: Self) {
    
    inline def setEffect(value: MobileDeviceAccessRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setMatchedRules(value: MobileDeviceAccessMatchedRuleList): Self = StObject.set(x, "MatchedRules", value.asInstanceOf[js.Any])
    
    inline def setMatchedRulesUndefined: Self = StObject.set(x, "MatchedRules", js.undefined)
    
    inline def setMatchedRulesVarargs(value: MobileDeviceAccessMatchedRule*): Self = StObject.set(x, "MatchedRules", js.Array(value*))
  }
}
