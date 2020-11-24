package typings.babylonjs

import typings.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/Expressions/Operators/shaderDefineArithmeticOperator", JSImport.Namespace)
@js.native
object shaderDefineArithmeticOperatorMod extends js.Object {
  
  @js.native
  class ShaderDefineArithmeticOperator protected () extends ShaderDefineExpression {
    def this(define: String, operand: String, testValue: String) = this()
    
    var define: String = js.native
    
    var operand: String = js.native
    
    var testValue: String = js.native
  }
}
