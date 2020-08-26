package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.failure_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONNECTEDFAILURE extends js.Object {
  var CONNECTED: connected__ = js.native
  var FAILURE: failure_ = js.native
}

object CONNECTEDFAILURE {
  @scala.inline
  def apply(CONNECTED: connected__, FAILURE: failure_): CONNECTEDFAILURE = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], FAILURE = FAILURE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONNECTEDFAILURE]
  }
  @scala.inline
  implicit class CONNECTEDFAILUREOps[Self <: CONNECTEDFAILURE] (val x: Self) extends AnyVal {
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
    def setCONNECTED(value: connected__): Self = this.set("CONNECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAILURE(value: failure_): Self = this.set("FAILURE", value.asInstanceOf[js.Any])
  }
  
}

