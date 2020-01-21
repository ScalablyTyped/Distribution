package typings.chromeApps.chrome.dns

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCallbackResolveInfo extends js.Object {
  /**
    * A string representing the IP address literal.
    * Supplied only if resultCode indicates success.
    * Note that we presently return only IPv4 addresses.
    */
  var address: js.UndefOr[String] = js.undefined
  /** The result code. Zero indicates success. */
  var resultCode: integer
}

object ResolveCallbackResolveInfo {
  @scala.inline
  def apply(resultCode: integer, address: String = null): ResolveCallbackResolveInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCallbackResolveInfo]
  }
}

