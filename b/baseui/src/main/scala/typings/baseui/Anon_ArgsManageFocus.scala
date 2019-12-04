package typings.baseui

import typings.baseui.pinDashCodeMod.PinCodeOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsManageFocus extends js.Object {
  var manageFocus: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[PinCodeOverrides] = js.undefined
  var values: js.Array[String]
  def onChange(args: Anon_EventValues): Unit
}

object Anon_ArgsManageFocus {
  @scala.inline
  def apply(
    onChange: Anon_EventValues => Unit,
    values: js.Array[String],
    manageFocus: js.UndefOr[Boolean] = js.undefined,
    overrides: PinCodeOverrides = null
  ): Anon_ArgsManageFocus = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(manageFocus)) __obj.updateDynamic("manageFocus")(manageFocus.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsManageFocus]
  }
}

