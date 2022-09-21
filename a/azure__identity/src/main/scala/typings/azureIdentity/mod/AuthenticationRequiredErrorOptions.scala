package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.GetTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationRequiredErrorOptions extends StObject {
  
  /**
    * The options passed to the getToken request.
    */
  var getTokenOptions: js.UndefOr[GetTokenOptions] = js.undefined
  
  /**
    * The message of the error.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The list of scopes for which the token will have access.
    */
  var scopes: js.Array[String]
}
object AuthenticationRequiredErrorOptions {
  
  inline def apply(scopes: js.Array[String]): AuthenticationRequiredErrorOptions = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRequiredErrorOptions]
  }
  
  extension [Self <: AuthenticationRequiredErrorOptions](x: Self) {
    
    inline def setGetTokenOptions(value: GetTokenOptions): Self = StObject.set(x, "getTokenOptions", value.asInstanceOf[js.Any])
    
    inline def setGetTokenOptionsUndefined: Self = StObject.set(x, "getTokenOptions", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
