package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api
  extends CoreMethods
     with /**
         * API should be array-like
         */
/* key */ ScalablyTyped.runtime.NumberDictionary[js.Any] {
  //#endregion "Cell/Cells"
  //#region "Column/Columns"
  /**
           * Column Methods / object
           */
  @JSName("column")
  var column_Original: ColumnMethodsModel = js.native
  /**
           * Columns Methods / object
           */
  @JSName("columns")
  var columns_Original: ColumnsMethodsModel = js.native
  /**
           * Order Methods / object
           */
  @JSName("order")
  var order_Original: OrderMethods = js.native
  //#endregion "Column/Columns"
  //#region "Row/Rows"
  /**
           * Row Methode / object
           */
  @JSName("row")
  var row_Original: RowMethodsModel = js.native
  /**
           * Rows Methods / object
           */
  @JSName("rows")
  var rows_Original: RowsMethodsModel = js.native
  /**
           * Returns DataTables API instance
           *
           * @param table Selector string for table
           */
  def apply(selector: datatablesDotNetLib.JQuery): Api = js.native
  /**
           * Returns DataTables API instance
           *
           * @param table Selector string for table
           */
  def apply(selector: java.lang.String): Api = js.native
  /**
           * Returns DataTables API instance
           *
           * @param table Selector string for table
           */
  def apply(selector: js.Array[stdLib.Node]): Api = js.native
  /**
           * Returns DataTables API instance
           *
           * @param table Selector string for table
           */
  def apply(selector: stdLib.Node): Api = js.native
  //#region "Cell/Cells"
  /**
           * Select the cell found by a cell selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cell(cellSelector: js.Any): CellMethods = js.native
  //#region "Cell/Cells"
  /**
           * Select the cell found by a cell selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cell(cellSelector: js.Any, modifier: ObjectSelectorModifier): CellMethods = js.native
  /**
           * Select the cell found by a cell selector
           *
           * @param rowSelector Row selector.
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cell(rowSelector: js.Any, cellSelector: js.Any): CellMethods = js.native
  /**
           * Select the cell found by a cell selector
           *
           * @param rowSelector Row selector.
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cell(rowSelector: js.Any, cellSelector: js.Any, modifier: ObjectSelectorModifier): CellMethods = js.native
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
  def cells(cellSelector: js.Any): CellsMethods = js.native
  /**
           * Select cells found by a cell selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cells(cellSelector: js.Any, modifier: ObjectSelectorModifier): CellsMethods = js.native
  /**
           * Select all cells
           *
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cells(modifier: ObjectSelectorModifier): CellsMethods = js.native
  /**
           * Select cells found by both row and column selectors
           *
           * @param rowSelector Row selector.
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cells(rowSelector: js.Any, cellSelector: js.Any): CellsMethods = js.native
  /**
           * Select cells found by both row and column selectors
           *
           * @param rowSelector Row selector.
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering
           */
  def cells(rowSelector: js.Any, cellSelector: js.Any, modifier: ObjectSelectorModifier): CellsMethods = js.native
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
  def column(columnSelector: js.Any): ColumnMethods = js.native
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
  def column(columnSelector: js.Any, modifier: ObjectSelectorModifier): ColumnMethods = js.native
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
  def columns(columnSelector: js.Any): ColumnsMethods = js.native
  /**
           * Select columns found by a cell selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Columns Methods / object
           */
  def columns(columnSelector: js.Any, modifier: ObjectSelectorModifier): ColumnsMethods = js.native
  /**
           * Select all columns
           *
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Columns Methods / object
           */
  def columns(modifier: ObjectSelectorModifier): ColumnsMethods = js.native
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
  def order(): js.Array[js.Array[java.lang.String | scala.Double]] = js.native
  /**
           * Set the ordering applied to the table.
           *
           * @param order Order Model
           */
  /**
           * Order Methods / object
           */
  def order(order: js.Array[java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])]): Api = js.native
  /**
           * Order Methods / object
           */
  def order(order: js.Array[java.lang.String | scala.Double], args: js.Any*): Api = js.native
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
           * Select a row found by a row selector
           *
           * @param rowSelector Row selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  //#endregion "Column/Columns"
  //#region "Row/Rows"
  /**
           * Row Methode / object
           */
  def row(rowSelector: js.Any): RowMethods = js.native
  /**
           * Select a row found by a row selector
           *
           * @param rowSelector Row selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  //#endregion "Column/Columns"
  //#region "Row/Rows"
  /**
           * Row Methode / object
           */
  def row(rowSelector: js.Any, modifier: ObjectSelectorModifier): RowMethods = js.native
  /**
           * Select all rows
           *
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Rows Methods / object
           */
  def rows(): RowsMethods = js.native
  /**
           * Select all rows
           *
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Rows Methods / object
           */
  def rows(modifier: ObjectSelectorModifier): RowsMethods = js.native
  /**
           * Select rows found by a row selector
           *
           * @param cellSelector Row selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Rows Methods / object
           */
  def rows(rowSelector: js.Any): RowsMethods = js.native
  /**
           * Select rows found by a row selector
           *
           * @param cellSelector Row selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  /**
           * Rows Methods / object
           */
  def rows(rowSelector: js.Any, modifier: ObjectSelectorModifier): RowsMethods = js.native
  //#endregion "Row/Rows"
  //#region "Table/Tables"
  /**
           * Select a table based on a selector from the API's context
           *
           * @param tableSelector Table selector.
           */
  def table(tableSelector: js.Any): TableMethods = js.native
  /**
           * Select tables based on the given selector
           *
           * @param tableSelector Table selector.
           */
  def tables(): TablesMethods = js.native
  /**
           * Select tables based on the given selector
           *
           * @param tableSelector Table selector.
           */
  def tables(tableSelector: js.Any): TablesMethods = js.native
}

