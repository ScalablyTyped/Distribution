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
  def apply(
    fromEn: js.Function1[java.lang.String, java.lang.String],
    toEn: js.Function1[java.lang.String, java.lang.String]
  ): layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromEn")(fromEn)
    __obj.updateDynamic("toEn")(toEn)
    __obj.asInstanceOf[layout]
  }
}

