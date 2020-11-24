package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefineAndOperator extends ShaderDefineExpression {
  
  var leftOperand: ShaderDefineExpression = js.native
  
  var rightOperand: ShaderDefineExpression = js.native
}
object ShaderDefineAndOperator {
  
  @scala.inline
  def apply(
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    leftOperand: ShaderDefineExpression,
    rightOperand: ShaderDefineExpression
  ): ShaderDefineAndOperator = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue), leftOperand = leftOperand.asInstanceOf[js.Any], rightOperand = rightOperand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineAndOperator]
  }
  
  @scala.inline
  implicit class ShaderDefineAndOperatorOps[Self <: ShaderDefineAndOperator] (val x: Self) extends AnyVal {
    
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
    def setLeftOperand(value: ShaderDefineExpression): Self = this.set("leftOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOperand(value: ShaderDefineExpression): Self = this.set("rightOperand", value.asInstanceOf[js.Any])
  }
}
