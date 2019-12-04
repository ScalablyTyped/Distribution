package typings.baseui

import typings.baseui.pinDashCodeMod.PinCodeOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OverridesPinCodeOverrides extends js.Object {
  var overrides: js.UndefOr[PinCodeOverrides] = js.undefined
}

object Anon_OverridesPinCodeOverrides {
  @scala.inline
  def apply(overrides: PinCodeOverrides = null): Anon_OverridesPinCodeOverrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OverridesPinCodeOverrides]
  }
}

