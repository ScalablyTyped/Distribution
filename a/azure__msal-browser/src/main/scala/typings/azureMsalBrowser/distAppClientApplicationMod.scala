package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.PartialBaseAuthRequest
import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distCacheItokencacheMod.ITokenCache
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distConfigConfigurationMod.Configuration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distEventEventMessageMod.EventCallbackFunction
import typings.azureMsalBrowser.distInteractionClientPopupClientMod.PopupClient
import typings.azureMsalBrowser.distInteractionClientRedirectClientMod.RedirectClient
import typings.azureMsalBrowser.distInteractionClientSilentAuthCodeClientMod.SilentAuthCodeClient
import typings.azureMsalBrowser.distInteractionClientSilentCacheClientMod.SilentCacheClient
import typings.azureMsalBrowser.distInteractionClientSilentIframeClientMod.SilentIframeClient
import typings.azureMsalBrowser.distInteractionClientSilentRefreshClientMod.SilentRefreshClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalBrowser.distRequestEndSessionPopupRequestMod.EndSessionPopupRequest
import typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.WrapperSKU
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distRequestCommonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.PerformanceCallbackFunction
import typings.azureMsalCommon.mod.Logger
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppClientApplicationMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-browser/dist/app/ClientApplication", "ClientApplication")
  @js.native
  open class ClientApplication protected () extends StObject {
    /**
      * @constructor
      * Constructor for the PublicClientApplication used to instantiate the PublicClientApplication object
      *
      * Important attributes in the Configuration object for auth are:
      * - clientID: the application ID of your application. You can obtain one by registering your application with our Application registration portal : https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview
      * - authority: the authority URL for your application.
      * - redirect_uri: the uri of your application registered in the portal.
      *
      * In Azure AD, authority is a URL indicating the Azure active directory that MSAL uses to obtain tokens.
      * It is of the form https://login.microsoftonline.com/{Enter_the_Tenant_Info_Here}
      * If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
      * If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
      * If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
      * To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
      *
      * In Azure B2C, authority is of the form https://{instance}/tfp/{tenant}/{policyName}/
      * Full B2C functionality will be available in this library in future versions.
      *
      * @param configuration Object for the MSAL PublicClientApplication instance
      */
    def this(configuration: Configuration) = this()
    
    /**
      * This function redeems an authorization code (passed as code) from the eSTS token endpoint.
      * This authorization code should be acquired server-side using a confidential client to acquire a spa_code.
      * This API is not indended for normal authorization code acquisition and redemption.
      *
      * Redemption of this authorization code will not require PKCE, as it was acquired by a confidential client.
      *
      * @param request {@link AuthorizationCodeRequest}
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Creates a SilentAuthCodeClient to redeem an authorization code.
      * @param request
      * @returns Result of the operation to redeem the authorization code
      */
    /* private */ var acquireTokenByCodeAsync: Any = js.native
    
    /* private */ var acquireTokenByCodeAsyncMeasurement: Any = js.native
    
    /**
      * Attempt to acquire an access token via a refresh token
      * @param commonRequest CommonSilentFlowRequest
      * @param silentRequest SilentRequest
      * @returns A promise that, when resolved, returns the access token
      */
    /* protected */ def acquireTokenByRefreshToken(commonRequest: CommonSilentFlowRequest, silentRequest: SilentRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Attempt to acquire an access token via an iframe
      * @param request CommonSilentFlowRequest
      * @returns A promise that, when resolved, returns the access token
      */
    /* protected */ def acquireTokenBySilentIframe(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Attempt to acquire an access token from the cache
      * @param silentCacheClient SilentCacheClient
      * @param commonRequest CommonSilentFlowRequest
      * @param silentRequest SilentRequest
      * @returns A promise that, when resolved, returns the access token
      */
    /* protected */ def acquireTokenFromCache(
      silentCacheClient: SilentCacheClient,
      commonRequest: CommonSilentFlowRequest,
      silentRequest: SilentRequest
    ): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Acquire a token from native device (e.g. WAM)
      * @param request
      */
    /* protected */ def acquireTokenNative(request: PopupRequest, apiId: ApiId): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenNative(request: PopupRequest, apiId: ApiId, accountId: String): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenNative(request: SilentRequest, apiId: ApiId): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenNative(request: SilentRequest, apiId: ApiId, accountId: String): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenNative(request: SsoSilentRequest, apiId: ApiId): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenNative(request: SsoSilentRequest, apiId: ApiId, accountId: String): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Use when you want to obtain an access_token for your API via opening a popup window in the user's browser
      *
      * @param request
      *
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    def acquireTokenPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Use when you want to obtain an access_token for your API by redirecting the user's browser window to the authorization endpoint. This function redirects
      * the page, so any code that follows this function will not execute.
      *
      * IMPORTANT: It is NOT recommended to have code that is dependent on the resolution of the Promise. This function will navigate away from the current
      * browser window. It currently returns a Promise in order to reflect the asynchronous nature of the code running in this function.
      *
      * @param request
      */
    def acquireTokenRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    /**
      * Adds event callbacks to array
      * @param callback
      */
    def addEventCallback(callback: EventCallbackFunction): String | Null = js.native
    
    /**
      * Registers a callback to receive performance events.
      *
      * @param {PerformanceCallbackFunction} callback
      * @returns {string}
      */
    def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    /* protected */ val browserCrypto: ICrypto = js.native
    
    /* protected */ val browserStorage: BrowserCacheManager = js.native
    
    /* protected */ def canUseNative(request: PopupRequest): Boolean = js.native
    /* protected */ def canUseNative(request: PopupRequest, accountId: String): Boolean = js.native
    /**
      * Returns boolean indicating if this request can use the native broker
      * @param request
      */
    /* protected */ def canUseNative(request: RedirectRequest): Boolean = js.native
    /* protected */ def canUseNative(request: RedirectRequest, accountId: String): Boolean = js.native
    /* protected */ def canUseNative(request: SsoSilentRequest): Boolean = js.native
    /* protected */ def canUseNative(request: SsoSilentRequest, accountId: String): Boolean = js.native
    
    /* protected */ var config: BrowserConfiguration = js.native
    
    /**
      * Returns new instance of the Popup Interaction Client
      * @param correlationId
      */
    /* protected */ def createPopupClient(): PopupClient = js.native
    /* protected */ def createPopupClient(correlationId: String): PopupClient = js.native
    
    /**
      * Returns new instance of the Redirect Interaction Client
      * @param correlationId
      */
    /* protected */ def createRedirectClient(): RedirectClient = js.native
    /* protected */ def createRedirectClient(correlationId: String): RedirectClient = js.native
    
    /**
      * Returns new instance of the Silent AuthCode Interaction Client
      */
    /* protected */ def createSilentAuthCodeClient(): SilentAuthCodeClient = js.native
    /* protected */ def createSilentAuthCodeClient(correlationId: String): SilentAuthCodeClient = js.native
    
    /**
      * Returns new instance of the Silent Cache Interaction Client
      */
    /* protected */ def createSilentCacheClient(): SilentCacheClient = js.native
    /* protected */ def createSilentCacheClient(correlationId: String): SilentCacheClient = js.native
    
    /**
      * Returns new instance of the Silent Iframe Interaction Client
      * @param correlationId
      */
    /* protected */ def createSilentIframeClient(): SilentIframeClient = js.native
    /* protected */ def createSilentIframeClient(correlationId: String): SilentIframeClient = js.native
    
    /**
      * Returns new instance of the Silent Refresh Interaction Client
      */
    /* protected */ def createSilentRefreshClient(): SilentRefreshClient = js.native
    /* protected */ def createSilentRefreshClient(correlationId: String): SilentRefreshClient = js.native
    
    /**
      * Removes event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    def disableAccountStorageEvents(): Unit = js.native
    
    /**
      * Adds event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    def enableAccountStorageEvents(): Unit = js.native
    
    /* protected */ var eventHandler: EventHandler = js.native
    
    /**
      * Returns the signed in account matching homeAccountId.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found
      * @param homeAccountId
      * @returns The account object stored in MSAL
      */
    def getAccountByHomeId(homeAccountId: String): AccountInfo | Null = js.native
    
    /**
      * Returns the signed in account matching localAccountId.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found
      * @param localAccountId
      * @returns The account object stored in MSAL
      */
    def getAccountByLocalId(localAccountId: String): AccountInfo | Null = js.native
    
    /**
      * Returns the signed in account matching username.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found.
      * This API is provided for convenience but getAccountById should be used for best reliability
      * @param username
      * @returns The account object stored in MSAL
      */
    def getAccountByUsername(username: String): AccountInfo | Null = js.native
    
    /**
      * Gets the currently active account
      */
    def getActiveAccount(): AccountInfo | Null = js.native
    
    /**
      * Returns all accounts that MSAL currently has data for.
      * (the account object is created at the time of successful login)
      * or empty array when no accounts are found
      * @returns Array of account objects in cache
      */
    def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    /**
      * Returns the configuration object
      */
    def getConfiguration(): BrowserConfiguration = js.native
    
    /**
      * Returns the logger instance
      */
    def getLogger(): Logger = js.native
    
    /* protected */ def getNativeAccountId(request: PopupRequest): String = js.native
    /**
      * Get the native accountId from the account
      * @param request
      * @returns
      */
    /* protected */ def getNativeAccountId(request: RedirectRequest): String = js.native
    /* protected */ def getNativeAccountId(request: SsoSilentRequest): String = js.native
    
    /**
      * Generates a correlation id for a request if none is provided.
      *
      * @protected
      * @param {?Partial<BaseAuthRequest>} [request]
      * @returns {string}
      */
    /* protected */ def getRequestCorrelationId(): String = js.native
    /* protected */ def getRequestCorrelationId(request: PartialBaseAuthRequest): String = js.native
    
    /**
      * Gets the token cache for the application.
      */
    def getTokenCache(): ITokenCache = js.native
    
    /**
      * Event handler function which allows users to fire events after the PublicClientApplication object
      * has loaded during redirect flows. This should be invoked on all page loads involved in redirect
      * auth flows.
      * @param hash Hash to process. Defaults to the current value of window.location.hash. Only needs to be provided explicitly if the response to be handled is not contained in the current value.
      * @returns Token response or null. If the return value is null, then no auth redirect was detected.
      */
    def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    def handleRedirectPromise(hash: String): js.Promise[AuthenticationResult | Null] = js.native
    
    /* private */ var hybridAuthCodeResponses: Any = js.native
    
    /**
      * Initializer function to perform async startup tasks such as connecting to WAM extension
      */
    def initialize(): js.Promise[Unit] = js.native
    
    /**
      * Called by wrapper libraries (Angular & React) to set SKU and Version passed down to telemetry, logger, etc.
      * @param sku
      * @param version
      */
    def initializeWrapperLibrary(sku: WrapperSKU, version: String): Unit = js.native
    
    /* protected */ var initialized: Boolean = js.native
    
    /* protected */ var isBrowserEnvironment: Boolean = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Deprecated logout function. Use logoutRedirect or logoutPopup instead
      * @param logoutRequest
      * @deprecated
      */
    def logout(): js.Promise[Unit] = js.native
    def logout(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    /**
      * Clears local cache for the current user then opens a popup window prompting the user to sign-out of the server
      * @param logoutRequest
      */
    def logoutPopup(): js.Promise[Unit] = js.native
    def logoutPopup(logoutRequest: EndSessionPopupRequest): js.Promise[Unit] = js.native
    
    /**
      * Use to log out the current user, and redirect the user to the postLogoutRedirectUri.
      * Default behaviour is to redirect the user to `window.location.href`.
      * @param logoutRequest
      */
    def logoutRedirect(): js.Promise[Unit] = js.native
    def logoutRedirect(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    /* protected */ var nativeExtensionProvider: js.UndefOr[NativeMessageHandler] = js.native
    
    /* protected */ val nativeInternalStorage: BrowserCacheManager = js.native
    
    /* protected */ var navigationClient: INavigationClient = js.native
    
    /* protected */ val networkClient: INetworkModule = js.native
    
    /* protected */ var performanceClient: IPerformanceClient = js.native
    
    /**
      * Helper to validate app environment before making an auth request
      *
      * @protected
      * @param {InteractionType} interactionType What kind of interaction is being used
      * @param {boolean} [setInteractionInProgress=true] Whether to set interaction in progress temp cache flag
      */
    /* protected */ def preflightBrowserEnvironmentCheck(interactionType: InteractionType): Unit = js.native
    /* protected */ def preflightBrowserEnvironmentCheck(interactionType: InteractionType, setInteractionInProgress: Boolean): Unit = js.native
    
    /**
      * Preflight check for interactive requests
      *
      * @protected
      * @param {boolean} setInteractionInProgress Whether to set interaction in progress temp cache flag
      */
    /* protected */ def preflightInteractiveRequest(setInteractionInProgress: Boolean): Unit = js.native
    
    /* protected */ var redirectResponse: Map[String, js.Promise[AuthenticationResult | Null]] = js.native
    
    /**
      * Removes callback with provided id from callback array
      * @param callbackId
      */
    def removeEventCallback(callbackId: String): Unit = js.native
    
    /**
      * Removes a callback registered with addPerformanceCallback.
      *
      * @param {string} callbackId
      * @returns {boolean}
      */
    def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    /**
      * Sets the account to use as the active account. If no account is passed to the acquireToken APIs, then MSAL will use this active account.
      * @param account
      */
    def setActiveAccount(): Unit = js.native
    def setActiveAccount(account: AccountInfo): Unit = js.native
    
    /**
      * Replaces the default logger set in configurations with new Logger with new configurations
      * @param logger Logger instance
      */
    def setLogger(logger: Logger): Unit = js.native
    
    /**
      * Sets navigation client
      * @param navigationClient
      */
    def setNavigationClient(navigationClient: INavigationClient): Unit = js.native
    
    /**
      * This function uses a hidden iframe to fetch an authorization code from the eSTS. There are cases where this may not work:
      * - Any browser using a form of Intelligent Tracking Prevention
      * - If there is not an established session with the service
      *
      * In these cases, the request must be done inside a popup or full frame redirect.
      *
      * For the cases where interaction is required, you cannot send a request with prompt=none.
      *
      * If your refresh token has expired, you can use this function to fetch a new set of tokens silently as long as
      * you session on the server still exists.
      * @param request {@link SsoSilentRequest}
      *
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    def ssoSilent(request: SsoSilentRequest): js.Promise[AuthenticationResult] = js.native
    
    /* private */ var ssoSilentMeasurement: Any = js.native
    
    /* private */ var tokenCache: Any = js.native
    
    /* private */ var trackPageVisibilityWithMeasurement: Any = js.native
  }
}
