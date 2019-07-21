package typings
package datatablesDotNetDashSelectLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMethods extends js.Object {
  /**
    * Deselect a cell
    */
  def deselect(): Api
  /**
    * Select cell
    */
  def select(): Api
}

object CellMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): CellMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
  
    __obj.asInstanceOf[CellMethods]
  }
}

