package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// auth
trait User extends StObject {
  
  var claims: js.Array[js.Any]
  
  def getIdentity(provider: String): Thenable[js.Any]
  
  var id: String
  
  var token: String
}
object User {
  
  @scala.inline
  def apply(claims: js.Array[js.Any], getIdentity: String => Thenable[js.Any], id: String, token: String): User = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], getIdentity = js.Any.fromFunction1(getIdentity), id = id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaims(value: js.Array[js.Any]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsVarargs(value: js.Any*): Self = StObject.set(x, "claims", js.Array(value :_*))
    
    @scala.inline
    def setGetIdentity(value: String => Thenable[js.Any]): Self = StObject.set(x, "getIdentity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
