package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.INVALID_PIN
import typings.chromeApps.chromeAppsStrings.INVALID_PUK
import typings.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INVALIDPIN extends js.Object {
  var INVALID_PIN: typings.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
  var INVALID_PUK: typings.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: typings.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
}

object INVALIDPIN {
  @scala.inline
  def apply(
    INVALID_PIN: INVALID_PIN,
    INVALID_PUK: INVALID_PUK,
    MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED,
    UNKNOWN_ERROR: UNKNOWN_ERROR
  ): INVALIDPIN = {
    val __obj = js.Dynamic.literal(INVALID_PIN = INVALID_PIN.asInstanceOf[js.Any], INVALID_PUK = INVALID_PUK.asInstanceOf[js.Any], MAX_ATTEMPTS_EXCEEDED = MAX_ATTEMPTS_EXCEEDED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[INVALIDPIN]
  }
  @scala.inline
  implicit class INVALIDPINOps[Self <: INVALIDPIN] (val x: Self) extends AnyVal {
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
    def setINVALID_PIN(value: INVALID_PIN): Self = this.set("INVALID_PIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_PUK(value: INVALID_PUK): Self = this.set("INVALID_PUK", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAX_ATTEMPTS_EXCEEDED(value: MAX_ATTEMPTS_EXCEEDED): Self = this.set("MAX_ATTEMPTS_EXCEEDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN_ERROR(value: UNKNOWN_ERROR): Self = this.set("UNKNOWN_ERROR", value.asInstanceOf[js.Any])
  }
  
}

