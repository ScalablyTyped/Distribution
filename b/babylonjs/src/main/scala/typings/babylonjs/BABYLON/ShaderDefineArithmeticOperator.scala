package typings.babylonjs.BABYLON

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
  implicit class ShaderDefineArithmeticOperatorOps[Self <: ShaderDefineArithmeticOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefine(value: String): Self = this.set("define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperand(value: String): Self = this.set("operand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestValue(value: String): Self = this.set("testValue", value.asInstanceOf[js.Any])
  }
}
