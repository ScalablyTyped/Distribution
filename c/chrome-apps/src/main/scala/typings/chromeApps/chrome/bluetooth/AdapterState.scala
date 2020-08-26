package typings.chromeApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterState extends js.Object {
  /** The address of the adapter, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String = js.native
  /** Indicates whether or not the adapter is available (i.e. enabled). */
  var available: Boolean = js.native
  /** Indicates whether or not the adapter is currently discovering. */
  var discovering: Boolean = js.native
  /** The human-readable name of the adapter. */
  var name: String = js.native
  /** Indicates whether or not the adapter has power. */
  var powered: Boolean = js.native
}

object AdapterState {
  @scala.inline
  def apply(address: String, available: Boolean, discovering: Boolean, name: String, powered: Boolean): AdapterState = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], powered = powered.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterState]
  }
  @scala.inline
  implicit class AdapterStateOps[Self <: AdapterState] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscovering(value: Boolean): Self = this.set("discovering", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowered(value: Boolean): Self = this.set("powered", value.asInstanceOf[js.Any])
  }
  
}

