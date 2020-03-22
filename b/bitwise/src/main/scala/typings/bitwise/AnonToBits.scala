package typings.bitwise

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToBits extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object AnonToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): AnonToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[AnonToBits]
  }
}

