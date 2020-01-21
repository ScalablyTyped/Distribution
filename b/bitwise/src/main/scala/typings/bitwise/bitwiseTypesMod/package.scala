package typings.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bitwiseTypesMod {
  type Bits = js.Array[typings.bitwise.bitwiseTypesMod.Bit]
  type BooleanBits = js.Array[scala.Boolean]
  type Byte = js.Tuple8[
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit
  ]
  type Nibble = js.Tuple4[
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit, 
    typings.bitwise.bitwiseTypesMod.Bit
  ]
}
