package typings.datatablesNetSelect.DataTables

import typings.datatablesNetSelect.anon.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var select: Style
}

object Api {
  @scala.inline
  def apply(select: Style): Api = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

