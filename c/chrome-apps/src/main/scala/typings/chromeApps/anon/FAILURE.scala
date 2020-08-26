package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device_
import typings.chromeApps.chromeAppsStrings.success_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FAILURE extends js.Object {
  var FAILURE: failure_ = js.native
  var IN_USE: in_use_ = js.native
  var NO_SUCH_DEVICE: no_such_device_ = js.native
  var SUCCESS: success_ = js.native
}

object FAILURE {
  @scala.inline
  def apply(FAILURE: failure_, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device_, SUCCESS: success_): FAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[FAILURE]
  }
  @scala.inline
  implicit class FAILUREOps[Self <: FAILURE] (val x: Self) extends AnyVal {
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
    def setFAILURE(value: failure_): Self = this.set("FAILURE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIN_USE(value: in_use_): Self = this.set("IN_USE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_SUCH_DEVICE(value: no_such_device_): Self = this.set("NO_SUCH_DEVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUCCESS(value: success_): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
  }
  
}

