package typings.baseui.timezonepickerMod

import typings.baseui.AnonSelect
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.selectMod.Option
import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerProps extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var mapLabels: js.UndefOr[js.Function1[/* args */ Option, ReactNode]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Timezone, _]] = js.undefined
  var overrides: js.UndefOr[AnonSelect] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TimezonePickerProps {
  @scala.inline
  def apply(
    date: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    mapLabels: /* args */ Option => ReactNode = null,
    onChange: /* value */ Timezone => _ = null,
    overrides: AnonSelect = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    value: String = null
  ): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (mapLabels != null) __obj.updateDynamic("mapLabels")(js.Any.fromFunction1(mapLabels))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerProps]
  }
}

