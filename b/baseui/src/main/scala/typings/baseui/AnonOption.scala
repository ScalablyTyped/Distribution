package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOption extends js.Object {
  var option: js.UndefOr[Option] = js.undefined
  var optionState: AnonDisabled
}

object AnonOption {
  @scala.inline
  def apply(optionState: AnonDisabled, option: Option = null): AnonOption = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOption]
  }
}

