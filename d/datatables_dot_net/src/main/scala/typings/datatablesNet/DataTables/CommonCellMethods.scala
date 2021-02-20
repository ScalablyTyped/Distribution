package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "cell-methods"
@js.native
trait CommonCellMethods extends CommonSubMethods {
  
  /**
    * Invalidate the data held in DataTables for the selected cells
    *
    * @param source Data source to read the new data from.
    */
  def invalidate(): Api = js.native
  def invalidate(source: String): Api = js.native
  
  /**
    * Get data for the selected cell
    *
    * @param f Data type to get. This can be one of: 'display', 'filter', 'sort', 'type'
    */
  def render(t: String): js.Any = js.native
}
