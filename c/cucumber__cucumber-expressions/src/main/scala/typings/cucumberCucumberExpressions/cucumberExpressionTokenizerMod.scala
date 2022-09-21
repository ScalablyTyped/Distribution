package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.astMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cucumberExpressionTokenizerMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpressionTokenizer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CucumberExpressionTokenizer {
    
    /* CompleteClass */
    override def tokenize(expression: String): js.Array[Token] = js.native
  }
  
  trait CucumberExpressionTokenizer extends StObject {
    
    def tokenize(expression: String): js.Array[Token]
  }
  object CucumberExpressionTokenizer {
    
    inline def apply(tokenize: String => js.Array[Token]): CucumberExpressionTokenizer = {
      val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
      __obj.asInstanceOf[CucumberExpressionTokenizer]
    }
    
    extension [Self <: CucumberExpressionTokenizer](x: Self) {
      
      inline def setTokenize(value: String => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    }
  }
}
