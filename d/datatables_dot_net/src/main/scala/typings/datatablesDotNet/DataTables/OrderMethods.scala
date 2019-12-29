package typings.datatablesDotNet.DataTables

import typings.datatablesDotNet.JQuery
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-methods"
//#region "order-methods"
@js.native
trait OrderMethods extends js.Object {
  /**
    * Set the ordering applied to the table.
    *
    * @param order Order Model
    */
  def apply(): Api = js.native
  def apply(order: js.Array[(js.Array[String | Double]) | Double | String]): Api = js.native
  def apply(order: js.Array[String | Double], args: js.Any*): Api = js.native
  /**
    * Get the fixed ordering that is applied to the table. If there is more than one table in the API's context,
    * the ordering of the first table will be returned only (use table() if you require the ordering of a different table in the API's context).
    */
  def fixed(): ObjectOrderFixed = js.native
  /**
    * Set the table's fixed ordering. Note this doesn't actually perform the order, but rather queues it up - use draw() to perform the ordering.
    */
  def fixed(order: ObjectOrderFixed): Api = js.native
  /**
    * Add an ordering listener to an element, for a given column.
    *
    * @param node Selector
    * @param column Column index
    * @param callback Callback function
    */
  def listener(node: String, column: Double, callback: js.Function0[Unit]): Api = js.native
  def listener(node: JQuery, column: Double, callback: js.Function0[Unit]): Api = js.native
  def listener(node: Node, column: Double, callback: js.Function0[Unit]): Api = js.native
}

