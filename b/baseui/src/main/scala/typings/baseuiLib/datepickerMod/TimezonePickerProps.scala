package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerProps extends js.Object {
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var mapLabels: js.UndefOr[js.Function1[/* args */ baseuiLib.selectMod.Option, reactLib.reactMod.ReactNode]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ baseuiLib.Anon_Id, _]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_Select] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TimezonePickerProps {
  @scala.inline
  def apply(
    date: stdLib.Date = null,
    mapLabels: /* args */ baseuiLib.selectMod.Option => reactLib.reactMod.ReactNode = null,
    onChange: /* value */ baseuiLib.Anon_Id => _ = null,
    overrides: baseuiLib.Anon_Select = null,
    value: java.lang.String = null
  ): TimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (mapLabels != null) __obj.updateDynamic("mapLabels")(js.Any.fromFunction1(mapLabels))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimezonePickerProps]
  }
}

