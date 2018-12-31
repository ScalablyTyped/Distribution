package typings
package chromeLib.chromeNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyServer extends js.Object {
  /** The URI of the proxy server. This must be an ASCII hostname (in Punycode format). IDNA is not supported, yet. */
  var host: java.lang.String
  /** Optional. The port of the proxy server. Defaults to a port that depends on the scheme. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The scheme (protocol) of the proxy server itself. Defaults to 'http'. */
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

