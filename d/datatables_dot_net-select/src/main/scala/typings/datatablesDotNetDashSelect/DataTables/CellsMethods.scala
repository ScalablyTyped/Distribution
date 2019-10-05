package typings.datatablesDotNetDashSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellsMethods extends js.Object {
  /**
    * Deselect cells
    */
  def deselect(): Api
  /**
    * Select multiple cells
    */
  def select(): Api
}

object CellsMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): CellsMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
  
    __obj.asInstanceOf[CellsMethods]
  }
}

