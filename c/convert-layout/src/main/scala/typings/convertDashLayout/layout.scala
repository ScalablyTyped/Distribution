package typings.convertDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait layout extends js.Object {
  def fromEn(s: String): String
  def toEn(s: String): String
}

object layout {
  @scala.inline
  def apply(fromEn: String => String, toEn: String => String): layout = {
    val __obj = js.Dynamic.literal(fromEn = js.Any.fromFunction1(fromEn), toEn = js.Any.fromFunction1(toEn))
  
    __obj.asInstanceOf[layout]
  }
}

