package typings.bech32

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bech32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(str: String): AnonPrefix = js.native
  def decode(str: String, LIMIT: Double): AnonPrefix = js.native
  def encode(prefix: String, words: Buffer): String = js.native
  def encode(prefix: String, words: Buffer, LIMIT: Double): String = js.native
  def fromWords(words: Buffer): Buffer = js.native
  def toWords(bytes: Buffer): Buffer = js.native
}

