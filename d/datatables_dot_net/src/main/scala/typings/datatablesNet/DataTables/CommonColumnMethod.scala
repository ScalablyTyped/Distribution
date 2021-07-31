package typings.datatablesNet.DataTables

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "cell-methods"
//#region "column-methods"
@js.native
trait CommonColumnMethod
  extends StObject
     with CommonSubMethods {
  
  /**
    * Get the footer th / td cell for the selected column.
    */
  def footer(): HTMLElement = js.native
  
  /**
    * Get the header th / td cell for a column.
    */
  def header(): HTMLElement = js.native
  
  /**
    * Order the table, in the direction specified, by the column selected by the column()DT selector.
    *
    * @param direction Direction of sort to apply to the selected column - desc (descending) or asc (ascending).
    */
  def order(direction: String): Api = js.native
  
  /**
    * Get the visibility of the selected column.
    */
  def visible(): Boolean = js.native
  /**
    * Set the visibility of the selected column.
    *
    * @param show Specify if the column should be visible (true) or not (false).
    * @param redrawCalculations Indicate if DataTables should recalculate the column layout (true - default) or not (false).
    */
  def visible(show: Boolean): Api = js.native
  def visible(show: Boolean, redrawCalculations: Boolean): Api = js.native
}
