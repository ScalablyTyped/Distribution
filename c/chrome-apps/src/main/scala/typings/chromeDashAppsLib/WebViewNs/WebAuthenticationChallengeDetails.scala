package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthenticationChallengeDetails extends WebResponseHeadersDetails {
  /** The server requesting authentication. */
  var challenger: WebAuthChallenger
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: scala.Boolean
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[java.lang.String] = js.undefined
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: java.lang.String
}

