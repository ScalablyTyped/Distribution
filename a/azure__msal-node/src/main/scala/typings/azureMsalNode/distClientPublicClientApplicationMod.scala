package typings.azureMsalNode

import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typings.azureMsalNode.distClientClientApplicationMod.ClientApplication
import typings.azureMsalNode.distClientIpublicclientapplicationMod.IPublicClientApplication
import typings.azureMsalNode.distConfigConfigurationMod.Configuration
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

object distClientPublicClientApplicationMod {
  
  @JSImport("@azure/msal-node/dist/client/PublicClientApplication", "PublicClientApplication")
  @js.native
  open class PublicClientApplication protected ()
    extends ClientApplication
       with IPublicClientApplication {
    /**
      * Important attributes in the Configuration object for auth are:
      * - clientID: the application ID of your application. You can obtain one by registering your application with our Application registration portal.
      * - authority: the authority URL for your application.
      *
      * AAD authorities are of the form https://login.microsoftonline.com/\{Enter_the_Tenant_Info_Here\}.
      * - If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
      * - If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
      * - If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
      * - To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
      *
      * Azure B2C authorities are of the form https://\{instance\}/\{tenant\}/\{policy\}. Each policy is considered
      * its own authority. You will have to set the all of the knownAuthorities at the time of the client application
      * construction.
      *
      * ADFS authorities are of the form https://\{instance\}/adfs.
      */
    def this(configuration: Configuration) = this()
    
    /**
      * Acquires a token by exchanging the Authorization Code received from the first step of OAuth2.0
      * Authorization Code flow.
      *
      * `getAuthCodeUrl(AuthorizationCodeUrlRequest)` can be used to create the URL for the first step of OAuth2.0
      * Authorization Code flow. Ensure that values for redirectUri and scopes in AuthorizationCodeUrlRequest and
      * AuthorizationCodeRequest are the same.
      */
    /* InferMemberOverrides */
    override def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    /** Acquires a token from the authority using OAuth2.0 device code flow */
    /* CompleteClass */
    override def acquireTokenByDeviceCode(request: DeviceCodeRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Acquires a token by exchanging the refresh token provided for a new set of tokens.
      *
      * This API is provided only for scenarios where you would like to migrate from ADAL to MSAL. Otherwise, it is
      * recommended that you use `acquireTokenSilent()` for silent scenarios. When using `acquireTokenSilent()`, MSAL will
      * handle the caching and refreshing of tokens automatically.
      */
    /* InferMemberOverrides */
    override def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Acquires tokens with password grant by exchanging client applications username and password for credentials
      *
      * The latest OAuth 2.0 Security Best Current Practice disallows the password grant entirely.
      * More details on this recommendation at https://tools.ietf.org/html/draft-ietf-oauth-security-topics-13#section-3.4
      * Microsoft's documentation and recommendations are at:
      * https://docs.microsoft.com/en-us/azure/active-directory/develop/msal-authentication-flows#usernamepassword
      *
      * @param request - UsenamePasswordRequest
      */
    /* InferMemberOverrides */
    override def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /** Acquires a token interactively */
    /* CompleteClass */
    override def acquireTokenInteractive(request: InteractiveRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Acquires a token silently when a user specifies the account the token is requested for.
      *
      * This API expects the user to provide an account object and looks into the cache to retrieve the token if present.
      * There is also an optional "forceRefresh" boolean the user can send to bypass the cache for access_token and id_token.
      * In case the refresh_token is expired or not found, an error is thrown
      * and the guidance is for the user to call any interactive token acquisition API (eg: `acquireTokenByCode()`).
      */
    /* InferMemberOverrides */
    override def acquireTokenSilent(request: SilentFlowRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Clear the cache
      */
    /* InferMemberOverrides */
    override def clearCache(): Unit = js.native
    
    /**
      * Creates the URL of the authorization request, letting the user input credentials and consent to the
      * application. The URL targets the /authorize endpoint of the authority configured in the
      * application object.
      *
      * Once the user inputs their credentials and consents, the authority will send a response to the redirect URI
      * sent in the request and should contain an authorization code, which can then be used to acquire tokens via
      * `acquireTokenByCode(AuthorizationCodeRequest)`.
      */
    /* InferMemberOverrides */
    override def getAuthCodeUrl(request: AuthorizationUrlRequest): js.Promise[String] = js.native
    
    /**
      * Returns the logger instance
      */
    /* InferMemberOverrides */
    override def getLogger(): Logger = js.native
    
    /**
      * Gets the token cache for the application.
      */
    /* InferMemberOverrides */
    override def getTokenCache(): TokenCache = js.native
    
    /**
      * Replaces the default logger set in configurations with new Logger with new configurations
      * @param logger - Logger instance
      */
    /* InferMemberOverrides */
    override def setLogger(logger: Logger): Unit = js.native
  }
}
