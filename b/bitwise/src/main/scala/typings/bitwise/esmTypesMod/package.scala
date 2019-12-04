package typings.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmTypesMod {
  type Bits = js.Array[Bit]
  type BooleanBits = js.Array[Boolean]
  type Byte = js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]
  type Nibble = js.Tuple4[Bit, Bit, Bit, Bit]
}
