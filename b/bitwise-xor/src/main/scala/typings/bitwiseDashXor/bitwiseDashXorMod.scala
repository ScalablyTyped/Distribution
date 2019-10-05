package typings.bitwiseDashXor

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise-xor", JSImport.Namespace)
@js.native
object bitwiseDashXorMod extends js.Object {
  def apply(a: String, b: String): Buffer = js.native
  def apply(a: String, b: Buffer): Buffer = js.native
  def apply(a: Buffer, b: String): Buffer = js.native
  /**
    * Bitwise XOR between two Buffers or Strings, returns a Buffer
    */
  def apply(a: Buffer, b: Buffer): Buffer = js.native
}

