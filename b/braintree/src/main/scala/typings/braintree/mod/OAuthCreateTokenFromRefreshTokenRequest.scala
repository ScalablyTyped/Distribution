package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthCreateTokenFromRefreshTokenRequest extends StObject {
  
  var refreshToken: String = js.native
}
object OAuthCreateTokenFromRefreshTokenRequest {
  
  @scala.inline
  def apply(refreshToken: String): OAuthCreateTokenFromRefreshTokenRequest = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromRefreshTokenRequest]
  }
  
  @scala.inline
  implicit class OAuthCreateTokenFromRefreshTokenRequestMutableBuilder[Self <: OAuthCreateTokenFromRefreshTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
  }
}
