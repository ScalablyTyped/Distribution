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
  var shortcuts: js.Array[IDateRangeShortcut] | `true`
  var timePrecision: TimePrecision
  def onShortcutClick(shortcut: IDateRangeShortcut): Unit
}

object IShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: Date,
    minDate: Date,
    onShortcutClick: IDateRangeShortcut => Unit,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange, maxDate = maxDate, minDate = minDate, onShortcutClick = js.Any.fromFunction1(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision)
  
    __obj.asInstanceOf[IShortcutsProps]
  }
}

