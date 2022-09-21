package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMethods
  extends StObject
     with CoreMethods
     with CommonCellMethods {
  
  /**
    * Get data for the selected cell
    */
  def data(): Any = js.native
  /**
    * Get data for the selected cell
    *
    * @param data Value to assign to the data for the cell
    */
  def data(data: Any): Api = js.native
  
  /**
    * Get index information about the selected cell
    */
  def index(): CellIndexReturn = js.native
  
  /**
    * Get the DOM element for the selected cell
    */
  def node(): Node = js.native
}
