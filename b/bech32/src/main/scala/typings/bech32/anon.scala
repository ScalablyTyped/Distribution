package typings.bech32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Prefix extends StObject {
    
    var prefix: String = js.native
    
    var words: js.Array[Double] = js.native
  }
  object Prefix {
    
    @scala.inline
    def apply(prefix: String, words: js.Array[Double]): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
}
