package typings.bech32

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bech32", "bech32")
  @js.native
  val bech32: BechLib = js.native
  
  @JSImport("bech32", "bech32m")
  @js.native
  val bech32m: BechLib = js.native
  
  @js.native
  trait BechLib extends StObject {
    
    def decode(str: String): Decoded = js.native
    def decode(str: String, LIMIT: Double): Decoded = js.native
    
    def decodeUnsafe(str: String): js.UndefOr[Decoded] = js.native
    def decodeUnsafe(str: String, LIMIT: Double): js.UndefOr[Decoded] = js.native
    
    def encode(prefix: String, words: ArrayLike[Double]): String = js.native
    def encode(prefix: String, words: ArrayLike[Double], LIMIT: Double): String = js.native
    
    def fromWords(words: ArrayLike[Double]): js.Array[Double] = js.native
    
    def fromWordsUnsafe(words: ArrayLike[Double]): js.UndefOr[js.Array[Double]] = js.native
    @JSName("fromWordsUnsafe")
    var fromWordsUnsafe_Original: js.Function1[/* words */ ArrayLike[Double], js.UndefOr[js.Array[Double]]] = js.native
    
    @JSName("fromWords")
    var fromWords_Original: js.Function1[/* words */ ArrayLike[Double], js.Array[Double]] = js.native
    
    def toWords(bytes: ArrayLike[Double]): js.Array[Double] = js.native
    @JSName("toWords")
    var toWords_Original: js.Function1[/* bytes */ ArrayLike[Double], js.Array[Double]] = js.native
  }
  
  trait Decoded extends StObject {
    
    var prefix: String
    
    var words: js.Array[Double]
  }
  object Decoded {
    
    inline def apply(prefix: String, words: js.Array[Double]): Decoded = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoded]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decoded] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
}
