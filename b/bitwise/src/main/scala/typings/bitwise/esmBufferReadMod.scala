package typings.bitwise

import typings.bitwise.esmTypesMod.Bit
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/buffer/read", JSImport.Namespace)
@js.native
object esmBufferReadMod extends js.Object {
  def default(buffer: Buffer): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
}

