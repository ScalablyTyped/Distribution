package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var currentPage: scala.Double
}

object State {
  @scala.inline
  def apply(currentPage: scala.Double): State = {
    val __obj = js.Dynamic.literal(currentPage = currentPage)
  
    __obj.asInstanceOf[State]
  }
}

