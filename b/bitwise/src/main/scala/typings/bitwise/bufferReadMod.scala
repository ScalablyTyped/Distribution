package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitwise/esm/buffer/read", JSImport.Namespace)
@js.native
object bufferReadMod extends js.Object {
  
  def default(buffer: Buffer): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
}
