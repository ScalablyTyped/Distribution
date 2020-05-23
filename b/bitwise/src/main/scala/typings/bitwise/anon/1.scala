package typings.bitwise.anon

import typings.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object `1` {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): `1` = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[`1`]
  }
}

