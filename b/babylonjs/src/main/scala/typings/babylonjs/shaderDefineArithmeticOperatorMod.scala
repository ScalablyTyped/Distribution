package typings.babylonjs

import typings.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderDefineArithmeticOperatorMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/shaderDefineArithmeticOperator", "ShaderDefineArithmeticOperator")
  @js.native
  open class ShaderDefineArithmeticOperator protected () extends ShaderDefineExpression {
    def this(define: String, operand: String, testValue: String) = this()
    
    var define: String = js.native
    
    var operand: String = js.native
    
    var testValue: String = js.native
  }
}
