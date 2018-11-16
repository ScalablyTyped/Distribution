package typings
package bech32Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bech32", JSImport.Namespace)
@js.native
object bech32Mod extends js.Object {
  def decode(str: java.lang.String): bech32Lib.Anon_Prefix = js.native
  def decode(str: java.lang.String, LIMIT: scala.Double): bech32Lib.Anon_Prefix = js.native
  def encode(prefix: java.lang.String, words: nodeLib.Buffer): java.lang.String = js.native
  def encode(prefix: java.lang.String, words: nodeLib.Buffer, LIMIT: scala.Double): java.lang.String = js.native
  def fromWords(words: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toWords(bytes: nodeLib.Buffer): nodeLib.Buffer = js.native
}

