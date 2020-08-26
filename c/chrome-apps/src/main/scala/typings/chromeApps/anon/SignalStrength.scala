package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalStrength extends js.Object {
  var SignalStrength: js.UndefOr[integer] = js.native
}

object SignalStrength {
  @scala.inline
  def apply(): SignalStrength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalStrength]
  }
  @scala.inline
  implicit class SignalStrengthOps[Self <: SignalStrength] (val x: Self) extends AnyVal {
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
    def setSignalStrength(value: integer): Self = this.set("SignalStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalStrength: Self = this.set("SignalStrength", js.undefined)
  }
  
}

