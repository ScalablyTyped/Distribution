package typings.azureMsalNode

import typings.azureMsalCommon.distConfigAppTokenProviderMod.IAppTokenProvider
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typings.azureMsalNode.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalNode.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalNode.distRequestClientCredentialRequestMod.ClientCredentialRequest
import typings.azureMsalNode.distRequestOnBehalfOfRequestMod.OnBehalfOfRequest
import typings.azureMsalNode.distRequestRefreshTokenRequestMod.RefreshTokenRequest
import typings.azureMsalNode.distRequestSilentFlowRequestMod.SilentFlowRequest
import typings.azureMsalNode.distRequestUsernamePasswordRequestMod.UsernamePasswordRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientIconfidentialclientapplicationMod {
  
  trait IConfidentialClientApplication extends StObject {
    
    /** This extensibility point is meant for Azure SDK to enhance Managed Identity support */
    def SetAppTokenProvider(provider: IAppTokenProvider): Unit
    
    /** Acquires tokens from the authority for the application (not for an end user) */
    def acquireTokenByClientCredential(request: ClientCredentialRequest): js.Promise[AuthenticationResult | Null]
    
    /**  Acquires a token by exchanging the authorization code received from the first step of OAuth 2.0 Authorization Code Flow */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult]
    
    /** Acquires a token by exchanging the refresh token provided for a new set of tokens */
    def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens with password grant by exchanging client applications username and password for credentials */
    def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null]
    
    /** Acquires tokens from the authority for the application */
    def acquireTokenOnBehalfOf(request: OnBehalfOfRequest): js.Promise[AuthenticationResult | Null]
    
    /**  Acquires a token silently when a user specifies the account the token is requested for */
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
  object IConfidentialClientApplication {
    
    inline def apply(
      SetAppTokenProvider: IAppTokenProvider => Unit,
      acquireTokenByClientCredential: ClientCredentialRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByCode: AuthorizationCodeRequest => js.Promise[AuthenticationResult],
      acquireTokenByRefreshToken: RefreshTokenRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenByUsernamePassword: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenOnBehalfOf: OnBehalfOfRequest => js.Promise[AuthenticationResult | Null],
      acquireTokenSilent: SilentFlowRequest => js.Promise[AuthenticationResult | Null],
      clearCache: () => Unit,
      getAuthCodeUrl: AuthorizationUrlRequest => js.Promise[String],
      getLogger: () => Logger,
      getTokenCache: () => TokenCache,
      setLogger: Logger => Unit
    ): IConfidentialClientApplication = {
      val __obj = js.Dynamic.literal(SetAppTokenProvider = js.Any.fromFunction1(SetAppTokenProvider), acquireTokenByClientCredential = js.Any.fromFunction1(acquireTokenByClientCredential), acquireTokenByCode = js.Any.fromFunction1(acquireTokenByCode), acquireTokenByRefreshToken = js.Any.fromFunction1(acquireTokenByRefreshToken), acquireTokenByUsernamePassword = js.Any.fromFunction1(acquireTokenByUsernamePassword), acquireTokenOnBehalfOf = js.Any.fromFunction1(acquireTokenOnBehalfOf), acquireTokenSilent = js.Any.fromFunction1(acquireTokenSilent), clearCache = js.Any.fromFunction0(clearCache), getAuthCodeUrl = js.Any.fromFunction1(getAuthCodeUrl), getLogger = js.Any.fromFunction0(getLogger), getTokenCache = js.Any.fromFunction0(getTokenCache), setLogger = js.Any.fromFunction1(setLogger))
      __obj.asInstanceOf[IConfidentialClientApplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfidentialClientApplication] (val x: Self) extends AnyVal {
      
      inline def setAcquireTokenByClientCredential(value: ClientCredentialRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByClientCredential", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByCode(value: AuthorizationCodeRequest => js.Promise[AuthenticationResult]): Self = StObject.set(x, "acquireTokenByCode", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByRefreshToken(value: RefreshTokenRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByRefreshToken", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenByUsernamePassword(value: UsernamePasswordRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenByUsernamePassword", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenOnBehalfOf(value: OnBehalfOfRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenOnBehalfOf", js.Any.fromFunction1(value))
      
      inline def setAcquireTokenSilent(value: SilentFlowRequest => js.Promise[AuthenticationResult | Null]): Self = StObject.set(x, "acquireTokenSilent", js.Any.fromFunction1(value))
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setGetAuthCodeUrl(value: AuthorizationUrlRequest => js.Promise[String]): Self = StObject.set(x, "getAuthCodeUrl", js.Any.fromFunction1(value))
      
      inline def setGetLogger(value: () => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction0(value))
      
      inline def setGetTokenCache(value: () => TokenCache): Self = StObject.set(x, "getTokenCache", js.Any.fromFunction0(value))
      
      inline def setSetAppTokenProvider(value: IAppTokenProvider => Unit): Self = StObject.set(x, "SetAppTokenProvider", js.Any.fromFunction1(value))
      
      inline def setSetLogger(value: Logger => Unit): Self = StObject.set(x, "setLogger", js.Any.fromFunction1(value))
    }
  }
}
