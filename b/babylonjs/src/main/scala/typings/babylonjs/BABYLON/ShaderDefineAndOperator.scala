package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderDefineAndOperator
  extends StObject
     with ShaderDefineExpression {
  
  var leftOperand: ShaderDefineExpression
  
  var rightOperand: ShaderDefineExpression
}
object ShaderDefineAndOperator {
  
  inline def apply(
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    leftOperand: ShaderDefineExpression,
    rightOperand: ShaderDefineExpression
  ): ShaderDefineAndOperator = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue), leftOperand = leftOperand.asInstanceOf[js.Any], rightOperand = rightOperand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineAndOperator]
  }
  
  extension [Self <: ShaderDefineAndOperator](x: Self) {
    
    inline def setLeftOperand(value: ShaderDefineExpression): Self = StObject.set(x, "leftOperand", value.asInstanceOf[js.Any])
    
    inline def setRightOperand(value: ShaderDefineExpression): Self = StObject.set(x, "rightOperand", value.asInstanceOf[js.Any])
  }
}
