package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.eventHandlerMod.EventHandler
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.nativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.standardInteractionClientMod.StandardInteractionClient
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.commonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.RefreshTokenClient
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object silentRefreshClientMod {
  
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
