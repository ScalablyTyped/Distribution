package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.astMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cucumberExpressionParserMod {
  
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
    
    extension [Self <: CucumberExpressionParser](x: Self) {
      
      inline def setParse(value: String => Node): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
