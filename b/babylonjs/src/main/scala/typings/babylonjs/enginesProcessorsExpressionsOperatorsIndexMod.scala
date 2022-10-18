package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesProcessorsExpressionsOperatorsIndexMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineAndOperator")
  @js.native
  open class ShaderDefineAndOperator ()
    extends typings.babylonjs.enginesProcessorsExpressionsOperatorsShaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineArithmeticOperator")
  @js.native
  open class ShaderDefineArithmeticOperator protected ()
    extends typings.babylonjs.enginesProcessorsExpressionsOperatorsShaderDefineArithmeticOperatorMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineIsDefinedOperator")
  @js.native
  open class ShaderDefineIsDefinedOperator protected ()
    extends typings.babylonjs.enginesProcessorsExpressionsOperatorsShaderDefineIsDefinedOperatorMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", "ShaderDefineOrOperator")
  @js.native
  open class ShaderDefineOrOperator ()
    extends typings.babylonjs.enginesProcessorsExpressionsOperatorsShaderDefineOrOperatorMod.ShaderDefineOrOperator
}
