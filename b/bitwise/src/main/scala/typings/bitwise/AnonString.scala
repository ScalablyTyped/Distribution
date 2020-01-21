package typings.bitwise

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object AnonString {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): AnonString = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[AnonString]
  }
}

