package typings.atBlueprintjsDatetime.libEsmShortcutsMod

import typings.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeShortcut extends IDateShortcutBase {
  /**
    * Date range represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var dateRange: DateRange
}

object IDateRangeShortcut {
  @scala.inline
  def apply(dateRange: DateRange, label: String, includeTime: js.UndefOr[Boolean] = js.undefined): IDateRangeShortcut = {
    val __obj = js.Dynamic.literal(dateRange = dateRange, label = label)
    if (!js.isUndefined(includeTime)) __obj.updateDynamic("includeTime")(includeTime)
    __obj.asInstanceOf[IDateRangeShortcut]
  }
}

