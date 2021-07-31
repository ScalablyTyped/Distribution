package typings.datatablesNet.DataTables

import typings.datatablesNet.JQuery
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowMethods
  extends StObject
     with CoreMethods
     with CommonRowMethod {
  
  /**
    * Get the child row(s) that have been set for a parent row
    */
  /**
    * Order Methods / object
    */
  def child(): JQuery = js.native
  /**
    * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
    *
    * @param data The data to be shown in the child row can be given in multiple different ways.
    * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
    */
  /**
    * Order Methods / object
    */
  def child(data: String): RowChildMethods = js.native
  def child(data: String, className: String): RowChildMethods = js.native
  def child(data: js.Array[String | Double | JQuery]): RowChildMethods = js.native
  def child(data: js.Array[String | Double | JQuery], className: String): RowChildMethods = js.native
  def child(data: JQuery): RowChildMethods = js.native
  def child(data: JQuery, className: String): RowChildMethods = js.native
  def child(data: Node): RowChildMethods = js.native
  def child(data: Node, className: String): RowChildMethods = js.native
  /**
    * Get the child row(s) that have been set for a parent row
    *
    * @param showRemove This parameter can be given as true or false
    */
  /**
    * Order Methods / object
    */
  def child(showRemove: Boolean): RowChildMethods = js.native
  /**
    * Order Methods / object
    */
  @JSName("child")
  var child_Original: RowChildMethodModel = js.native
  
  /**
    * Get the data for the selected row
    */
  def data(): js.Array[js.Any] | js.Object = js.native
  /**
    * Set the data for the selected row
    *
    * @param d Data to use for the row.
    */
  def data(d: js.Array[js.Any]): Api = js.native
  def data(d: js.Object): Api = js.native
  
  /**
    * Get the id of the selected row. Since: 1.10.8
    *
    * @param hash true - Append a hash (#) to the start of the row id. This can be useful for then using the id as a selector
    * false - Do not modify the id value.
    * @returns Row id. If the row does not have an id available 'undefined' will be returned.
    */
  def id(): String = js.native
  def id(hash: Boolean): String = js.native
  
  /**
    * Get the row index of the row column.
    */
  def index(): Double = js.native
  
  /**
    * Obtain the tr node for the selected row
    */
  def node(): Node = js.native
  
  /**
    * Delete the selected row from the DataTable.
    */
  def remove(): Node = js.native
}
