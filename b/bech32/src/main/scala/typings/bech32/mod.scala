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
  def decode(str: String, limit: Double): Prefix = js.native
  def decodeUnsafe(str: String): js.UndefOr[Prefix] = js.native
  def decodeUnsafe(str: String, limit: Double): js.UndefOr[Prefix] = js.native
  def encode(prefix: String, words: js.Array[Double]): String = js.native
  def encode(prefix: String, words: js.Array[Double], limit: Double): String = js.native
  def fromWords(words: js.Array[Double]): js.Array[Double] = js.native
  def fromWordsUnsafe(words: js.Array[Double]): js.UndefOr[js.Array[Double]] = js.native
  def toWords(bytes: ArrayLike[Double]): js.Array[Double] = js.native
  def toWordsUnsafe(bytes: ArrayLike[Double]): js.UndefOr[js.Array[Double]] = js.native
}

