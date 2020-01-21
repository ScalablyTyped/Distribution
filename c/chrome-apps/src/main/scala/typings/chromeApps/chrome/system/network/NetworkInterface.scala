package typings.chromeApps.chrome.system.network

import typings.chromeApps.chrome.integer
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterface]
  }
}

