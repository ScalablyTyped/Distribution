package typings.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedColumnsMethods extends Api {
  /*
    * @Deprecated(use dt.cell(this).index())
    * Get the cell index of a cell in a fixed column
    */
  def cellIndex(): CellIndex = js.native
  /*
    * Redraw the fixed columns based on new table size
    */
  def relayout(): Api = js.native
  /*
    * @Deprecated(use dt.row(this).index())
    * Get the row index of a row in a fixed column
    */
  def rowIndex(): Double = js.native
  /*
    * Update the data shown in the FixedColumns
    */
  def update(): Api = js.native
}

object FixedColumnsMethods {
  @scala.inline
  def apply(
    cellIndex: () => CellIndex,
    fixedColumns: () => FixedColumnsMethods,
    relayout: () => Api,
    rowIndex: () => Double,
    update: () => Api
  ): FixedColumnsMethods = {
    val __obj = js.Dynamic.literal(cellIndex = js.Any.fromFunction0(cellIndex), fixedColumns = js.Any.fromFunction0(fixedColumns), relayout = js.Any.fromFunction0(relayout), rowIndex = js.Any.fromFunction0(rowIndex), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[FixedColumnsMethods]
  }
  @scala.inline
  implicit class FixedColumnsMethodsOps[Self <: FixedColumnsMethods] (val x: Self) extends AnyVal {
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
    def setCellIndex(value: () => CellIndex): Self = this.set("cellIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setRelayout(value: () => Api): Self = this.set("relayout", js.Any.fromFunction0(value))
    @scala.inline
    def setRowIndex(value: () => Double): Self = this.set("rowIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Api): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

