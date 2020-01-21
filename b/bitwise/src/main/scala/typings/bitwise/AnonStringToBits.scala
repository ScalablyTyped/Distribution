package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStringToBits extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object AnonStringToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): AnonStringToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[AnonStringToBits]
  }
}

