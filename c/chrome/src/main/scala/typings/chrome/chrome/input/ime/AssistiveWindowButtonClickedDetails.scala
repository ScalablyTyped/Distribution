package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssistiveWindowButtonClickedDetails extends js.Object {
  /** The ID of the button clicked. */
  var buttonID: AssistiveWindowButton = js.native
  /** The type of the assistive window. */
  var windowType: AssistiveWindowType = js.native
}

object AssistiveWindowButtonClickedDetails {
  @scala.inline
  def apply(buttonID: AssistiveWindowButton, windowType: AssistiveWindowType): AssistiveWindowButtonClickedDetails = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowButtonClickedDetails]
  }
  @scala.inline
  implicit class AssistiveWindowButtonClickedDetailsOps[Self <: AssistiveWindowButtonClickedDetails] (val x: Self) extends AnyVal {
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
    def setButtonID(value: AssistiveWindowButton): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowType(value: AssistiveWindowType): Self = this.set("windowType", value.asInstanceOf[js.Any])
  }
  
}

