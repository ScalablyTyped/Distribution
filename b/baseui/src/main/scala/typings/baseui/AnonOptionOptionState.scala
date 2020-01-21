package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionOptionState extends js.Object {
  var option: Option
  var optionState: AnonDisabledIsHighlighted
}

object AnonOptionOptionState {
  @scala.inline
  def apply(option: Option, optionState: AnonDisabledIsHighlighted): AnonOptionOptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptionOptionState]
  }
}

