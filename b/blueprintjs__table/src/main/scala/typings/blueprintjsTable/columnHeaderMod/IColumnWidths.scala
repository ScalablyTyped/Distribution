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
    defaultColumnWidth: js.UndefOr[Double] = js.undefined,
    maxColumnWidth: js.UndefOr[Double] = js.undefined,
    minColumnWidth: js.UndefOr[Double] = js.undefined
  ): IColumnWidths = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultColumnWidth)) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColumnWidth)) __obj.updateDynamic("maxColumnWidth")(maxColumnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minColumnWidth)) __obj.updateDynamic("minColumnWidth")(minColumnWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnWidths]
  }
}

