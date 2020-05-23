package typings.bitwise.anon

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToBits extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object ToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): ToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[ToBits]
  }
}

