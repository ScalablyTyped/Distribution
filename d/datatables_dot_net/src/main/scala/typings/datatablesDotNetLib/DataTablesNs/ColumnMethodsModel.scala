package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMethodsModel extends js.Object {
  /**
           * Select the column found by a column selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  def apply(columnSelector: js.Any): ColumnMethods = js.native
  /**
           * Select the column found by a column selector
           *
           * @param cellSelector Cell selector.
           * @param Option used to specify how the cells should be ordered, and if paging or filtering in the table should be taken into account.
           */
  def apply(columnSelector: js.Any, modifier: ObjectSelectorModifier): ColumnMethods = js.native
  /**
           * Convert from the input column index type to that required.
           *
           * @param t The type on conversion that should take place: 'fromVisible', 'toData', 'fromData', 'toVisible'
           * @param index The index to be converted
           */
  def index(t: java.lang.String, index: scala.Double): scala.Double = js.native
}

