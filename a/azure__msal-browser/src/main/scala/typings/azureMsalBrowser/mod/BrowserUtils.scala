package typings.azureMsalBrowser.mod

import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "BrowserUtils")
@js.native
open class BrowserUtils ()
  extends typings.azureMsalBrowser.distUtilsBrowserUtilsMod.BrowserUtils
/* static members */
object BrowserUtils {
  
  @JSImport("@azure/msal-browser", "BrowserUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Block redirectUri loaded in popup from calling AcquireToken APIs
    */
  inline def blockAcquireTokenInPopups(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockAcquireTokenInPopups")().asInstanceOf[Unit]
  
  /**
    * Throws error if native brokering is enabled but initialize hasn't been called
    * @param allowNativeBroker
    * @param initialized
    */
  inline def blockNativeBrokerCalledBeforeInitialized(allowNativeBroker: Boolean, initialized: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blockNativeBrokerCalledBeforeInitialized")(allowNativeBroker.asInstanceOf[js.Any], initialized.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Throws error if token requests are made in non-browser environment
    * @param isBrowserEnvironment Flag indicating if environment is a browser.
    */
  inline def blockNonBrowserEnvironment(isBrowserEnvironment: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockNonBrowserEnvironment")(isBrowserEnvironment.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Block redirect operations in iframes unless explicitly allowed
    * @param interactionType Interaction type for the request
    * @param allowRedirectInIframe Config value to allow redirects when app is inside an iframe
    */
  inline def blockRedirectInIframe(
    interactionType: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType,
    allowRedirectInIframe: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blockRedirectInIframe")(interactionType.asInstanceOf[js.Any], allowRedirectInIframe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Throws error if we have completed an auth and are
    * attempting another auth request inside an iframe.
    */
  inline def blockReloadInHiddenIframes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockReloadInHiddenIframes")().asInstanceOf[Unit]
  
  /**
    * Clears hash from window url.
    */
  inline def clearHash(contentWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHash")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns boolean of whether current browser is an Internet Explorer or Edge browser.
    */
  inline def detectIEOrEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectIEOrEdge")().asInstanceOf[Boolean]
  
  /**
    * Returns best compatible network client object.
    */
  inline def getBrowserNetworkClient(): INetworkModule = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserNetworkClient")().asInstanceOf[INetworkModule]
  
  /**
    * Returns current window URL as redirect uri
    */
  inline def getCurrentUri(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUri")().asInstanceOf[String]
  
  /**
    * Gets the homepage url for the current window location.
    */
  inline def getHomepage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHomepage")().asInstanceOf[String]
  
  /**
    * Returns boolean of whether the current window is in an iframe or not.
    */
  inline def isInIframe(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInIframe")().asInstanceOf[Boolean]
  
  /**
    * Returns boolean of whether or not the current window is a popup opened by msal
    */
  inline def isInPopup(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPopup")().asInstanceOf[Boolean]
  
  /**
    * Replaces current hash with hash from provided url
    */
  inline def replaceHash(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceHash")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
