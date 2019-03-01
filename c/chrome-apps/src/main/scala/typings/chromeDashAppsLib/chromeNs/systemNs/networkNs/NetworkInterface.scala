package typings
package chromeDashAppsLib.chromeNs.systemNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /** The available IPv4/6 address. */
  var address: java.lang.String
  /** The underlying name of the adapter. On *nix, this will typically be "eth0", "wlan0", etc. */
  var name: java.lang.String
  /** The prefix length */
  var prefixLength: chromeDashAppsLib.chromeNs.integer
}

object NetworkInterface {
  @scala.inline
  def apply(
    address: java.lang.String,
    name: java.lang.String,
    prefixLength: chromeDashAppsLib.chromeNs.integer
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prefixLength")(prefixLength)
    __obj.asInstanceOf[NetworkInterface]
  }
}

