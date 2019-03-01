package typings
package datatablesDotNetDashScrollerLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var scroller: ScrollerMethodsModel
}

object Api {
  @scala.inline
  def apply(scroller: ScrollerMethodsModel): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scroller")(scroller)
    __obj.asInstanceOf[Api]
  }
}

