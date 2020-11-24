package typings.baseui.dataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var batchActions: js.UndefOr[js.Array[BatchActionT]] = js.native
  
  var columns: js.Array[ColumnT] = js.native
  
  var onSelectionChange: js.UndefOr[js.Function1[/* rows */ js.Array[RowT], _]] = js.native
  
  var rowActions: js.UndefOr[js.Array[RowActionT]] = js.native
  
  var rows: js.Array[RowT] = js.native
}
object Props {
  
  @scala.inline
  def apply(columns: js.Array[ColumnT], rows: js.Array[RowT]): Props = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: ColumnT*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnT]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: RowT*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[RowT]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchActionsVarargs(value: BatchActionT*): Self = this.set("batchActions", js.Array(value :_*))
    
    @scala.inline
    def setBatchActions(value: js.Array[BatchActionT]): Self = this.set("batchActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchActions: Self = this.set("batchActions", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* rows */ js.Array[RowT] => _): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setRowActionsVarargs(value: RowActionT*): Self = this.set("rowActions", js.Array(value :_*))
    
    @scala.inline
    def setRowActions(value: js.Array[RowActionT]): Self = this.set("rowActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowActions: Self = this.set("rowActions", js.undefined)
  }
}
