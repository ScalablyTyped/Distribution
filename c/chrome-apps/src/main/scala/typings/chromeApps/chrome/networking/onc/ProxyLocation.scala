package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[String] = js.native
  /** The port to use for the proxy */
  var Port: js.UndefOr[integer] = js.native
}

object ProxyLocation {
  @scala.inline
  def apply(): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyLocation]
  }
  @scala.inline
  implicit class ProxyLocationOps[Self <: ProxyLocation] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    @scala.inline
    def setPort(value: integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
  
}

