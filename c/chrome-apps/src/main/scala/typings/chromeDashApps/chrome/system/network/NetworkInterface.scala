package typings.chromeDashApps.chrome.system.network

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /** The available IPv4/6 address. */
  var address: String
  /** The underlying name of the adapter. On *nix, this will typically be "eth0", "wlan0", etc. */
  var name: String
  /** The prefix length */
  var prefixLength: integer
}

object NetworkInterface {
  @scala.inline
  def apply(address: String, name: String, prefixLength: integer): NetworkInterface = {
    val __obj = js.Dynamic.literal(address = address, name = name, prefixLength = prefixLength)
  
    __obj.asInstanceOf[NetworkInterface]
  }
}

