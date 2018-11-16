package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowChildMethodModel extends js.Object {
  /**
           * Get the child row(s) that have been set for a parent row
           */
  def apply(): datatablesDotNetLib.JQuery = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: datatablesDotNetLib.JQuery): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: datatablesDotNetLib.JQuery, className: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: java.lang.String, className: java.lang.String): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: js.Array[java.lang.String | scala.Double | datatablesDotNetLib.JQuery]): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(
    data: js.Array[java.lang.String | scala.Double | datatablesDotNetLib.JQuery],
    className: java.lang.String
  ): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: stdLib.Node): RowChildMethods = js.native
  /**
           * Set the data to show in the child row(s). Note that calling this method will replace any child rows which are already attached to the parent row.
           *
           * @param data The data to be shown in the child row can be given in multiple different ways.
           * @param className Class name that is added to the td cell node(s) of the child row(s). As of 1.10.1 it is also added to the tr row node of the child row(s).
           */
  def apply(data: stdLib.Node, className: java.lang.String): RowChildMethods = js.native
  /**
           * Get the child row(s) that have been set for a parent row
           *
           * @param showRemove This parameter can be given as true or false
           */
  def apply(showRemove: scala.Boolean): RowChildMethods = js.native
  /**
           * Hide the child row(s) of a parent row
           */
  def hide(): Api = js.native
  /**
           * Check if the child rows of a parent row are visible
           */
  def isShown(): Api = js.native
  /**
           * Remove child row(s) from display and release any allocated memory
           */
  def remove(): Api = js.native
  /**
           * Show the child row(s) of a parent row
           */
  def show(): Api = js.native
}

