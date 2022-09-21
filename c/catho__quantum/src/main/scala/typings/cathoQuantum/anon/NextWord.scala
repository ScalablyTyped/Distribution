package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextWord extends StObject {
  
  var nextWord: String
  
  var paginationPreposition: String
}
object NextWord {
  
  inline def apply(nextWord: String, paginationPreposition: String): NextWord = {
    val __obj = js.Dynamic.literal(nextWord = nextWord.asInstanceOf[js.Any], paginationPreposition = paginationPreposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextWord]
  }
  
  extension [Self <: NextWord](x: Self) {
    
    inline def setNextWord(value: String): Self = StObject.set(x, "nextWord", value.asInstanceOf[js.Any])
    
    inline def setPaginationPreposition(value: String): Self = StObject.set(x, "paginationPreposition", value.asInstanceOf[js.Any])
  }
}
