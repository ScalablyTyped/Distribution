package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/buffer/modify", JSImport.Namespace)
@js.native
object bufferModifyMod extends js.Object {
  def default(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
  def default(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
}

