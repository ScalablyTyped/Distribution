package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefineArithmeticOperator extends ShaderDefineExpression {
  var define: String
  var operand: String
  var testValue: String
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
}

