package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var option: js.UndefOr[typings.baseui.selectMod.Option] = js.undefined
  var optionState: Disabled
}

object Option {
  @scala.inline
  def apply(optionState: Disabled, option: typings.baseui.selectMod.Option = null): Option = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

