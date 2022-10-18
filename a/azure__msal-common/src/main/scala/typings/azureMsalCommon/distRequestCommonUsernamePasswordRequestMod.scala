package typings.azureMsalCommon

import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonUsernamePasswordRequestMod {
  
  trait CommonUsernamePasswordRequest
    extends StObject
       with BaseAuthRequest {
    
    var password: String
    
    var username: String
  }
  object CommonUsernamePasswordRequest {
    
    inline def apply(
      authority: String,
      correlationId: String,
      password: String,
      scopes: js.Array[String],
      username: String
    ): CommonUsernamePasswordRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonUsernamePasswordRequest]
    }
    
    extension [Self <: CommonUsernamePasswordRequest](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
