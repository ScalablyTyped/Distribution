package typings.atBlueprintjsDatetime.libEsmShortcutsMod

import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeNumbers.`true`
import typings.atBlueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShortcutsProps extends js.Object {
  var allowSingleDayRange: Boolean
  var maxDate: Date
  var minDate: Date
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  var shortcuts: js.Array[IDateRangeShortcut] | `true`
  var timePrecision: TimePrecision
  def onShortcutClick(shortcut: IDateRangeShortcut, index: Double): Unit
}

object IShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: Date,
    minDate: Date,
    onShortcutClick: (IDateRangeShortcut, Double) => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision,
    selectedShortcutIndex: Int | Double = null
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange, maxDate = maxDate, minDate = minDate, onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision)
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutsProps]
  }
}

