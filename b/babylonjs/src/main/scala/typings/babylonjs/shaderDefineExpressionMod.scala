package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", JSImport.Namespace)
@js.native
object shaderDefineExpressionMod extends js.Object {
  
  @js.native
  class ShaderDefineExpression () extends js.Object {
    
    def isTrue(preprocessors: StringDictionary[String]): Boolean = js.native
  }
  /* static members */
  @js.native
  object ShaderDefineExpression extends js.Object {
    
    var _OperatorPriority: js.Any = js.native
    
    var _Stack: js.Any = js.native
    
    def infixToPostfix(infix: String): js.Array[String] = js.native
    
    def postfixToInfix(postfix: js.Array[String]): String = js.native
  }
}
