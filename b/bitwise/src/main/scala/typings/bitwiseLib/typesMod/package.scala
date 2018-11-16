package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bit = bitwiseLib.bitwiseLibNumbers.`0` | bitwiseLib.bitwiseLibNumbers.`1`
  type Bits = js.Array[Bit]
  type BooleanBits = js.Array[scala.Boolean]
  type Byte = js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]
  type Nibble = js.Tuple4[Bit, Bit, Bit, Bit]
  type UInt4 = bitwiseLib.bitwiseLibNumbers.`0` | bitwiseLib.bitwiseLibNumbers.`1` | bitwiseLib.bitwiseLibNumbers.`2` | bitwiseLib.bitwiseLibNumbers.`3` | bitwiseLib.bitwiseLibNumbers.`4` | bitwiseLib.bitwiseLibNumbers.`5` | bitwiseLib.bitwiseLibNumbers.`6` | bitwiseLib.bitwiseLibNumbers.`7` | bitwiseLib.bitwiseLibNumbers.`8` | bitwiseLib.bitwiseLibNumbers.`9` | bitwiseLib.bitwiseLibNumbers.`10` | bitwiseLib.bitwiseLibNumbers.`11` | bitwiseLib.bitwiseLibNumbers.`12` | bitwiseLib.bitwiseLibNumbers.`13` | bitwiseLib.bitwiseLibNumbers.`14` | bitwiseLib.bitwiseLibNumbers.`15`
  type UInt8 = /* LimitUnionLength: was union type with length 256 */js.Any
}
