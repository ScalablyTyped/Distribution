package typings.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDataStatic extends js.Object {
  def allowed(): String
  def preferred(): String
}

object TimeDataStatic {
  @scala.inline
  def apply(allowed: () => String, preferred: () => String): TimeDataStatic = {
    val __obj = js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed), preferred = js.Any.fromFunction0(preferred))
    __obj.asInstanceOf[TimeDataStatic]
  }
}

