package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// auth
trait User extends StObject {
  
  var claims: js.Array[Any]
  
  def getIdentity(provider: String): Thenable[Any]
  
  var id: String
  
  var token: String
}
object User {
  
  inline def apply(claims: js.Array[Any], getIdentity: String => Thenable[Any], id: String, token: String): User = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], getIdentity = js.Any.fromFunction1(getIdentity), id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setClaims(value: js.Array[Any]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsVarargs(value: Any*): Self = StObject.set(x, "claims", js.Array(value*))
    
    inline def setGetIdentity(value: String => Thenable[Any]): Self = StObject.set(x, "getIdentity", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
