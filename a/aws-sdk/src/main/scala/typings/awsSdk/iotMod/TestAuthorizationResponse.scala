package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAuthorizationResponse extends StObject {
  
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.undefined
}
object TestAuthorizationResponse {
  
  inline def apply(): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
  
  extension [Self <: TestAuthorizationResponse](x: Self) {
    
    inline def setAuthResults(value: AuthResults): Self = StObject.set(x, "authResults", value.asInstanceOf[js.Any])
    
    inline def setAuthResultsUndefined: Self = StObject.set(x, "authResults", js.undefined)
    
    inline def setAuthResultsVarargs(value: AuthResult*): Self = StObject.set(x, "authResults", js.Array(value :_*))
  }
}
