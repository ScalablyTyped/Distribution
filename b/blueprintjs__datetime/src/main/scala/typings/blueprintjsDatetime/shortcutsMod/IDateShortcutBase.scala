package typings.blueprintjsDatetime.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateShortcutBase extends js.Object {
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

object IDateShortcutBase {
  @scala.inline
  def apply(label: String, includeTime: js.UndefOr[Boolean] = js.undefined): IDateShortcutBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTime)) __obj.updateDynamic("includeTime")(includeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateShortcutBase]
  }
}

