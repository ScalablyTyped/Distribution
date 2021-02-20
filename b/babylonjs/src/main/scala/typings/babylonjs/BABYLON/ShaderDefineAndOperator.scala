package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class ShaderDefineAndOperatorMutableBuilder[Self <: ShaderDefineAndOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftOperand(value: ShaderDefineExpression): Self = StObject.set(x, "leftOperand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightOperand(value: ShaderDefineExpression): Self = StObject.set(x, "rightOperand", value.asInstanceOf[js.Any])
  }
}
