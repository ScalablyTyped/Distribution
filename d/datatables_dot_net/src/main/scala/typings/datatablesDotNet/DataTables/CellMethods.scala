package typings.datatablesDotNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMethods
  extends CoreMethods
     with CommonCellMethods {
  /**
    * Get data for the selected cell
    */
  def data(): js.Any = js.native
  /**
    * Get data for the selected cell
    *
    * @param data Value to assign to the data for the cell
    */
  def data(data: js.Any): Api = js.native
  /**
    * Get index information about the selected cell
    */
  def index(): CellIndexReturn = js.native
  /**
    * Get the DOM element for the selected cell
    */
  def node(): Node = js.native
}

