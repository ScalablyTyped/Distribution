package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.PartialBaseAuthRequest
import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Authority
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientBaseInteractionClientMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-browser/dist/interaction_client/BaseInteractionClient", "BaseInteractionClient")
  @js.native
  open class BaseInteractionClient protected () extends StObject {
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
    
    def acquireToken(request: PopupRequest): js.Promise[AuthenticationResult | Unit] = js.native
    def acquireToken(request: RedirectRequest): js.Promise[AuthenticationResult | Unit] = js.native
    def acquireToken(request: SsoSilentRequest): js.Promise[AuthenticationResult | Unit] = js.native
    
    /* protected */ var browserCrypto: ICrypto = js.native
    
    /* protected */ var browserStorage: BrowserCacheManager = js.native
    
    /* protected */ def clearCacheOnLogout(): js.Promise[Unit] = js.native
    /* protected */ def clearCacheOnLogout(account: AccountInfo): js.Promise[Unit] = js.native
    
    /* protected */ var config: BrowserConfiguration = js.native
    
    /* protected */ var correlationId: String = js.native
    
    /* protected */ var eventHandler: EventHandler = js.native
    
    /**
      * Used to get a discovered version of the default authority.
      * @param requestAuthority
      * @param requestCorrelationId
      */
    /* protected */ def getDiscoveredAuthority(): js.Promise[Authority] = js.native
    /* protected */ def getDiscoveredAuthority(requestAuthority: String): js.Promise[Authority] = js.native
    
    /**
      *
      * Use to get the redirect uri configured in MSAL or null.
      * @param requestRedirectUri
      * @returns Redirect URL
      *
      */
    def getRedirectUri(): String = js.native
    def getRedirectUri(requestRedirectUri: String): String = js.native
    
    /**
      * Initializer function for all request APIs
      * @param request
      */
    /* protected */ def initializeBaseRequest(request: PartialBaseAuthRequest): js.Promise[BaseAuthRequest] = js.native
    
    /**
      *
      * @param apiId
      * @param correlationId
      * @param forceRefresh
      */
    /* protected */ def initializeServerTelemetryManager(apiId: Double): ServerTelemetryManager = js.native
    /* protected */ def initializeServerTelemetryManager(apiId: Double, forceRefresh: Boolean): ServerTelemetryManager = js.native
    
    /* protected */ var logger: Logger = js.native
    
    def logout(request: EndSessionRequest): js.Promise[Unit] = js.native
    
    /* protected */ var nativeMessageHandler: js.UndefOr[NativeMessageHandler] = js.native
    
    /* protected */ var navigationClient: INavigationClient = js.native
    
    /* protected */ var networkClient: INetworkModule = js.native
    
    /* protected */ var performanceClient: IPerformanceClient = js.native
  }
}
