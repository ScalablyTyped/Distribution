package typings
package atBlueprintjsDatetimeLib.libEsmShortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeShortcut extends js.Object {
  /**
    * Date range represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var dateRange: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange
  /**
    * Set this prop to `true` to allow this shortcut to change the selected
    * times as well as the dates. By default, time components of a shortcut are
    * ignored; clicking a shortcut takes the date components of the `dateRange`
    * and combines them with the currently selected time.
    * @default false
    */
  var includeTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Shortcut label that appears in the list. */
  var label: java.lang.String
}

object IDateRangeShortcut {
  @scala.inline
  def apply(
    dateRange: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange,
    label: java.lang.String,
    includeTime: js.UndefOr[scala.Boolean] = js.undefined
  ): IDateRangeShortcut = {
    val __obj = js.Dynamic.literal(dateRange = dateRange, label = label)
    if (!js.isUndefined(includeTime)) __obj.updateDynamic("includeTime")(includeTime)
    __obj.asInstanceOf[IDateRangeShortcut]
  }
}

