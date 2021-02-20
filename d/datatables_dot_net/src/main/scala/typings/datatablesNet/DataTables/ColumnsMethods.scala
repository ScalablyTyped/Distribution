package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsMethods
  extends CoreMethods
     with CommonColumnMethod {
  
  /**
    * Obtain the data for the columns from the selector
    */
  def data(): Api = js.native
  
  /**
    * Get the data source property for the selected columns.
    */
  def dataSrc(): Api = js.native
  
  /**
    * Iterate over each selected column, with the function context set to be the column in question. Since: DataTables 1.10.6
    *
    * @param fn Function to execute for every column selected.
    */
  def every(
    fn: js.ThisFunction3[
      /* this */ ColumnMethods, 
      /* colIdx */ Double, 
      /* tableLoop */ Double, 
      /* colLoop */ Double, 
      Unit
    ]
  ): Api = js.native
  
  /**
    * Get the column indexes of the selected columns.
    *
    * @param t Specify if you want to get the column data index (default) or the visible index (visible).
    */
  def indexes(): Api = js.native
  def indexes(t: String): Api = js.native
  
  /**
    * Obtain the th / td nodes for the selected columns
    */
  def nodes(): js.Array[js.Array[Api]] = js.native
}
