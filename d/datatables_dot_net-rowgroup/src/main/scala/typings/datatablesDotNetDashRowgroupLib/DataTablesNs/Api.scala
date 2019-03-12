package typings
package datatablesDotNetDashRowgroupLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  def rowGroup(): RowGroupApi
}

object Api {
  @scala.inline
  def apply(rowGroup: () => RowGroupApi): Api = {
    val __obj = js.Dynamic.literal(rowGroup = js.Any.fromFunction0(rowGroup))
  
    __obj.asInstanceOf[Api]
  }
}

