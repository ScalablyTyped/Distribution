package typings.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMethods extends js.Object {
  /**
    * Deselect a row
    */
  def deselect(): Api
  /**
    * Select a row
    */
  def select(): Api
}

object RowMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): RowMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
  
    __obj.asInstanceOf[RowMethods]
  }
}

