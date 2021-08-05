package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthResult extends StObject {
  
  /**
    * The policies and statements that allowed the specified action.
    */
  var allowed: js.UndefOr[Allowed] = js.undefined
  
  /**
    * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
    */
  var authDecision: js.UndefOr[AuthDecision] = js.undefined
  
  /**
    * Authorization information.
    */
  var authInfo: js.UndefOr[AuthInfo] = js.undefined
  
  /**
    * The policies and statements that denied the specified action.
    */
  var denied: js.UndefOr[Denied] = js.undefined
  
  /**
    * Contains any missing context values found while evaluating policy.
    */
  var missingContextValues: js.UndefOr[MissingContextValues] = js.undefined
}
object AuthResult {
  
  inline def apply(): AuthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthResult]
  }
  
  extension [Self <: AuthResult](x: Self) {
    
    inline def setAllowed(value: Allowed): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setAuthDecision(value: AuthDecision): Self = StObject.set(x, "authDecision", value.asInstanceOf[js.Any])
    
    inline def setAuthDecisionUndefined: Self = StObject.set(x, "authDecision", js.undefined)
    
    inline def setAuthInfo(value: AuthInfo): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthInfoUndefined: Self = StObject.set(x, "authInfo", js.undefined)
    
    inline def setDenied(value: Denied): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    inline def setDeniedUndefined: Self = StObject.set(x, "denied", js.undefined)
    
    inline def setMissingContextValues(value: MissingContextValues): Self = StObject.set(x, "missingContextValues", value.asInstanceOf[js.Any])
    
    inline def setMissingContextValuesUndefined: Self = StObject.set(x, "missingContextValues", js.undefined)
    
    inline def setMissingContextValuesVarargs(value: MissingContextValue*): Self = StObject.set(x, "missingContextValues", js.Array(value :_*))
  }
}
