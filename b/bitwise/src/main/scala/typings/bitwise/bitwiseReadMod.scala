package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.bitwise.bitwiseTypesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble/read", JSImport.Namespace)
@js.native
object bitwiseReadMod extends js.Object {
  def default(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
}

