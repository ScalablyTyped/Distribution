package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/Processors/Expressions/Operators/index", JSImport.Namespace)
@js.native
object operatorsIndexMod extends js.Object {
  @js.native
  class ShaderDefineAndOperator ()
    extends typings.babylonjs.shaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typings.babylonjs.shaderDefineArithmeticOperatorMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typings.babylonjs.shaderDefineIsDefinedOperatorMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @js.native
  class ShaderDefineOrOperator ()
    extends typings.babylonjs.shaderDefineOrOperatorMod.ShaderDefineOrOperator
  
}

