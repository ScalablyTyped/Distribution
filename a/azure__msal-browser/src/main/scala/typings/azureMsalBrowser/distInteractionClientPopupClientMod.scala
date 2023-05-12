package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distCryptoMsrBrowserCryptoMod.global.Window
import typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler
import typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestEndSessionPopupRequestMod.EndSessionPopupRequest
import typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typings.azureMsalBrowser.distRequestPopupWindowAttributesMod.PopupWindowAttributes
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonEndSessionRequestMod.CommonEndSessionRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Logger
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionClientPopupClientMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_client/PopupClient", "PopupClient")
  @js.native
  open class PopupClient protected () extends StandardInteractionClient {
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
      * Helper which obtains an access_token for your API via opening a popup window in the user's browser
      * @param validRequest
      * @param popupName
      * @param popup
      * @param popupWindowAttributes
      *
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    /* protected */ def acquireTokenPopupAsync(request: PopupRequest, popupName: String, popupWindowAttributes: PopupWindowAttributes): js.Promise[AuthenticationResult] = js.native
    /* protected */ def acquireTokenPopupAsync(
      request: PopupRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      popup: Window
    ): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Closes popup, removes any state vars created during popup calls.
      * @param popupWindow
      */
    def cleanPopup(): Unit = js.native
    def cleanPopup(popupWindow: Window): Unit = js.native
    
    /* private */ var currentWindow: Any = js.native
    
    /**
      * Generates the name for the popup based on the client id and request for logouts
      * @param clientId
      * @param request
      */
    def generateLogoutPopupName(request: CommonEndSessionRequest): String = js.native
    
    /**
      * Generates the name for the popup based on the client id and request
      * @param clientId
      * @param request
      */
    def generatePopupName(scopes: js.Array[String], authority: String): String = js.native
    
    /**
      * Opens a popup window with given request Url.
      * @param requestUrl
      */
    def initiateAuthRequest(requestUrl: String, params: PopupParams): Window = js.native
    
    /**
      * Clears local cache for the current user then opens a popup window prompting the user to sign-out of the server
      * @param logoutRequest
      */
    def logout(): js.Promise[Unit] = js.native
    def logout(logoutRequest: EndSessionPopupRequest): js.Promise[Unit] = js.native
    
    /**
      *
      * @param validRequest
      * @param popupName
      * @param requestAuthority
      * @param popup
      * @param mainWindowRedirectUri
      * @param popupWindowAttributes
      */
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: String,
      popup: Null,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: String,
      popup: Unit,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: String,
      popup: Window
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: String,
      popup: Window,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: Unit,
      popup: Null,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: Unit,
      popup: Unit,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: Unit,
      popup: Window
    ): js.Promise[Unit] = js.native
    /* protected */ def logoutPopupAsync(
      validRequest: CommonEndSessionRequest,
      popupName: String,
      popupWindowAttributes: PopupWindowAttributes,
      requestAuthority: Unit,
      popup: Window,
      mainWindowRedirectUri: String
    ): js.Promise[Unit] = js.native
    
    /**
      * Monitors a window until it loads a url with the same origin.
      * @param popupWindow - window that is being monitored
      * @param timeout - timeout for processing hash once popup is redirected back to application
      */
    def monitorPopupForHash(popupWindow: Window): js.Promise[String] = js.native
    
    /* protected */ var nativeStorage: BrowserCacheManager = js.native
    
    /**
      * @hidden
      *
      * Configures popup window for login.
      *
      * @param urlNavigate
      * @param title
      * @param popUpWidth
      * @param popUpHeight
      * @param popupWindowAttributes
      * @ignore
      * @hidden
      */
    def openPopup(urlNavigate: String, popupParams: PopupParams): Window = js.native
    
    /**
      * Helper function to set popup window dimensions and position
      * @param urlNavigate
      * @param popupName
      * @param popupWindowAttributes
      * @returns
      */
    def openSizedPopup(urlNavigate: String, popupName: String, popupWindowAttributes: PopupWindowAttributes): Window | Null = js.native
    
    /**
      * Event callback to unload main window.
      */
    def unloadWindow(e: Event): Unit = js.native
    
    /**
      * Waits for user interaction in logout popup window
      * @param popupWindow
      * @returns
      */
    def waitForLogoutPopup(popupWindow: Window): js.Promise[Unit] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Lifted 0 members from Set(@azure/msal-browser.@azure/msal-browser/dist/interaction_handler/InteractionHandler.InteractionParams) */ trait PopupParams extends StObject {
    
    var popup: js.UndefOr[Window | Null] = js.undefined
    
    var popupName: String
    
    var popupWindowAttributes: PopupWindowAttributes
  }
  object PopupParams {
    
    inline def apply(popupName: String, popupWindowAttributes: PopupWindowAttributes): PopupParams = {
      val __obj = js.Dynamic.literal(popupName = popupName.asInstanceOf[js.Any], popupWindowAttributes = popupWindowAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupParams] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: Window): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupName(value: String): Self = StObject.set(x, "popupName", value.asInstanceOf[js.Any])
      
      inline def setPopupNull: Self = StObject.set(x, "popup", null)
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPopupWindowAttributes(value: PopupWindowAttributes): Self = StObject.set(x, "popupWindowAttributes", value.asInstanceOf[js.Any])
    }
  }
}
