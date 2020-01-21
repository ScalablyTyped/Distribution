package typings.baseui.dataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var batchActions: js.UndefOr[js.Array[BatchActionT]] = js.undefined
  var columns: js.Array[ColumnT]
  var onSelectionChange: js.UndefOr[js.Function1[/* rows */ js.Array[RowT], _]] = js.undefined
  var rowActions: js.UndefOr[js.Array[RowActionT]] = js.undefined
  var rows: js.Array[RowT]
}

object Props {
  @scala.inline
  def apply(
    columns: js.Array[ColumnT],
    rows: js.Array[RowT],
    batchActions: js.Array[BatchActionT] = null,
    onSelectionChange: /* rows */ js.Array[RowT] => _ = null,
    rowActions: js.Array[RowActionT] = null
  ): Props = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (batchActions != null) __obj.updateDynamic("batchActions")(batchActions.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (rowActions != null) __obj.updateDynamic("rowActions")(rowActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

