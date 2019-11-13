package typings.atBlueprintjsDatetime.libEsmShortcutsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerShortcut extends IDateShortcutBase {
  /**
    * Date represented by this shortcut. Note that time components of a
    * shortcut are ignored by default; set `includeTime: true` to respect them.
    */
  var date: Date
}

object IDatePickerShortcut {
  @scala.inline
  def apply(date: Date, label: String, includeTime: js.UndefOr[Boolean] = js.undefined): IDatePickerShortcut = {
    val __obj = js.Dynamic.literal(date = date, label = label)
    if (!js.isUndefined(includeTime)) __obj.updateDynamic("includeTime")(includeTime)
    __obj.asInstanceOf[IDatePickerShortcut]
  }
}

