package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthCredentials extends StObject {
  
  var password: String
  
  var username: String
}
object AuthCredentials {
  
  @scala.inline
  def apply(password: String, username: String): AuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCredentials]
  }
  
  @scala.inline
  implicit class AuthCredentialsMutableBuilder[Self <: AuthCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
