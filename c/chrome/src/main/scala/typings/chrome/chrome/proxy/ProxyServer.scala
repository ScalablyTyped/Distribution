package typings.chrome.chrome.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyServer extends js.Object {
  /** The URI of the proxy server. This must be an ASCII hostname (in Punycode format). IDNA is not supported, yet. */
  var host: String
  /** Optional. The port of the proxy server. Defaults to a port that depends on the scheme. */
  var port: js.UndefOr[Double] = js.undefined
  /** Optional. The scheme (protocol) of the proxy server itself. Defaults to 'http'. */
  var scheme: js.UndefOr[String] = js.undefined
}

object ProxyServer {
  @scala.inline
  def apply(host: String, port: Int | Double = null, scheme: String = null): ProxyServer = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyServer]
  }
}

