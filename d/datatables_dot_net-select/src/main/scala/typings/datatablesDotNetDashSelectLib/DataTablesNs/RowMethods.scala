package typings
package datatablesDotNetDashSelectLib.DataTablesNs

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
  def apply(deselect: js.Function0[Api], select: js.Function0[Api]): RowMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[RowMethods]
  }
}

