package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefineArithmeticOperator extends ShaderDefineExpression {
  
  var define: String = js.native
  
  var operand: String = js.native
  
  var testValue: String = js.native
}
object ShaderDefineArithmeticOperator {
  
  @scala.inline
  def apply(
    define: String,
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    operand: String,
    testValue: String
  ): ShaderDefineArithmeticOperator = {
    val __obj = js.Dynamic.literal(define = define.asInstanceOf[js.Any], isTrue = js.Any.fromFunction1(isTrue), operand = operand.asInstanceOf[js.Any], testValue = testValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineArithmeticOperator]
  }
  
  @scala.inline
  implicit class ShaderDefineArithmeticOperatorMutableBuilder[Self <: ShaderDefineArithmeticOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperand(value: String): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestValue(value: String): Self = StObject.set(x, "testValue", value.asInstanceOf[js.Any])
  }
}
