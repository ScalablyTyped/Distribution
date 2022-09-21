package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationString extends StObject {
  
  var authorization: String
}
object AuthorizationString {
  
  inline def apply(authorization: String): AuthorizationString = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationString]
  }
  
  extension [Self <: AuthorizationString](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
  }
}
