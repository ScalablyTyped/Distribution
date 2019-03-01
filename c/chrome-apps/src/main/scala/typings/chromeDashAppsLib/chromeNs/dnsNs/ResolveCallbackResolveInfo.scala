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

object ResolveCallbackResolveInfo {
  @scala.inline
  def apply(resultCode: chromeDashAppsLib.chromeNs.integer, address: java.lang.String = null): ResolveCallbackResolveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resultCode")(resultCode)
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[ResolveCallbackResolveInfo]
  }
}

