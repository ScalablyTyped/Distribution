package typings.cordovaPluginDialogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object, passed to promptCallback */
trait NotificationPromptResult extends js.Object {
  /**
    * The index of the pressed button. Note that the index uses one-based indexing, so the value is 1, 2, 3, etc.
    * 0 is the result when the dialog is dismissed without a button press.
    */
  var buttonIndex: Double
  /** The text entered in the prompt dialog box. */
  var input1: String
}

object NotificationPromptResult {
  @scala.inline
  def apply(buttonIndex: Double, input1: String): NotificationPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPromptResult]
  }
}

