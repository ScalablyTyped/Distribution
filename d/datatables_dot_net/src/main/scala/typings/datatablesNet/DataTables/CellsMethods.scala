package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellsMethods
  extends CoreMethods
     with CommonCellMethods {
  
  /**
    * Get data for the selected cells
    */
  def data(): Api = js.native
  
  /**
    * Iterate over each selected cell, with the function context set to be the cell in question. Since: DataTables 1.10.6
    *
    * @param fn Function to execute for every cell selected.
    */
  def every(
    fn: js.ThisFunction4[
      /* this */ CellMethods, 
      /* cellRowIdx */ Double, 
      /* cellColIdx */ Double, 
      /* tableLoop */ Double, 
      /* cellLoop */ Double, 
      Unit
    ]
  ): Api = js.native
  
  /**
    * Get index information about the selected cells
    */
  def indexes(): Api = js.native
  
  /**
    * Get the DOM elements for the selected cells
    */
  def nodes(): Api = js.native
}
