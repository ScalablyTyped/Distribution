package typings.bech32

import typings.bech32.anon.Prefix
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bech32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(str: String): Prefix = js.native
  def decode(str: String, LIMIT: Double): Prefix = js.native
  def encode(prefix: String, words: ArrayLike[Double]): String = js.native
  def encode(prefix: String, words: ArrayLike[Double], LIMIT: Double): String = js.native
  def fromWords(words: ArrayLike[Double]): js.Array[Double] = js.native
  def toWords(bytes: ArrayLike[Double]): js.Array[Double] = js.native
}

