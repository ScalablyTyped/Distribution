package typings.cookiejar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToValueString extends js.Object {
  def toValueString(): String
}

object Anon_ToValueString {
  @scala.inline
  def apply(toValueString: () => String): Anon_ToValueString = {
    val __obj = js.Dynamic.literal(toValueString = js.Any.fromFunction0(toValueString))
  
    __obj.asInstanceOf[Anon_ToValueString]
  }
}

