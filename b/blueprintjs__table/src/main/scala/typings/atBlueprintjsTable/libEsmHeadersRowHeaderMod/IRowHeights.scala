package typings.atBlueprintjsTable.libEsmHeadersRowHeaderMod

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
    defaultRowHeight: Int | Double = null,
    maxRowHeight: Int | Double = null,
    minRowHeight: Int | Double = null
  ): IRowHeights = {
    val __obj = js.Dynamic.literal()
    if (defaultRowHeight != null) __obj.updateDynamic("defaultRowHeight")(defaultRowHeight.asInstanceOf[js.Any])
    if (maxRowHeight != null) __obj.updateDynamic("maxRowHeight")(maxRowHeight.asInstanceOf[js.Any])
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowHeights]
  }
}

