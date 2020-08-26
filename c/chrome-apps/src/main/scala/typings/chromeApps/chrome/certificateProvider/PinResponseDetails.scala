package typings.chromeApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinResponseDetails extends js.Object {
  var userInput: js.UndefOr[String] = js.native
}

object PinResponseDetails {
  @scala.inline
  def apply(): PinResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinResponseDetails]
  }
  @scala.inline
  implicit class PinResponseDetailsOps[Self <: PinResponseDetails] (val x: Self) extends AnyVal {
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
    def setUserInput(value: String): Self = this.set("userInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInput: Self = this.set("userInput", js.undefined)
  }
  
}

