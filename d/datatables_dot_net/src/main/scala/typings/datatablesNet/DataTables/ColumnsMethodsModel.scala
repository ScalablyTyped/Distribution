package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsMethodsModel extends js.Object {
  
  /**
    * Select all columns
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(): ColumnsMethods = js.native
  /**
    * Select columns found by a cell selector
    *
    * @param cellSelector Cell selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(columnSelector: js.Any): ColumnsMethods = js.native
  def apply(columnSelector: js.Any, modifier: ObjectSelectorModifier): ColumnsMethods = js.native
  def apply(modifier: ObjectSelectorModifier): ColumnsMethods = js.native
  
  /**
    * Recalculate the column widths for layout.
    */
  def adjust(): Api = js.native
}
