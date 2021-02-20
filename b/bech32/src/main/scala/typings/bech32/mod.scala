package typings.bech32

import typings.bech32.anon.Prefix
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bech32", "decode")
  @js.native
  def decode(str: String): Prefix = js.native
  @JSImport("bech32", "decode")
  @js.native
  def decode(str: String, limit: Double): Prefix = js.native
  
  @JSImport("bech32", "decodeUnsafe")
  @js.native
  def decodeUnsafe(str: String): js.UndefOr[Prefix] = js.native
  @JSImport("bech32", "decodeUnsafe")
  @js.native
  def decodeUnsafe(str: String, limit: Double): js.UndefOr[Prefix] = js.native
  
  @JSImport("bech32", "encode")
  @js.native
  def encode(prefix: String, words: js.Array[Double]): String = js.native
  @JSImport("bech32", "encode")
  @js.native
  def encode(prefix: String, words: js.Array[Double], limit: Double): String = js.native
  
  @JSImport("bech32", "fromWords")
  @js.native
  def fromWords(words: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("bech32", "fromWordsUnsafe")
  @js.native
  def fromWordsUnsafe(words: js.Array[Double]): js.UndefOr[js.Array[Double]] = js.native
  
  @JSImport("bech32", "toWords")
  @js.native
  def toWords(bytes: ArrayLike[Double]): js.Array[Double] = js.native
  
  @JSImport("bech32", "toWordsUnsafe")
  @js.native
  def toWordsUnsafe(bytes: ArrayLike[Double]): js.UndefOr[js.Array[Double]] = js.native
}
