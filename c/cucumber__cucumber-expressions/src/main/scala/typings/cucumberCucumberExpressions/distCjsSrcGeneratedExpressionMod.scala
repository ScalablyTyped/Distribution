package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.ParameterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcGeneratedExpressionMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/GeneratedExpression", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GeneratedExpression {
    def this(
      expressionTemplate: String,
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]]
    ) = this()
  }
  
  @js.native
  trait GeneratedExpression extends StObject {
    
    /* private */ val expressionTemplate: Any = js.native
    
    /**
      * Returns an array of ParameterInfo to use in generated function/method signatures
      */
    def parameterInfos: js.Array[ParameterInfo] = js.native
    
    /**
      * Returns an array of parameter names to use in generated function/method signatures
      *
      * @returns {ReadonlyArray.<String>}
      */
    def parameterNames: js.Array[String] = js.native
    
    val parameterTypes: js.Array[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]] = js.native
    
    def source: String = js.native
  }
}
