package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsMethodsModel extends js.Object {
  /**
    * Select all rows
    *
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(): RowsMethods = js.native
  def apply(modifier: ObjectSelectorModifier): RowsMethods = js.native
  /**
    * Select rows found by a row selector
    *
    * @param cellSelector Row selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(rowSelector: js.Any): RowsMethods = js.native
  def apply(rowSelector: js.Any, modifier: ObjectSelectorModifier): RowsMethods = js.native
  /**
    * Add new rows to the table using the data given
    *
    * @param data Array of data elements, with each one describing a new row to be added to the table
    */
  def add(data: js.Array[_]): Api = js.native
}

