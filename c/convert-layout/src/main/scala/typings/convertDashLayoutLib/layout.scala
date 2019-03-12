package typings
package convertDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait layout extends js.Object {
  def fromEn(s: java.lang.String): java.lang.String
  def toEn(s: java.lang.String): java.lang.String
}

object layout {
  @scala.inline
  def apply(fromEn: java.lang.String => java.lang.String, toEn: java.lang.String => java.lang.String): layout = {
    val __obj = js.Dynamic.literal(fromEn = js.Any.fromFunction1(fromEn), toEn = js.Any.fromFunction1(toEn))
  
    __obj.asInstanceOf[layout]
  }
}

