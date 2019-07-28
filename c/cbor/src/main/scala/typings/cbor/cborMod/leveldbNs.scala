package typings.cbor.cborMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "leveldb")
@js.native
object leveldbNs extends js.Object {
  val buffer: Boolean = js.native
  val name: String = js.native
  def decode(input: String): js.Array[_] = js.native
  def decode(input: Buffer): js.Array[_] = js.native
  def encode(input: js.Any): Buffer = js.native
}

