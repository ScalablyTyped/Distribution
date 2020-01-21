package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/buffer/create", JSImport.Namespace)
@js.native
object bufferCreateMod extends js.Object {
  def default(bits: js.Array[Bit]): Buffer = js.native
}

