package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bits extends js.Object {
  var bits: Anon_And
  var buffer: Anon_A
  var byte: Anon_Byte
  var integer: Anon_GetBit
  var nibble: Anon_Nibble
  var string: Anon_String
}

object Anon_Bits {
  @scala.inline
  def apply(
    bits: Anon_And,
    buffer: Anon_A,
    byte: Anon_Byte,
    integer: Anon_GetBit,
    nibble: Anon_Nibble,
    string: Anon_String
  ): Anon_Bits = {
    val __obj = js.Dynamic.literal(bits = bits, buffer = buffer, byte = byte, integer = integer, nibble = nibble, string = string)
  
    __obj.asInstanceOf[Anon_Bits]
  }
}

