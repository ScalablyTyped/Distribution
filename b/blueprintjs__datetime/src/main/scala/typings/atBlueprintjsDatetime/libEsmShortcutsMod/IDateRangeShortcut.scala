package typings.atBlueprintjsDatetime.libEsmShortcutsMod

import typings.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeShortcut extends js.Object {
  /**
    * Date range represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var dateRange: DateRange
  /**
    * Set this prop to `true` to allow this shortcut to change the selected
    * times as well as the dates. By default, time components of a shortcut are
    * ignored; clicking a shortcut takes the date components of the `dateRange`
    * and combines them with the currently selected time.
    * @default false
    */
  var includeTime: js.UndefOr[Boolean] = js.undefined
  /** Shortcut label that appears in the list. */
  var label: String
}

object IDateRangeShortcut {
  @scala.inline
  def apply(dateRange: DateRange, label: String, includeTime: js.UndefOr[Boolean] = js.undefined): IDateRangeShortcut = {
    val __obj = js.Dynamic.literal(dateRange = dateRange, label = label)
    if (!js.isUndefined(includeTime)) __obj.updateDynamic("includeTime")(includeTime)
    __obj.asInstanceOf[IDateRangeShortcut]
  }
}

