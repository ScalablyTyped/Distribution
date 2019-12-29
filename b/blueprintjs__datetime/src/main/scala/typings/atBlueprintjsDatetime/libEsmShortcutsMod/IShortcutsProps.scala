package typings.atBlueprintjsDatetime.libEsmShortcutsMod

import typings.atBlueprintjsDatetime.atBlueprintjsDatetimeBooleans.`true`
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
  /**
    * The DatePicker component reuses this component for a single date.
    * This changes the default shortcut labels and affects which shortcuts are used.
    * @default false
    */
  var useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
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
    selectedShortcutIndex: Int | Double = null,
    useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined
  ): IShortcutsProps = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onShortcutClick = js.Any.fromFunction2(onShortcutClick), shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleDateShortcuts)) __obj.updateDynamic("useSingleDateShortcuts")(useSingleDateShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutsProps]
  }
}

