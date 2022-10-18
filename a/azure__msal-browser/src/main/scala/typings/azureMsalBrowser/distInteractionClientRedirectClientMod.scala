package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientRedirectClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/RedirectClient", "RedirectClient")
  @js.native
  open class RedirectClient protected () extends StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: EventHandler,
      navigationClient: INavigationClient,
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
      performanceClient: IPerformanceClient,
      nativeStorageImpl: BrowserCacheManager,
      nativeMessageHandler: NativeMessageHandler,
      correlationId: String
    ) = this()
    
    /**
      * Gets the response hash for a redirect request
      * Returns null if interactionType in the state value is not "redirect" or the hash does not contain known properties
      * @param hash
      */
    /* protected */ def getRedirectResponseHash(hash: String): String | Null = js.native
    
    /**
      * Use to get the redirectStartPage either from request or use current window
      * @param requestStartPage
      */
    /* protected */ def getRedirectStartPage(): String = js.native
    /* protected */ def getRedirectStartPage(requestStartPage: String): String = js.native
    
    /**
      * Checks if hash exists and handles in window.
      * @param hash
      * @param state
      */
    /* protected */ def handleHash(hash: String, state: String, serverTelemetryManager: ServerTelemetryManager): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Checks if navigateToLoginRequestUrl is set, and:
      * - if true, performs logic to cache and navigate
      * - if false, handles hash string and parses response
      * @param hash
      */
    def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    def handleRedirectPromise(hash: String): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Use to log out the current user, and redirect the user to the postLogoutRedirectUri.
      * Default behaviour is to redirect the user to `window.location.href`.
      * @param logoutRequest
      */
    def logout(): js.Promise[Unit] = js.native
    
    /* protected */ var nativeStorage: BrowserCacheManager = js.native
  }
}
