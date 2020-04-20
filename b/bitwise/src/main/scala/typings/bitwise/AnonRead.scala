package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRead extends js.Object {
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8
}

object AnonRead {
  @scala.inline
  def apply(
    read: UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit],
    write: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => UInt8
  ): AnonRead = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonRead]
  }
}

