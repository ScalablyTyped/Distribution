package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentAuthCodeClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentAuthCodeClient", "SilentAuthCodeClient")
  @js.native
  open class SilentAuthCodeClient protected () extends StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
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
      apiId: ApiId,
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
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /**
      * Acquires a token silently by redeeming an authorization code against the /token endpoint
      * @param request
      */
    def acquireToken(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    /* private */ var apiId: Any = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
  }
}
