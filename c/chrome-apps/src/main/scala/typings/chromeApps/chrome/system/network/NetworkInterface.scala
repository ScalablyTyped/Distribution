package typings.chromeApps.chrome.system.network

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /** The available IPv4/6 address. */
  var address: String = js.native
  /** The underlying name of the adapter. On *nix, this will typically be "eth0", "wlan0", etc. */
  var name: String = js.native
  /** The prefix length */
  var prefixLength: integer = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(address: String, name: String, prefixLength: integer): NetworkInterface = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixLength(value: integer): Self = this.set("prefixLength", value.asInstanceOf[js.Any])
  }
  
}

