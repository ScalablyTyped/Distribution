package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleListTable extends ListElementStyle {
  /**
    * Cell style.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /**
    * Header style.
    */
  var header: js.UndefOr[js.Any] = js.undefined
}

object StyleListTable {
  @scala.inline
  def apply(cell: js.Any = null, header: js.Any = null, item: js.Any = null, selected: js.Any = null): StyleListTable = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (header != null) __obj.updateDynamic("header")(header)
    if (item != null) __obj.updateDynamic("item")(item)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[StyleListTable]
  }
}

