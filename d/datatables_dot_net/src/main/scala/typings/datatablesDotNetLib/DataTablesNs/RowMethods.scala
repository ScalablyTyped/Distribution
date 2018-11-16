package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowMethods
  extends CoreMethods
     with CommonRowMethod {
  /**
           * Order Methods / object
           */
  @JSName("child")
  var child_Original: RowChildMethodModel = js.native
  /**
           * Get the child row(s) that have been set for a parent row
           */
  /**
           * Order Methods / object
           */
  def child(): datatablesDotNetLib.JQuery = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: datatablesDotNetLib.JQuery): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: datatablesDotNetLib.JQuery, className: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: java.lang.String, className: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: js.Array[java.lang.String | scala.Double | datatablesDotNetLib.JQuery]): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(
    data: js.Array[java.lang.String | scala.Double | datatablesDotNetLib.JQuery],
    className: java.lang.String
  ): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: stdLib.Node): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  /**
           * Order Methods / object
           */
  def child(data: stdLib.Node, className: java.lang.String): RowChildMethods = js.native
  /**
           * Get the child row(s) that have been set for a parent row
           *
           * @param showRemove This parameter can be given as true or false
           */
  /**
           * Order Methods / object
           */
  def child(showRemove: scala.Boolean): RowChildMethods = js.native
  /**
           * Get the data for the selected row
           */
  def data(): js.Array[_] | js.Object = js.native
  /**
           * Set the data for the selected row
           *
           * @param d Data to use for the row.
           */
  def data(d: js.Array[_]): Api = js.native
  /**
           * Set the data for the selected row
           *
           * @param d Data to use for the row.
           */
  def data(d: js.Object): Api = js.native
  /**
           * Get the id of the selected row. Since: 1.10.8
           *
           * @param hash true - Append a hash (#) to the start of the row id. This can be useful for then using the id as a selector
           * false - Do not modify the id value.
           * @returns Row id. If the row does not have an id available 'undefined' will be returned.
           */
  def id(): java.lang.String = js.native
  /**
           * Get the id of the selected row. Since: 1.10.8
           *
           * @param hash true - Append a hash (#) to the start of the row id. This can be useful for then using the id as a selector
           * false - Do not modify the id value.
           * @returns Row id. If the row does not have an id available 'undefined' will be returned.
           */
  def id(hash: scala.Boolean): java.lang.String = js.native
  /**
           * Get the row index of the row column.
           */
  def index(): scala.Double = js.native
  /**
           * Obtain the tr node for the selected row
           */
  def node(): stdLib.Node = js.native
  /**
           * Delete the selected row from the DataTable.
           */
  def remove(): stdLib.Node = js.native
}

