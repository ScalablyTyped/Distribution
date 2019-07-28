package typings.bech32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bech32", JSImport.Namespace)
@js.native
object bech32Mod extends js.Object {
  def decode(str: String): Anon_Prefix = js.native
  def decode(str: String, LIMIT: Double): Anon_Prefix = js.native
  def encode(prefix: String, words: Buffer): String = js.native
  def encode(prefix: String, words: Buffer, LIMIT: Double): String = js.native
  def fromWords(words: Buffer): Buffer = js.native
  def toWords(bytes: Buffer): Buffer = js.native
}

