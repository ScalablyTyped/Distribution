package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthGateway extends StObject {
  
  def connectUrl(urlRequest: OAuthConnectUrlRequest): String
  
  def createTokenFromCode(request: OAuthCreateTokenFromCodeRequest): js.Promise[ValidatedResponse[OAuthToken]]
  
  def createTokenFromRefreshToken(request: OAuthCreateTokenFromRefreshTokenRequest): js.Promise[ValidatedResponse[OAuthToken]]
  
  def revokeAccessToken(accessToken: String): js.Promise[ValidatedResponse[Unit]]
}
object OAuthGateway {
  
  inline def apply(
    connectUrl: OAuthConnectUrlRequest => String,
    createTokenFromCode: OAuthCreateTokenFromCodeRequest => js.Promise[ValidatedResponse[OAuthToken]],
    createTokenFromRefreshToken: OAuthCreateTokenFromRefreshTokenRequest => js.Promise[ValidatedResponse[OAuthToken]],
    revokeAccessToken: String => js.Promise[ValidatedResponse[Unit]]
  ): OAuthGateway = {
    val __obj = js.Dynamic.literal(connectUrl = js.Any.fromFunction1(connectUrl), createTokenFromCode = js.Any.fromFunction1(createTokenFromCode), createTokenFromRefreshToken = js.Any.fromFunction1(createTokenFromRefreshToken), revokeAccessToken = js.Any.fromFunction1(revokeAccessToken))
    __obj.asInstanceOf[OAuthGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthGateway] (val x: Self) extends AnyVal {
    
    inline def setConnectUrl(value: OAuthConnectUrlRequest => String): Self = StObject.set(x, "connectUrl", js.Any.fromFunction1(value))
    
    inline def setCreateTokenFromCode(value: OAuthCreateTokenFromCodeRequest => js.Promise[ValidatedResponse[OAuthToken]]): Self = StObject.set(x, "createTokenFromCode", js.Any.fromFunction1(value))
    
    inline def setCreateTokenFromRefreshToken(value: OAuthCreateTokenFromRefreshTokenRequest => js.Promise[ValidatedResponse[OAuthToken]]): Self = StObject.set(x, "createTokenFromRefreshToken", js.Any.fromFunction1(value))
    
    inline def setRevokeAccessToken(value: String => js.Promise[ValidatedResponse[Unit]]): Self = StObject.set(x, "revokeAccessToken", js.Any.fromFunction1(value))
  }
}
