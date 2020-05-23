package typings.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegion extends js.Object {
  /**
    * The first and last column indices in the region, inclusive and
    * zero-indexed. If `cols` is `null`, then all columns are understood to be
    * included in the region.
    */
  var cols: js.UndefOr[ICellInterval | Null] = js.undefined
  /**
    * The first and last row indices in the region, inclusive and zero-indexed.
    * If `rows` is `null`, then all rows are understood to be included in the
    * region.
    */
  var rows: js.UndefOr[ICellInterval | Null] = js.undefined
}

object IRegion {
  @scala.inline
  def apply(
    cols: js.UndefOr[Null | ICellInterval] = js.undefined,
    rows: js.UndefOr[Null | ICellInterval] = js.undefined
  ): IRegion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegion]
  }
}

