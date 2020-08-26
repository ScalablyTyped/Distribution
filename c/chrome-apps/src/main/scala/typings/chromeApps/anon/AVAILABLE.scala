package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.available
import typings.chromeApps.chromeAppsStrings.enabled_
import typings.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVAILABLE extends js.Object {
  var AVAILABLE: available = js.native
  var ENABLED: enabled_ = js.native
  var UNKNOWN: unknown__ = js.native
}

object AVAILABLE {
  @scala.inline
  def apply(AVAILABLE: available, ENABLED: enabled_, UNKNOWN: unknown__): AVAILABLE = {
    val __obj = js.Dynamic.literal(AVAILABLE = AVAILABLE.asInstanceOf[js.Any], ENABLED = ENABLED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVAILABLE]
  }
  @scala.inline
  implicit class AVAILABLEOps[Self <: AVAILABLE] (val x: Self) extends AnyVal {
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
    def setAVAILABLE(value: available): Self = this.set("AVAILABLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setENABLED(value: enabled_): Self = this.set("ENABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
  
}

