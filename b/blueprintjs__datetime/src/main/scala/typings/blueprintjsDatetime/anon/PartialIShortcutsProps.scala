package typings.blueprintjsDatetime.anon

import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typings.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/shortcuts.IShortcutsProps> */
trait PartialIShortcutsProps extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var onShortcutClick: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.undefined
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var shortcuts: js.UndefOr[js.Array[IDateRangeShortcut] | `true`] = js.undefined
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
}

object PartialIShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    maxDate: Date = null,
    minDate: Date = null,
    onShortcutClick: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit = null,
    selectedShortcutIndex: js.UndefOr[Double] = js.undefined,
    shortcuts: js.Array[IDateRangeShortcut] | `true` = null,
    timePrecision: TimePrecision = null,
    useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  ): PartialIShortcutsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onShortcutClick != null) __obj.updateDynamic("onShortcutClick")(js.Any.fromFunction2(onShortcutClick))
    if (!js.isUndefined(selectedShortcutIndex)) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.get.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleDateShortcuts)) __obj.updateDynamic("useSingleDateShortcuts")(useSingleDateShortcuts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIShortcutsProps]
  }
}

