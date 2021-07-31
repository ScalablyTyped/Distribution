package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Virtual base for authenticators.
  */
trait Authenticator extends StObject {
  
  var password: String
  
  var username: String
}
object Authenticator {
  
  @scala.inline
  def apply(password: String, username: String): Authenticator = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticator]
  }
  
  @scala.inline
  implicit class AuthenticatorMutableBuilder[Self <: Authenticator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
