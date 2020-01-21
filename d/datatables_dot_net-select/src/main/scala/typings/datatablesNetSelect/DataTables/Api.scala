package typings.datatablesNetSelect.DataTables

import typings.datatablesNetSelect.AnonApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var select: AnonApi
}

object Api {
  @scala.inline
  def apply(select: AnonApi): Api = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Api]
  }
}

