package typings.azureMsalNode

import typings.azureMsalCommon.distAuthorityAzureRegionConfigurationMod.AzureRegionConfiguration
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distResponseAuthorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import typings.azureMsalNode.anon.PartialBaseAuthRequest
import typings.azureMsalNode.distCacheNodeStorageMod.NodeStorage
import typings.azureMsalNode.distCacheTokenCacheMod.TokenCache
import typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion
import typings.azureMsalNode.distConfigConfigurationMod.Configuration
import typings.azureMsalNode.distConfigConfigurationMod.NodeConfiguration
import typings.azureMsalNode.distCryptoCryptoProviderMod.CryptoProvider
import typings.azureMsalNode.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalNode.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalNode.distRequestRefreshTokenRequestMod.RefreshTokenRequest
import typings.azureMsalNode.distRequestSilentFlowRequestMod.SilentFlowRequest
import typings.azureMsalNode.distRequestUsernamePasswordRequestMod.UsernamePasswordRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientClientApplicationMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-node/dist/client/ClientApplication", "ClientApplication")
  @js.native
  open class ClientApplication protected () extends StObject {
    /**
      * Constructor for the ClientApplication
      */
    /* protected */ def this(configuration: Configuration) = this()
    
    /**
      * Acquires a token by exchanging the Authorization Code received from the first step of OAuth2.0
      * Authorization Code flow.
      *
      * `getAuthCodeUrl(AuthorizationCodeUrlRequest)` can be used to create the URL for the first step of OAuth2.0
      * Authorization Code flow. Ensure that values for redirectUri and scopes in AuthorizationCodeUrlRequest and
      * AuthorizationCodeRequest are the same.
      */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    def acquireTokenByCode(request: AuthorizationCodeRequest, authCodePayLoad: AuthorizationCodePayload): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Acquires a token by exchanging the refresh token provided for a new set of tokens.
      *
      * This API is provided only for scenarios where you would like to migrate from ADAL to MSAL. Otherwise, it is
      * recommended that you use `acquireTokenSilent()` for silent scenarios. When using `acquireTokenSilent()`, MSAL will
      * handle the caching and refreshing of tokens automatically.
      */
    def acquireTokenByRefreshToken(request: RefreshTokenRequest): js.Promise[AuthenticationResult | Null] = js.native
    
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
    def acquireTokenByUsernamePassword(request: UsernamePasswordRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Acquires a token silently when a user specifies the account the token is requested for.
      *
      * This API expects the user to provide an account object and looks into the cache to retrieve the token if present.
      * There is also an optional "forceRefresh" boolean the user can send to bypass the cache for access_token and id_token.
      * In case the refresh_token is expired or not found, an error is thrown
      * and the guidance is for the user to call any interactive token acquisition API (eg: `acquireTokenByCode()`).
      */
    def acquireTokenSilent(request: SilentFlowRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Builds the common configuration to be passed to the common component based on the platform configurarion
      * @param authority - user passed authority in configuration
      * @param serverTelemetryManager - initializes servertelemetry if passed
      */
    /* protected */ def buildOauthClientConfiguration(authority: String): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(authority: String, requestCorrelationId: String): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: AzureRegionConfiguration
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: AzureRegionConfiguration,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(authority: String, requestCorrelationId: String, serverTelemetryManager: ServerTelemetryManager): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: AzureRegionConfiguration
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: String,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: AzureRegionConfiguration,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: AzureRegionConfiguration
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: Unit,
      azureRegionConfiguration: AzureRegionConfiguration,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(authority: String, requestCorrelationId: Unit, serverTelemetryManager: ServerTelemetryManager): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: AzureRegionConfiguration
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def buildOauthClientConfiguration(
      authority: String,
      requestCorrelationId: Unit,
      serverTelemetryManager: ServerTelemetryManager,
      azureRegionConfiguration: AzureRegionConfiguration,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    
    /**
      * Clear the cache
      */
    def clearCache(): Unit = js.native
    
    /**
      * Client assertion passed by the user for confidential client flows
      */
    /* protected */ var clientAssertion: ClientAssertion = js.native
    
    /**
      * Client secret passed by the user for confidential client flows
      */
    /* protected */ var clientSecret: String = js.native
    
    /**
      * Platform configuration initialized by the application
      */
    /* protected */ var config: NodeConfiguration = js.native
    
    /**
      * Create authority instance. If authority not passed in request, default to authority set on the application
      * object. If no authority set in application object, then default to common authority.
      * @param authorityString - authority from user configuration
      */
    /* private */ var createAuthority: Any = js.native
    
    /* protected */ val cryptoProvider: CryptoProvider = js.native
    
    /**
      * Creates the URL of the authorization request, letting the user input credentials and consent to the
      * application. The URL targets the /authorize endpoint of the authority configured in the
      * application object.
      *
      * Once the user inputs their credentials and consents, the authority will send a response to the redirect URI
      * sent in the request and should contain an authorization code, which can then be used to acquire tokens via
      * `acquireTokenByCode(AuthorizationCodeRequest)`.
      */
    def getAuthCodeUrl(request: AuthorizationUrlRequest): js.Promise[String] = js.native
    
    /* private */ var getClientAssertion: Any = js.native
    
    /**
      * Returns the logger instance
      */
    def getLogger(): Logger = js.native
    
    /**
      * Gets the token cache for the application.
      */
    def getTokenCache(): TokenCache = js.native
    
    /**
      * Generates a request with the default scopes & generates a correlationId.
      * @param authRequest - BaseAuthRequest for initialization
      */
    /* protected */ def initializeBaseRequest(authRequest: PartialBaseAuthRequest): js.Promise[BaseAuthRequest] = js.native
    
    /**
      * Initializes the server telemetry payload
      * @param apiId - Id for a specific request
      * @param correlationId - GUID
      * @param forceRefresh - boolean to indicate network call
      */
    /* protected */ def initializeServerTelemetryManager(apiId: Double, correlationId: String): ServerTelemetryManager = js.native
    /* protected */ def initializeServerTelemetryManager(apiId: Double, correlationId: String, forceRefresh: Boolean): ServerTelemetryManager = js.native
    
    /**
      * Logger object to log the application flow
      */
    /* protected */ var logger: Logger = js.native
    
    /**
      * Replaces the default logger set in configurations with new Logger with new configurations
      * @param logger - Logger instance
      */
    def setLogger(logger: Logger): Unit = js.native
    
    /**
      * Platform storage object
      */
    /* protected */ var storage: NodeStorage = js.native
    
    /* private */ var tokenCache: Any = js.native
    
    /**
      * Validates OIDC state by comparing the user cached state with the state received from the server.
      *
      * This API is provided for scenarios where you would use OAuth2.0 state parameter to mitigate against
      * CSRF attacks.
      * For more information about state, visit https://datatracker.ietf.org/doc/html/rfc6819#section-3.6.
      * @param state
      * @param cachedState
      */
    /* protected */ def validateState(state: String, cachedState: String): Unit = js.native
  }
}
