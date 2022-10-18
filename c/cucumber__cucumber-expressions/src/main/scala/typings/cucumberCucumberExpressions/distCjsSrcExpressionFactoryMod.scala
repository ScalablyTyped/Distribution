package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcExpressionFactoryMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/ExpressionFactory", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExpressionFactory {
    def this(parameterTypeRegistry: typings.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default) = this()
  }
  
  @js.native
  trait ExpressionFactory extends StObject {
    
    def createExpression(expression: String): Expression = js.native
    def createExpression(expression: js.RegExp): Expression = js.native
    
    /* private */ val parameterTypeRegistry: Any = js.native
  }
}
