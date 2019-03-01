package typings
package datatablesDotNetDashFixedheaderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var fixedHeader: FixedHeaderApi
}

object Api {
  @scala.inline
  def apply(fixedHeader: FixedHeaderApi): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fixedHeader")(fixedHeader)
    __obj.asInstanceOf[Api]
  }
}

