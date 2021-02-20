package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderDefineExpressionMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression")
  @js.native
  class ShaderDefineExpression () extends StObject {
    
    def isTrue(preprocessors: StringDictionary[String]): Boolean = js.native
  }
  /* static members */
  object ShaderDefineExpression {
    
    @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression._OperatorPriority")
    @js.native
    def _OperatorPriority: js.Any = js.native
    @scala.inline
    def _OperatorPriority_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression._Stack")
    @js.native
    def _Stack: js.Any = js.native
    @scala.inline
    def _Stack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression.infixToPostfix")
    @js.native
    def infixToPostfix(infix: String): js.Array[String] = js.native
    
    @JSImport("babylonjs/Engines/Processors/Expressions/shaderDefineExpression", "ShaderDefineExpression.postfixToInfix")
    @js.native
    def postfixToInfix(postfix: js.Array[String]): String = js.native
  }
}
