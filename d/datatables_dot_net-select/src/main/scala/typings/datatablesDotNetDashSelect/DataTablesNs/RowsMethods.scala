package typings.datatablesDotNetDashSelect.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsMethods extends js.Object {
  /**
    * Deselect a row
    */
  def deselect(): Api
  /**
    * Select multiple rows
    */
  def select(): Api
}

object RowsMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): RowsMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
  
    __obj.asInstanceOf[RowsMethods]
  }
}

