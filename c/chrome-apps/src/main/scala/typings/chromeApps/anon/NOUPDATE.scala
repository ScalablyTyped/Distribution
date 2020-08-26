package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_available_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOUPDATE extends js.Object {
  var NO_UPDATE: no_update_ = js.native
  var THROTTLED: throttled_ = js.native
  var UPDATE_AVAILABLE: update_available_ = js.native
}

object NOUPDATE {
  @scala.inline
  def apply(NO_UPDATE: no_update_, THROTTLED: throttled_, UPDATE_AVAILABLE: update_available_): NOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOUPDATE]
  }
  @scala.inline
  implicit class NOUPDATEOps[Self <: NOUPDATE] (val x: Self) extends AnyVal {
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
    def setNO_UPDATE(value: no_update_): Self = this.set("NO_UPDATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHROTTLED(value: throttled_): Self = this.set("THROTTLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPDATE_AVAILABLE(value: update_available_): Self = this.set("UPDATE_AVAILABLE", value.asInstanceOf[js.Any])
  }
  
}

