package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualProxySettings[M, P] extends js.Object {
  /** Settings for FTP proxy. */
  var FTPProxy: js.UndefOr[P] = js.undefined
  /** Settings for HTTP proxy. */
  var HTTPProxy: js.UndefOr[P] = js.undefined
  /** Settings for SOCKS proxy. */
  var SOCKS: js.UndefOr[P] = js.undefined
  /** Settings for secure HTTP proxy. */
  var SecureHTTPProxy: js.UndefOr[P] = js.undefined
}

