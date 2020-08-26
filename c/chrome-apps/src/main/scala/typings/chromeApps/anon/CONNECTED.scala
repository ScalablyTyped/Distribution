package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONNECTED extends js.Object {
  var CONNECTED: Connected_ = js.native
  var CONNECTING: Connecting_ = js.native
  var DISCONNECTED: Disconnected_ = js.native
}

object CONNECTED {
  @scala.inline
  def apply(CONNECTED: Connected_, CONNECTING: Connecting_, DISCONNECTED: Disconnected_): CONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONNECTED]
  }
  @scala.inline
  implicit class CONNECTEDOps[Self <: CONNECTED] (val x: Self) extends AnyVal {
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
    def setCONNECTED(value: Connected_): Self = this.set("CONNECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONNECTING(value: Connecting_): Self = this.set("CONNECTING", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISCONNECTED(value: Disconnected_): Self = this.set("DISCONNECTED", value.asInstanceOf[js.Any])
  }
  
}

