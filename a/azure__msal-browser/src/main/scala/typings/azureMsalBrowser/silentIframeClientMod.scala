package typings.azureMsalBrowser

import typings.azureMsalBrowser.authorizationUrlRequestMod.AuthorizationUrlRequest
import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.browserConstantsMod.ApiId
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.eventHandlerMod.EventHandler
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.nativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.standardInteractionClientMod.StandardInteractionClient
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object silentIframeClientMod {
  
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
