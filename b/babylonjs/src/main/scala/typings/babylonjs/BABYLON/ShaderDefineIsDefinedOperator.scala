package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefineIsDefinedOperator extends ShaderDefineExpression {
  var define: String
  var not: Boolean
}

object ShaderDefineIsDefinedOperator {
  @scala.inline
  def apply(
    define: String,
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    not: Boolean
  ): ShaderDefineIsDefinedOperator = {
    val __obj = js.Dynamic.literal(define = define.asInstanceOf[js.Any], isTrue = js.Any.fromFunction1(isTrue), not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineIsDefinedOperator]
  }
}

