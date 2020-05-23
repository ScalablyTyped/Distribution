package typings.chrome.global.chrome

import typings.chrome.chrome.proxy.ProxyErrorEvent
import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Proxy
////////////////////
/**
  * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
  * Permissions:  "proxy"
  * @since Chrome 13.
  */
@JSGlobal("chrome.proxy")
@js.native
object proxy extends js.Object {
  var onProxyError: ProxyErrorEvent = js.native
  var settings: ChromeSetting = js.native
}

