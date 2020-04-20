package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionState extends js.Object {
  var option: Option
  var optionState: AnonIsHighlighted
}

object AnonOptionState {
  @scala.inline
  def apply(option: Option, optionState: AnonIsHighlighted): AnonOptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionState]
  }
}

