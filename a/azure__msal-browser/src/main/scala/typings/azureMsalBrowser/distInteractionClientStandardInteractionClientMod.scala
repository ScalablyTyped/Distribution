package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientBaseInteractionClientMod.BaseInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.distRequestCommonEndSessionRequestMod.CommonEndSessionRequest
import typings.azureMsalCommon.distResponseServerAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Authority
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientStandardInteractionClientMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-browser/dist/interaction_client/StandardInteractionClient", "StandardInteractionClient")
  @js.native
  open class StandardInteractionClient protected () extends BaseInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /**
      * Creates an Authorization Code Client with the given authority, or the default authority.
      * @param serverTelemetryManager
      * @param authorityUrl
      */
    /* protected */ def createAuthCodeClient(serverTelemetryManager: ServerTelemetryManager): js.Promise[AuthorizationCodeClient] = js.native
    /* protected */ def createAuthCodeClient(serverTelemetryManager: ServerTelemetryManager, authorityUrl: String): js.Promise[AuthorizationCodeClient] = js.native
    /* protected */ def createAuthCodeClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: String,
      requestAzureCloudOptions: AzureCloudOptions
    ): js.Promise[AuthorizationCodeClient] = js.native
    /* protected */ def createAuthCodeClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: Unit,
      requestAzureCloudOptions: AzureCloudOptions
    ): js.Promise[AuthorizationCodeClient] = js.native
    
    /**
      * Creates a Client Configuration object with the given request authority, or the default authority.
      * @param serverTelemetryManager
      * @param requestAuthority
      * @param requestCorrelationId
      */
    /* protected */ def getClientConfiguration(serverTelemetryManager: ServerTelemetryManager): js.Promise[ClientConfiguration] = js.native
    /* protected */ def getClientConfiguration(serverTelemetryManager: ServerTelemetryManager, requestAuthority: String): js.Promise[ClientConfiguration] = js.native
    /* protected */ def getClientConfiguration(
      serverTelemetryManager: ServerTelemetryManager,
      requestAuthority: String,
      requestAzureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    /* protected */ def getClientConfiguration(
      serverTelemetryManager: ServerTelemetryManager,
      requestAuthority: Unit,
      requestAzureCloudOptions: AzureCloudOptions
    ): js.Promise[ClientConfiguration] = js.native
    
    /* protected */ def getDiscoveredAuthority(requestAuthority: String, requestAzureCloudOptions: AzureCloudOptions): js.Promise[Authority] = js.native
    /* protected */ def getDiscoveredAuthority(requestAuthority: Unit, requestAzureCloudOptions: AzureCloudOptions): js.Promise[Authority] = js.native
    
    /**
      * Parses login_hint ID Token Claim out of AccountInfo object to be used as
      * logout_hint in end session request.
      * @param account
      */
    /* protected */ def getLogoutHintFromIdTokenClaims(account: AccountInfo): String | Null = js.native
    
    /**
      * Generates an auth code request tied to the url request.
      * @param request
      */
    /* protected */ def initializeAuthorizationCodeRequest(request: AuthorizationUrlRequest): js.Promise[CommonAuthorizationCodeRequest] = js.native
    
    /* protected */ def initializeAuthorizationRequest(request: PopupRequest, interactionType: InteractionType): js.Promise[AuthorizationUrlRequest] = js.native
    /**
      * Helper to initialize required request parameters for interactive APIs and ssoSilent()
      * @param request
      * @param interactionType
      */
    /* protected */ def initializeAuthorizationRequest(request: RedirectRequest, interactionType: InteractionType): js.Promise[AuthorizationUrlRequest] = js.native
    /* protected */ def initializeAuthorizationRequest(request: SsoSilentRequest, interactionType: InteractionType): js.Promise[AuthorizationUrlRequest] = js.native
    
    /**
      * Initializer for the logout request.
      * @param logoutRequest
      */
    /* protected */ def initializeLogoutRequest(): CommonEndSessionRequest = js.native
    /* protected */ def initializeLogoutRequest(logoutRequest: EndSessionRequest): CommonEndSessionRequest = js.native
    
    /**
      * @param hash
      * @param interactionType
      */
    /* protected */ def validateAndExtractStateFromHash(serverParams: ServerAuthorizationCodeResponse, interactionType: InteractionType): String = js.native
    /* protected */ def validateAndExtractStateFromHash(
      serverParams: ServerAuthorizationCodeResponse,
      interactionType: InteractionType,
      requestCorrelationId: String
    ): String = js.native
  }
}
