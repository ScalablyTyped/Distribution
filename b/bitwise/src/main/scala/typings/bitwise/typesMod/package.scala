package typings.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bits = js.Array[typings.bitwise.typesMod.Bit]
  type BooleanBits = js.Array[scala.Boolean]
  type Byte = js.Tuple8[
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit
  ]
  type Nibble = js.Tuple4[
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit, 
    typings.bitwise.typesMod.Bit
  ]
}
