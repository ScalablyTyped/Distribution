package typings.blueprintjsTable.rowHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowHeights extends js.Object {
  var defaultRowHeight: js.UndefOr[Double] = js.undefined
  var maxRowHeight: js.UndefOr[Double] = js.undefined
  var minRowHeight: js.UndefOr[Double] = js.undefined
}

object IRowHeights {
  @scala.inline
  def apply(
    defaultRowHeight: js.UndefOr[Double] = js.undefined,
    maxRowHeight: js.UndefOr[Double] = js.undefined,
    minRowHeight: js.UndefOr[Double] = js.undefined
  ): IRowHeights = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultRowHeight)) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRowHeight)) __obj.updateDynamic("maxRowHeight")(maxRowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRowHeight)) __obj.updateDynamic("minRowHeight")(minRowHeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowHeights]
  }
}

