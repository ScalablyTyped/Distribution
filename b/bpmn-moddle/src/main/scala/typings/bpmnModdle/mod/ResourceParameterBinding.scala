package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceParameterBinding extends TypeDerived {
  var expression: Expression
  var parameterRef: ResourceParameter
}

object ResourceParameterBinding {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, expression: Expression, parameterRef: ResourceParameter): ResourceParameterBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], parameterRef = parameterRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameterBinding]
  }
}

