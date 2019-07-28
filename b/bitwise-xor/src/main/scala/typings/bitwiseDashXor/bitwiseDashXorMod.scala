package typings.bitwiseDashXor

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise-xor", JSImport.Namespace)
@js.native
object bitwiseDashXorMod extends js.Object {
  /**
    * Bitwise XOR between two Buffers or Strings, returns a Buffer
    */
  def apply(a: Buffer | String, b: Buffer | String): Buffer = js.native
}

