package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.NumberDictionary
import typings.datatablesNet.JQuery
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api
  extends StObject
     with CoreMethods
     with /**
  * API should be array-like
  */
/* key */ NumberDictionary[Any] {
  
  /**
    * Returns DataTables API instance
    *
    * @param table Selector string for table
    */
  def apply(selector: String): Api = js.native
  def apply(selector: js.Array[Node]): Api = js.native
  def apply(selector: JQuery): Api = js.native
  def apply(selector: Node): Api = js.native
  
  //#region "Cell/Cells"
  /**
    * Select the cell found by a cell selector
    *
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering
    */
  def cell(cellSelector: Any): CellMethods = js.native
  def cell(cellSelector: Any, modifier: ObjectSelectorModifier): CellMethods = js.native
  /**
    * Select the cell found by a cell selector
    *
    * @param rowSelector Row selector.
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering
    */
  def cell(rowSelector: Any, cellSelector: Any): CellMethods = js.native
  def cell(rowSelector: Any, cellSelector: Any, modifier: ObjectSelectorModifier): CellMethods = js.native
  
  /**
    * Select all cells
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering
    */
  def cells(): CellsMethods = js.native
  /**
    * Select cells found by a cell selector
    *
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering
    */
  def cells(cellSelector: Any): CellsMethods = js.native
  def cells(cellSelector: Any, modifier: ObjectSelectorModifier): CellsMethods = js.native
  def cells(modifier: ObjectSelectorModifier): CellsMethods = js.native
  /**
    * Select cells found by both row and column selectors
    *
    * @param rowSelector Row selector.
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering
    */
  def cells(rowSelector: Any, cellSelector: Any): CellsMethods = js.native
  def cells(rowSelector: Any, cellSelector: Any, modifier: ObjectSelectorModifier): CellsMethods = js.native
  
  /**
    * Select the column found by a column selector
    *
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  //#endregion "Cell/Cells"
  //#region "Column/Columns"
  /**
    * Column Methods / object
    */
  def column(columnSelector: Any): ColumnMethods = js.native
  def column(columnSelector: Any, modifier: ObjectSelectorModifier): ColumnMethods = js.native
  //#endregion "Cell/Cells"
  //#region "Column/Columns"
  /**
    * Column Methods / object
    */
  @JSName("column")
  var column_Original: ColumnMethodsModel = js.native
  
  /**
    * Select all columns
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  /**
    * Columns Methods / object
    */
  def columns(): ColumnsMethods = js.native
  /**
    * Select columns found by a cell selector
    *
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  /**
    * Columns Methods / object
    */
  def columns(columnSelector: Any): ColumnsMethods = js.native
  def columns(columnSelector: Any, modifier: ObjectSelectorModifier): ColumnsMethods = js.native
  def columns(modifier: ObjectSelectorModifier): ColumnsMethods = js.native
  /**
    * Columns Methods / object
    */
  @JSName("columns")
  var columns_Original: ColumnsMethodsModel = js.native
  
  /**
    * Get the data for the whole table.
    */
  def data(): Api = js.native
  
  /**
    * Get the ordering applied to the table.
    */
  /**
    * Order Methods / object
    */
  def order(): js.Array[js.Array[String | Double]] = js.native
  def order(order: js.Array[(js.Array[String | Double]) | Double | String]): Api = js.native
  /**
    * Order Methods / object
    */
  def order(order: js.Array[String | Double], args: Any*): Api = js.native
  /**
    * Set the ordering applied to the table.
    *
    * @param order Order Model
    */
  /**
    * Order Methods / object
    */
  @JSName("order")
  def order_Api(): Api = js.native
  /**
    * Order Methods / object
    */
  @JSName("order")
  var order_Original: OrderMethods = js.native
  
  /**
    * Select a row found by a row selector
    *
    * @param rowSelector Row selector. If undefined returns the first row in the DataTable.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  //#endregion "Column/Columns"
  //#region "Row/Rows"
  /**
    * Row Methode / object
    */
  def row(): RowMethods = js.native
  def row(rowSelector: Any): RowMethods = js.native
  def row(rowSelector: Any, modifier: ObjectSelectorModifier): RowMethods = js.native
  def row(rowSelector: Unit, modifier: ObjectSelectorModifier): RowMethods = js.native
  //#endregion "Column/Columns"
  //#region "Row/Rows"
  /**
    * Row Methode / object
    */
  @JSName("row")
  var row_Original: RowMethodsModel = js.native
  
  /**
    * Select all rows
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  /**
    * Rows Methods / object
    */
  def rows(): RowsMethods = js.native
  def rows(modifier: ObjectSelectorModifier): RowsMethods = js.native
  def rows(rowSelector: Any): RowsMethods = js.native
  def rows(rowSelector: Any, modifier: ObjectSelectorModifier): RowsMethods = js.native
  def rows(rowSelector: Unit, modifier: ObjectSelectorModifier): RowsMethods = js.native
  /**
    * Rows Methods / object
    */
  @JSName("rows")
  var rows_Original: RowsMethodsModel = js.native
  
  //#endregion "Row/Rows"
  //#region "Table/Tables"
  /**
    * Select a table based on a selector from the API's context
    *
    * @param tableSelector Table selector.
    */
  def table(tableSelector: Any): TableMethods = js.native
  
  /**
    * Select tables based on the given selector
    *
    * @param tableSelector Table selector.
    */
  def tables(): TablesMethods = js.native
  def tables(tableSelector: Any): TablesMethods = js.native
}
