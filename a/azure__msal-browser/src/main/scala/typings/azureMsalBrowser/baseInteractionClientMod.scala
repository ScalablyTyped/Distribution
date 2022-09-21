package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.PartialBaseAuthRequest
import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.endSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.eventHandlerMod.EventHandler
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.nativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.popupRequestMod.PopupRequest
import typings.azureMsalBrowser.redirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.ssoSilentRequestMod.SsoSilentRequest
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Authority
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseInteractionClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/BaseInteractionClient", "BaseInteractionClient")
  @js.native
  abstract class BaseInteractionClient protected () extends StObject {
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
