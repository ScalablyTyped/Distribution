package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[ManagedDOMString] = js.native
  /** The port to use for the proxy */
  var Port: js.UndefOr[ManagedLong] = js.native
}

object ManagedProxyLocation {
  @scala.inline
  def apply(): ManagedProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProxyLocation]
  }
  @scala.inline
  implicit class ManagedProxyLocationOps[Self <: ManagedProxyLocation] (val x: Self) extends AnyVal {
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
    def setHost(value: ManagedDOMString): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    @scala.inline
    def setPort(value: ManagedLong): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
  
}

