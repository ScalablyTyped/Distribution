package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderDefineExpression extends js.Object {
  def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean
}

object ShaderDefineExpression {
  @scala.inline
  def apply(isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean): ShaderDefineExpression = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue))
    __obj.asInstanceOf[ShaderDefineExpression]
  }
}

