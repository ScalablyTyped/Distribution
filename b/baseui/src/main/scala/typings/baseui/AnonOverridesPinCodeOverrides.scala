package typings.baseui

import typings.baseui.pinCodeMod.PinCodeOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverridesPinCodeOverrides extends js.Object {
  var overrides: js.UndefOr[PinCodeOverrides] = js.undefined
}

object AnonOverridesPinCodeOverrides {
  @scala.inline
  def apply(overrides: PinCodeOverrides = null): AnonOverridesPinCodeOverrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverridesPinCodeOverrides]
  }
}

