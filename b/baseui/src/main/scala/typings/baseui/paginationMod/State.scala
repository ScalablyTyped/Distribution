package typings.baseui.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var currentPage: Double
}

object State {
  @scala.inline
  def apply(currentPage: Double): State = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

