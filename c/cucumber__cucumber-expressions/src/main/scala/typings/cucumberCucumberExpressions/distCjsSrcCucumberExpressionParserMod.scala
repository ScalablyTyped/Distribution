package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcCucumberExpressionParserMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/CucumberExpressionParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CucumberExpressionParser {
    
    /* CompleteClass */
    override def parse(expression: String): Node = js.native
  }
  
  trait CucumberExpressionParser extends StObject {
    
    def parse(expression: String): Node
  }
  object CucumberExpressionParser {
    
    inline def apply(parse: String => Node): CucumberExpressionParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[CucumberExpressionParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CucumberExpressionParser] (val x: Self) extends AnyVal {
      
      inline def setParse(value: String => Node): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
