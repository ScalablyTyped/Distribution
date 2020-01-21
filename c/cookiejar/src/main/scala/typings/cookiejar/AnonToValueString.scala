package typings.cookiejar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToValueString extends js.Object {
  def toValueString(): String
}

object AnonToValueString {
  @scala.inline
  def apply(toValueString: () => String): AnonToValueString = {
    val __obj = js.Dynamic.literal(toValueString = js.Any.fromFunction0(toValueString))
  
    __obj.asInstanceOf[AnonToValueString]
  }
}

