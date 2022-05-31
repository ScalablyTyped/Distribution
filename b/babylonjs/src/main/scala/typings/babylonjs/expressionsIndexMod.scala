package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionsIndexMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineAndOperator")
  @js.native
  class ShaderDefineAndOperator ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineAndOperator
  
  @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineArithmeticOperator")
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineExpression")
  @js.native
  class ShaderDefineExpression ()
    extends typings.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
  /* static members */
  object ShaderDefineExpression {
    
    @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineExpression._OperatorPriority")
    @js.native
    def _OperatorPriority: js.Any = js.native
    inline def _OperatorPriority_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineExpression._Stack")
    @js.native
    def _Stack: js.Any = js.native
    inline def _Stack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
    
    inline def infixToPostfix(infix: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("infixToPostfix")(infix.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def postfixToInfix(postfix: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("postfixToInfix")(postfix.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineIsDefinedOperator")
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/index", "ShaderDefineOrOperator")
  @js.native
  class ShaderDefineOrOperator ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineOrOperator
}
