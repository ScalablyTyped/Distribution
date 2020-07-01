package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssistiveWindowProperties extends js.Object {
  var `type`: AssistiveWindowType
  var visible: Boolean
}

object AssistiveWindowProperties {
  @scala.inline
  def apply(`type`: AssistiveWindowType, visible: Boolean): AssistiveWindowProperties = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowProperties]
  }
}

