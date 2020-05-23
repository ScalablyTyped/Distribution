package typings.bitwise.anon

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit]
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4
}

object Write {
  @scala.inline
  def apply(read: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit], write: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Write = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
}

