package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionOptionState extends js.Object {
  var option: Option
  var optionState: Anon_DisabledIsHighlighted
}

object Anon_OptionOptionState {
  @scala.inline
  def apply(option: Option, optionState: Anon_DisabledIsHighlighted): Anon_OptionOptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OptionOptionState]
  }
}

