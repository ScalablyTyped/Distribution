package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefineAndOperator extends ShaderDefineExpression {
  var leftOperand: ShaderDefineExpression
  var rightOperand: ShaderDefineExpression
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
}

