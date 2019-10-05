package typings.datatablesDotNetDashFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsMethods extends js.Object {
  /*
    * Recalculate the height of one or more rows after a data change
    */
  def recalcHeight(): Api
}

object RowsMethods {
  @scala.inline
  def apply(recalcHeight: () => Api): RowsMethods = {
    val __obj = js.Dynamic.literal(recalcHeight = js.Any.fromFunction0(recalcHeight))
  
    __obj.asInstanceOf[RowsMethods]
  }
}

