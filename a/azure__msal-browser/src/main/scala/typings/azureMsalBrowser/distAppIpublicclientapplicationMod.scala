package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheItokencacheMod.ITokenCache
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalBrowser.distRequestEndSessionPopupRequestMod.EndSessionPopupRequest
import typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.WrapperSKU
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.PerformanceCallbackFunction
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppIpublicclientapplicationMod {
  
  @JSImport("@azure/msal-browser/dist/app/IPublicClientApplication", "stubbedPublicClientApplication")
  @js.native
  val stubbedPublicClientApplication: IPublicClientApplication = js.native
  
  @js.native
  trait IPublicClientApplication extends StObject {
    
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    def acquireTokenPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    def acquireTokenRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    def acquireTokenSilent(silentRequest: SilentRequest): js.Promise[AuthenticationResult] = js.native
    
    def addEventCallback(callback: js.Function): String | Null = js.native
    
    def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    def disableAccountStorageEvents(): Unit = js.native
    
    def enableAccountStorageEvents(): Unit = js.native
    
    def getAccountByHomeId(homeAccountId: String): AccountInfo | Null = js.native
    
    def getAccountByLocalId(localId: String): AccountInfo | Null = js.native
    
    def getAccountByUsername(userName: String): AccountInfo | Null = js.native
    
    def getActiveAccount(): AccountInfo | Null = js.native
    
    def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    def getConfiguration(): BrowserConfiguration = js.native
    
    def getLogger(): Logger = js.native
    
    def getTokenCache(): ITokenCache = js.native
    
    def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    def handleRedirectPromise(hash: String): js.Promise[AuthenticationResult | Null] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def initializeWrapperLibrary(sku: WrapperSKU, version: String): Unit = js.native
    
    def loginPopup(): js.Promise[AuthenticationResult] = js.native
    def loginPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    def loginRedirect(): js.Promise[Unit] = js.native
    def loginRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    def logout(): js.Promise[Unit] = js.native
    def logout(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    def logoutPopup(): js.Promise[Unit] = js.native
    def logoutPopup(logoutRequest: EndSessionPopupRequest): js.Promise[Unit] = js.native
    
    def logoutRedirect(): js.Promise[Unit] = js.native
    def logoutRedirect(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    def removeEventCallback(callbackId: String): Unit = js.native
    
    def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    def setActiveAccount(): Unit = js.native
    def setActiveAccount(account: AccountInfo): Unit = js.native
    
    def setLogger(logger: Logger): Unit = js.native
    
    def setNavigationClient(navigationClient: INavigationClient): Unit = js.native
    
    def ssoSilent(request: SsoSilentRequest): js.Promise[AuthenticationResult] = js.native
  }
}
