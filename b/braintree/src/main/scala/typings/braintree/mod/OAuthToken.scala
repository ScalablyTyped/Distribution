package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthToken extends StObject {
  
  var accessToken: String = js.native
  
  var expiresAt: String = js.native
  
  var refreshToken: String = js.native
}
object OAuthToken {
  
  @scala.inline
  def apply(accessToken: String, expiresAt: String, refreshToken: String): OAuthToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthToken]
  }
  
  @scala.inline
  implicit class OAuthTokenMutableBuilder[Self <: OAuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
  }
}
