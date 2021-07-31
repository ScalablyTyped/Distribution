package typings.chrome.global.chrome

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Proxy
////////////////////
/**
  * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
  * Permissions:  "proxy"
  * @since Chrome 13.
  */
object proxy {
  
  @JSGlobal("chrome.proxy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.proxy.onProxyError")
  @js.native
  def onProxyError: ProxyErrorEvent = js.native
  @scala.inline
  def onProxyError_=(x: ProxyErrorEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onProxyError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.proxy.settings")
  @js.native
  def settings: ChromeSetting = js.native
  @scala.inline
  def settings_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
}
