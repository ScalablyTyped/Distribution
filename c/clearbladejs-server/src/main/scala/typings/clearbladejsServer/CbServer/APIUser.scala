package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIUser extends StObject {
  
  var authToken: String = js.native
  
  var email: String = js.native
  
  var user_id: js.UndefOr[String] = js.native
}
object APIUser {
  
  @scala.inline
  def apply(authToken: String, email: String): APIUser = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIUser]
  }
  
  @scala.inline
  implicit class APIUserMutableBuilder[Self <: APIUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
