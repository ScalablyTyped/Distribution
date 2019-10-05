package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowMethodsModel extends js.Object {
  /**
    * Select a row found by a row selector
    *
    * @param rowSelector Row selector.
    * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
    */
  def apply(rowSelector: js.Any): RowMethods = js.native
  def apply(rowSelector: js.Any, modifier: ObjectSelectorModifier): RowMethods = js.native
  /**
    * Add a new row to the table using the given data
    *
    * @param data Data to use for the new row. This may be an array, object or Javascript object instance, but must be in the same format as the other data in the table
    */
  def add(data: js.Array[_]): Api = js.native
  def add(data: js.Object): Api = js.native
}

