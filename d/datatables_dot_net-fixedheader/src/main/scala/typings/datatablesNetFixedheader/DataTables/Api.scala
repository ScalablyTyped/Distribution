package typings.datatablesNetFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var fixedHeader: FixedHeaderApi
}

object Api {
  @scala.inline
  def apply(fixedHeader: FixedHeaderApi): Api = {
    val __obj = js.Dynamic.literal(fixedHeader = fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

