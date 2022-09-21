package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.eventHandlerMod.EventHandler
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.nativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.silentRequestMod.SilentRequest
import typings.azureMsalBrowser.standardInteractionClientMod.StandardInteractionClient
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.clientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.commonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import typings.azureMsalCommon.mod.SilentFlowClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object silentCacheClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentCacheClient", "SilentCacheClient")
  @js.native
  open class SilentCacheClient protected () extends StandardInteractionClient {
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
      * Returns unexpired tokens from the cache, if available
      * @param silentRequest
      */
    def acquireToken(silentRequest: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Creates an Silent Flow Client with the given authority, or the default authority.
      * @param serverTelemetryManager
      * @param authorityUrl
      */
    /* protected */ def createSilentFlowClient(serverTelemetryManager: ServerTelemetryManager): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(serverTelemetryManager: ServerTelemetryManager, authorityUrl: String): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: String,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[SilentFlowClient] = js.native
    /* protected */ def createSilentFlowClient(
      serverTelemetryManager: ServerTelemetryManager,
      authorityUrl: Unit,
      azureCloudOptions: AzureCloudOptions
    ): js.Promise[SilentFlowClient] = js.native
    
    def initializeSilentRequest(request: SilentRequest, account: AccountInfo): js.Promise[CommonSilentFlowRequest] = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
  }
}
