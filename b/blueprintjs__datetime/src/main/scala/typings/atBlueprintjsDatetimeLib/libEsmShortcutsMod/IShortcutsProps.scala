package typings
package atBlueprintjsDatetimeLib.libEsmShortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShortcutsProps extends js.Object {
  var allowSingleDayRange: scala.Boolean
  var maxDate: stdLib.Date
  var minDate: stdLib.Date
  var shortcuts: js.Array[IDateRangeShortcut] | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`true`
  var timePrecision: atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision
  def onShortcutClick(shortcut: IDateRangeShortcut): scala.Unit
}

object IShortcutsProps {
  @scala.inline
  def apply(
    allowSingleDayRange: scala.Boolean,
    maxDate: stdLib.Date,
    minDate: stdLib.Date,
    onShortcutClick: IDateRangeShortcut => scala.Unit,
    shortcuts: js.Array[IDateRangeShortcut] | atBlueprintjsDatetimeLib.atBlueprintjsDatetimeLibNumbers.`true`,
    timePrecision: atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange, maxDate = maxDate, minDate = minDate, onShortcutClick = js.Any.fromFunction1(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision)
  
    __obj.asInstanceOf[IShortcutsProps]
  }
}

