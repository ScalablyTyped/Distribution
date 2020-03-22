package typings.baseX

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base-x", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait BaseConverter extends js.Object {
    def decode(string: String): Buffer = js.native
    def decodeUnsafe(string: String): js.UndefOr[Buffer] = js.native
    def encode(buffer: js.Array[Double]): String = js.native
    def encode(buffer: Buffer): String = js.native
    def encode(buffer: Uint8Array): String = js.native
  }
  
  def apply(ALPHABET: String): BaseConverter = js.native
}

