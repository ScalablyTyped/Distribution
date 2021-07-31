package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.Credentials> */
trait CredentialsOptions extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var authorizationCode: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  
  var expiration: js.UndefOr[Double] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var tokenUrl: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object CredentialsOptions {
  
  @scala.inline
  def apply(): CredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialsOptions]
  }
  
  @scala.inline
  implicit class CredentialsOptionsMutableBuilder[Self <: CredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[CredentialsOptions] => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
