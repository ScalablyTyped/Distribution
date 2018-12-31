package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-methods"
//#region "order-methods"
@js.native
trait OrderMethods extends js.Object {
  /**
    * Get the ordering applied to the table.
    */
  def apply(): js.Array[js.Array[java.lang.String | scala.Double]] = js.native
  def apply(order: js.Array[(js.Array[java.lang.String | scala.Double]) | scala.Double | java.lang.String]): Api = js.native
  def apply(order: js.Array[java.lang.String | scala.Double], args: js.Any*): Api = js.native
  /**
    * Get the fixed ordering that is applied to the table. If there is more than one table in the API's context,
    * the ordering of the first table will be returned only (use table() if you require the ordering of a different table in the API's context).
    */
  def fixed(): ObjectOrderFixed = js.native
  /**
    * Set the table's fixed ordering. Note this doesn't actually perform the order, but rather queues it up - use draw() to perform the ordering.
    */
  def fixed(order: ObjectOrderFixed): Api = js.native
  def listener(node: datatablesDotNetLib.JQuery, column: scala.Double, callback: js.Function0[scala.Unit]): Api = js.native
  /**
    * Add an ordering listener to an element, for a given column.
    *
    * @param node Selector
    * @param column Column index
    * @param callback Callback function
    */
  def listener(node: java.lang.String, column: scala.Double, callback: js.Function0[scala.Unit]): Api = js.native
  def listener(node: stdLib.Node, column: scala.Double, callback: js.Function0[scala.Unit]): Api = js.native
}

