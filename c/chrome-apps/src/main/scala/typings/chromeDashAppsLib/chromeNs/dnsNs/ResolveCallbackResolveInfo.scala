package typings
package chromeDashAppsLib.chromeNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCallbackResolveInfo extends js.Object {
  /**
    * A string representing the IP address literal.
    * Supplied only if resultCode indicates success.
    * Note that we presently return only IPv4 addresses.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** The result code. Zero indicates success. */
  var resultCode: chromeDashAppsLib.chromeNs.integer
}

