package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var creatable: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[baseuiLib.baseuiLibStrings.`12` | baseuiLib.baseuiLibStrings.`24`] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ stdLib.Date, _]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_Select] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var value: stdLib.Date | scala.Null
}

object TimePickerProps {
  @scala.inline
  def apply(
    creatable: js.UndefOr[scala.Boolean] = js.undefined,
    format: baseuiLib.baseuiLibStrings.`12` | baseuiLib.baseuiLibStrings.`24` = null,
    onChange: /* args */ stdLib.Date => _ = null,
    overrides: baseuiLib.Anon_Select = null,
    step: scala.Int | scala.Double = null,
    value: stdLib.Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerProps]
  }
}

