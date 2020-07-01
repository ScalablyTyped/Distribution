package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssistiveWindowButtonClickedDetails extends js.Object {
  /** The ID of the button clicked. */
  var buttonID: AssistiveWindowButton
  /** The type of the assistive window. */
  var windowType: AssistiveWindowType
}

object AssistiveWindowButtonClickedDetails {
  @scala.inline
  def apply(buttonID: AssistiveWindowButton, windowType: AssistiveWindowType): AssistiveWindowButtonClickedDetails = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowButtonClickedDetails]
  }
}

