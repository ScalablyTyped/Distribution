package typings.datatablesNetScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var scroller: ScrollerMethodsModel
}

object Api {
  @scala.inline
  def apply(scroller: ScrollerMethodsModel): Api = {
    val __obj = js.Dynamic.literal(scroller = scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

