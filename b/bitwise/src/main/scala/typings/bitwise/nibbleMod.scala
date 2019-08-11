package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble", JSImport.Namespace)
@js.native
object nibbleMod extends js.Object {
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  @js.native
  object default extends js.Object {
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
}

