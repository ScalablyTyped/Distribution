package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcAstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcCucumberExpressionTokenizerMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CucumberExpressionTokenizer] (val x: Self) extends AnyVal {
      
      inline def setTokenize(value: String => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    }
  }
}
