package typings
package datatablesDotNetDashSelectLib.DataTablesNs

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
  def apply(deselect: js.Function0[Api], select: js.Function0[Api]): RowsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[RowsMethods]
  }
}

