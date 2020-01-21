package typings.baseui

import typings.baseui.pinCodeMod.PinCodeOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsManageFocus extends js.Object {
  var manageFocus: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[PinCodeOverrides] = js.undefined
  var values: js.Array[String]
  def onChange(args: AnonEventValues): Unit
}

object AnonArgsManageFocus {
  @scala.inline
  def apply(
    onChange: AnonEventValues => Unit,
    values: js.Array[String],
    manageFocus: js.UndefOr[Boolean] = js.undefined,
    overrides: PinCodeOverrides = null
  ): AnonArgsManageFocus = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(manageFocus)) __obj.updateDynamic("manageFocus")(manageFocus.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsManageFocus]
  }
}

