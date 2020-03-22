package typings.baseui.timepickerMod

import typings.baseui.AnonSelect
import typings.baseui.baseuiStrings.`12`
import typings.baseui.baseuiStrings.`24`
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var creatable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[`12` | `24`] = js.undefined
  var nullable: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ Date, _]] = js.undefined
  var overrides: js.UndefOr[AnonSelect] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Date | Null] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    creatable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    format: `12` | `24` = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ Date => _ = null,
    overrides: AnonSelect = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: mini | default_ | compact | large_ = null,
    step: Int | Double = null,
    value: Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}

