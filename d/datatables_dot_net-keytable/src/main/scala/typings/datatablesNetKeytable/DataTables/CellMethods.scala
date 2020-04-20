package typings.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMethods extends js.Object {
  /*
    * Focus on a cell
    */
  def focus(): Api
}

object CellMethods {
  @scala.inline
  def apply(focus: () => Api): CellMethods = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[CellMethods]
  }
}

