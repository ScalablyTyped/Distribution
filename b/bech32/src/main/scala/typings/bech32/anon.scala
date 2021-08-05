package typings.bech32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prefix extends StObject {
    
    var prefix: String
    
    var words: js.Array[Double]
  }
  object Prefix {
    
    inline def apply(prefix: String, words: js.Array[Double]): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    extension [Self <: Prefix](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
}
