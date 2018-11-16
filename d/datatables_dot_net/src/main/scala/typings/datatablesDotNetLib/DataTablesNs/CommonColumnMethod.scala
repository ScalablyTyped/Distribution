package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "cell-methods"
//#region "column-methods"
@js.native
trait CommonColumnMethod extends CommonSubMethods {
  /**
           * Get the footer th / td cell for the selected column.
           */
  def footer(): js.Any = js.native
  /**
           * Get the header th / td cell for a column.
           */
  def header(): stdLib.Node = js.native
  /**
           * Order the table, in the direction specified, by the column selected by the column()DT selector.
           *
           * @param direction Direction of sort to apply to the selected column - desc (descending) or asc (ascending).
           */
  def order(direction: java.lang.String): Api = js.native
  /**
           * Get the visibility of the selected column.
           */
  def visible(): scala.Boolean = js.native
  /**
           * Set the visibility of the selected column.
           *
           * @param show Specify if the column should be visible (true) or not (false).
           * @param redrawCalculations Indicate if DataTables should recalculate the column layout (true - default) or not (false).
           */
  def visible(show: scala.Boolean): Api = js.native
  /**
           * Set the visibility of the selected column.
           *
           * @param show Specify if the column should be visible (true) or not (false).
           * @param redrawCalculations Indicate if DataTables should recalculate the column layout (true - default) or not (false).
           */
  def visible(show: scala.Boolean, redrawCalculations: scala.Boolean): Api = js.native
}

