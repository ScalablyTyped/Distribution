package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.RefreshTokenClient
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentRefreshClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentRefreshClient", "SilentRefreshClient")
  @js.native
  open class SilentRefreshClient protected () extends StandardInteractionClient {
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
      * Exchanges the refresh token for new tokens
      * @param request
      */
    def acquireToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Creates a Refresh Client with the given authority, or the default authority.
      * @param serverTelemetryManager
      * @param authorityUrl
      */
    /* protected */ def createRefreshTokenClient(serverTelemetryManager: ServerTelemetryManager): js.Promise[RefreshTokenClient] = js.native
    /* protected */ def createRefreshTokenClient(serverTelemetryManager: ServerTelemetryManager, authorityUrl: String): js.Promise[RefreshTokenClient] = js.native
    /* protected */ def createRefreshTokenClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: String,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[RefreshTokenClient] = js.native
    /* protected */ def createRefreshTokenClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[RefreshTokenClient] = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
  }
}
