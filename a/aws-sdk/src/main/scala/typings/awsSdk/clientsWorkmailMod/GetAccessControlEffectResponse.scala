package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessControlEffectResponse extends StObject {
  
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.undefined
  
  /**
    * The rules that match the given parameters, resulting in an effect.
    */
  var MatchedRules: js.UndefOr[AccessControlRuleNameList] = js.undefined
}
object GetAccessControlEffectResponse {
  
  inline def apply(): GetAccessControlEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessControlEffectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessControlEffectResponse] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: AccessControlRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setMatchedRules(value: AccessControlRuleNameList): Self = StObject.set(x, "MatchedRules", value.asInstanceOf[js.Any])
    
    inline def setMatchedRulesUndefined: Self = StObject.set(x, "MatchedRules", js.undefined)
    
    inline def setMatchedRulesVarargs(value: AccessControlRuleName*): Self = StObject.set(x, "MatchedRules", js.Array(value*))
  }
}
