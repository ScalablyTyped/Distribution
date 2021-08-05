package typings.bech32

import typings.bech32.anon.Prefix
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bech32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(str: String): Prefix = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Prefix]
  inline def decode(str: String, limit: Double): Prefix = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Prefix]
  
  inline def decodeUnsafe(str: String): js.UndefOr[Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Prefix]]
  inline def decodeUnsafe(str: String, limit: Double): js.UndefOr[Prefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Prefix]]
  
  inline def encode(prefix: String, words: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(prefix: String, words: js.Array[Double], limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromWords(words: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWords")(words.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def fromWordsUnsafe(words: js.Array[Double]): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWordsUnsafe")(words.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  inline def toWords(bytes: ArrayLike[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toWordsUnsafe(bytes: ArrayLike[Double]): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWordsUnsafe")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
}
