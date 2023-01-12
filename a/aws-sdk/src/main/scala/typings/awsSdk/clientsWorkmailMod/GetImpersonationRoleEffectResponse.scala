package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImpersonationRoleEffectResponse extends StObject {
  
  /**
    *  Effect of the impersonation role on the target user based on its rules. Available effects are ALLOW or DENY.
    */
  var Effect: js.UndefOr[AccessEffect] = js.undefined
  
  /**
    * A list of the rules that match the input and produce the configured effect.
    */
  var MatchedRules: js.UndefOr[ImpersonationMatchedRuleList] = js.undefined
  
  /**
    * The impersonation role type.
    */
  var Type: js.UndefOr[ImpersonationRoleType] = js.undefined
}
object GetImpersonationRoleEffectResponse {
  
  inline def apply(): GetImpersonationRoleEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImpersonationRoleEffectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImpersonationRoleEffectResponse] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: AccessEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setMatchedRules(value: ImpersonationMatchedRuleList): Self = StObject.set(x, "MatchedRules", value.asInstanceOf[js.Any])
    
    inline def setMatchedRulesUndefined: Self = StObject.set(x, "MatchedRules", js.undefined)
    
    inline def setMatchedRulesVarargs(value: ImpersonationMatchedRule*): Self = StObject.set(x, "MatchedRules", js.Array(value*))
    
    inline def setType(value: ImpersonationRoleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
