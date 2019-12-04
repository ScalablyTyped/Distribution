package typings.baseui

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Option extends js.Object {
  var option: js.UndefOr[Option] = js.undefined
  var optionState: Anon_Disabled
}

object Anon_Option {
  @scala.inline
  def apply(optionState: Anon_Disabled, option: Option = null): Anon_Option = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Option]
  }
}

