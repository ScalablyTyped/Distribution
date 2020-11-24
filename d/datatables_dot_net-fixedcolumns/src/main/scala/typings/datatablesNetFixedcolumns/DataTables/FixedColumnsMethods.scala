package typings.datatablesNetFixedcolumns.DataTables

import typings.datatablesNet.DataTables.CellIndexReturn
import typings.datatablesNet.JQuery
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedColumnsMethods extends Api {
  
  /**
    * @deprecated
    * Deprecated as of v3.2.1 use dt.cell(this).index() instead
    *
    * Get the cell index of a cell in a fixed column
    *
    * @param row The cell (td or th) to get the cell index of. This can be either a cell in the fixed columns or in the host DataTable.
    */
  def cellIndex(row: JQuery): CellIndexReturn = js.native
  def cellIndex(row: Node): CellIndexReturn = js.native
  
  /**
    * @description Redraw the fixed columns based on new table size
    * @see {@link https://datatables.net/reference/api/fixedColumns().relayout()}
    */
  def relayout(): Api = js.native
  
  /**
    * @deprecated
    * Deprecated as of v3.2.1. Use dt.row(this).index() instead
    *
    * Get the row index of a row in a fixed column
    */
  def rowIndex(): Double = js.native
  
  /**
    * @description Update the data shown in the FixedColumns.
    * @see {@link https://datatables.net/reference/api/fixedColumns().update()}
    */
  def update(): Api = js.native
}
