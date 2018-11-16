package typings
package chromeLib.chromeNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProxyRules extends js.Object {
  /** Optional. List of servers to connect to without a proxy server. */
  var bypassList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
  var fallbackProxy: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for FTP requests. */
  var proxyForFtp: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTP requests. */
  var proxyForHttp: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for HTTPS requests. */
  var proxyForHttps: js.UndefOr[ProxyServer] = js.undefined
  /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
  var singleProxy: js.UndefOr[ProxyServer] = js.undefined
}

