package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Processors/Expressions/index", JSImport.Namespace)
@js.native
object expressionsIndexMod extends js.Object {
  @js.native
  class ShaderDefineAndOperator ()
    extends typings.babylonjs.shaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @js.native
  class ShaderDefineExpression ()
    extends typings.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
  
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typings.babylonjs.operatorsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @js.native
  class ShaderDefineOrOperator ()
    extends typings.babylonjs.shaderDefineOrOperatorMod.ShaderDefineOrOperator
  
}

