package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestAuthorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientSilentIframeClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/SilentIframeClient", "SilentIframeClient")
  @js.native
  open class SilentIframeClient protected () extends StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: BrowserCacheManager
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
      nativeStorageImpl: BrowserCacheManager,
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
      nativeStorageImpl: BrowserCacheManager,
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
      nativeStorageImpl: BrowserCacheManager,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /* protected */ var apiId: ApiId = js.native
    
    /**
      * Currently Unsupported
      */
    def logout(): js.Promise[Unit] = js.native
    
    /* protected */ var nativeStorage: BrowserCacheManager = js.native
    
    /**
      * Helper which acquires an authorization code silently using a hidden iframe from given url
      * using the scopes requested as part of the id, and exchanges the code for a set of OAuth tokens.
      * @param navigateUrl
      * @param userRequestScopes
      */
    /* protected */ def silentTokenHelper(authClient: AuthorizationCodeClient, silentRequest: AuthorizationUrlRequest): js.Promise[AuthenticationResult] = js.native
  }
}
