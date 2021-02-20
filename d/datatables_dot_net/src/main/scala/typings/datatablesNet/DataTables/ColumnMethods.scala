package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMethods
  extends CoreMethods
     with CommonColumnMethod {
  
  /**
    * Get the data for the cells in the selected column.
    */
  def data(): Api = js.native
  
  /**
    * Get the data source property for the selected column
    */
  def dataSrc(): Double | String | js.Function0[String] = js.native
  
  /**
    * Get index information about the selected cell
    *
    * @param t Specify if you want to get the column data index (default) or the visible index (visible).
    */
  def index(): Double = js.native
  def index(t: String): Double = js.native
  
  /**
    * Obtain the th / td nodes for the selected column
    */
  def nodes(): Api = js.native
}
