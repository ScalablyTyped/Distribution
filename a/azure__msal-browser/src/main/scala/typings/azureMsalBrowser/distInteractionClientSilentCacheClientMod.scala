package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import typings.azureMsalCommon.mod.SilentFlowClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentCacheClientMod {
  
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
