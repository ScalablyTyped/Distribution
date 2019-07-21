package typings
package datatablesDotNetDashFixedcolumnsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedColumnsMethods extends Api {
  /*
    * @Deprecated(use dt.cell(this).index())
    * Get the cell index of a cell in a fixed column
    */
  def cellIndex(): CellIndex
  /*
    * Redraw the fixed columns based on new table size
    */
  def relayout(): Api
  /*
    * @Deprecated(use dt.row(this).index())
    * Get the row index of a row in a fixed column
    */
  def rowIndex(): scala.Double
  /*
    * Update the data shown in the FixedColumns
    */
  def update(): Api
}

object FixedColumnsMethods {
  @scala.inline
  def apply(
    cellIndex: () => CellIndex,
    fixedColumns: () => FixedColumnsMethods,
    relayout: () => Api,
    rowIndex: () => scala.Double,
    update: () => Api
  ): FixedColumnsMethods = {
    val __obj = js.Dynamic.literal(cellIndex = js.Any.fromFunction0(cellIndex), fixedColumns = js.Any.fromFunction0(fixedColumns), relayout = js.Any.fromFunction0(relayout), rowIndex = js.Any.fromFunction0(rowIndex), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[FixedColumnsMethods]
  }
}

