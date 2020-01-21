package typings.blueprintjsTable.columnHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnWidths extends js.Object {
  var defaultColumnWidth: js.UndefOr[Double] = js.undefined
  var maxColumnWidth: js.UndefOr[Double] = js.undefined
  var minColumnWidth: js.UndefOr[Double] = js.undefined
}

object IColumnWidths {
  @scala.inline
  def apply(
    defaultColumnWidth: Int | Double = null,
    maxColumnWidth: Int | Double = null,
    minColumnWidth: Int | Double = null
  ): IColumnWidths = {
    val __obj = js.Dynamic.literal()
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (maxColumnWidth != null) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnWidths]
  }
}

