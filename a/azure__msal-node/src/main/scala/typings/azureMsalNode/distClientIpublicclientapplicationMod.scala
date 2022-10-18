package typings.azureMsalNode

import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typings.azureMsalNode.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalNode.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalNode.distRequestDeviceCodeRequestMod.DeviceCodeRequest
import typings.azureMsalNode.distRequestInteractiveRequestMod.InteractiveRequest
import typings.azureMsalNode.distRequestRefreshTokenRequestMod.RefreshTokenRequest
import typings.azureMsalNode.distRequestSilentFlowRequestMod.SilentFlowRequest
import typings.azureMsalNode.distRequestUsernamePasswordRequestMod.UsernamePasswordRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientIpublicclientapplicationMod {
  
  trait IPublicClientApplication extends StObject {
    
    /** Acquires a token by exchanging the authorization code received from the first step of OAuth 2.0 Authorization Code Flow */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token from the authority using OAuth2.0 device code flow */
    def acquireTokenByDeviceCode(request: DeviceCodeRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires a token by exchanging the refresh token provided for a new set of tokens */
    def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens with password grant by exchanging client applications username and password for credentials */
    def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires a token interactively */
    def acquireTokenInteractive(request: InteractiveRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token silently when a user specifies the account the token is requested for */
    def acquireTokenSilent(request: SilentFlowRequest): js.Promise[AuthenticationResult | Null]
    
    /** Clear the cache */
    def clearCache(): Unit
    
    /** Creates the URL of the authorization request */
    def getAuthCodeUrl(request: AuthorizationUrlRequest): js.Promise[String]
    
    /** Returns the logger instance */
    def getLogger(): Logger
    
    /** Gets the token cache for the application */
    def getTokenCache(): TokenCache
    
    /** Replaces the default logger set in configurations with new Logger with new configurations */
    def setLogger(logger: Logger): Unit
  }
  object IPublicClientApplication {
    
    inline def apply(
      acquireTokenByCode: AuthorizationCodeRequest => js.Promise[AuthenticationResult],
      acquireTokenByDeviceCode: DeviceCodeRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByRefreshToken: RefreshTokenRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByUsernamePassword: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenInteractive: InteractiveRequest => js.Promise[AuthenticationResult],
      acquireTokenSilent: SilentFlowRequest => js.Promise[AuthenticationResult | Null],
      clearCache: () => Unit,
      getAuthCodeUrl: AuthorizationUrlRequest => js.Promise[String],
      getLogger: () => Logger,
      getTokenCache: () => TokenCache,
      setLogger: Logger => Unit
    ): IPublicClientApplication = {
      val __obj = js.Dynamic.literal(acquireTokenByCode = js.Any.fromFunction1(acquireTokenByCode), acquireTokenByDeviceCode = js.Any.fromFunction1(acquireTokenByDeviceCode), acquireTokenByRefreshToken = js.Any.fromFunction1(acquireTokenByRefreshToken), acquireTokenByUsernamePassword = js.Any.fromFunction1(acquireTokenByUsernamePassword), acquireTokenInteractive = js.Any.fromFunction1(acquireTokenInteractive), acquireTokenSilent = js.Any.fromFunction1(acquireTokenSilent), clearCache = js.Any.fromFunction0(clearCache), getAuthCodeUrl = js.Any.fromFunction1(getAuthCodeUrl), getLogger = js.Any.fromFunction0(getLogger), getTokenCache = js.Any.fromFunction0(getTokenCache), setLogger = js.Any.fromFunction1(setLogger))
      __obj.asInstanceOf[IPublicClientApplication]
    }
    
    extension [Self <: IPublicClientApplication](x: Self) {
      
      inline def setAcquireTokenByCode(value: AuthorizationCodeRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenByCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByDeviceCode(value: DeviceCodeRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByDeviceCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByRefreshToken(value: RefreshTokenRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByRefreshToken", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByUsernamePassword(value: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByUsernamePassword", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenInteractive(value: InteractiveRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenInteractive", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenSilent(value: SilentFlowRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenSilent", js.Any.fromFunction1(value))
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setGetAuthCodeUrl(value: AuthorizationUrlRequest => js.Promise[String]): Self = StObject.set(x, "getAuthCodeUrl", js.Any.fromFunction1(value))
      
      inline def setGetLogger(value: () => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction0(value))
      
      inline def setGetTokenCache(value: () => TokenCache): Self = StObject.set(x, "getTokenCache", js.Any.fromFunction0(value))
      
      inline def setSetLogger(value: Logger => Unit): Self = StObject.set(x, "setLogger", js.Any.fromFunction1(value))
    }
  }
}
