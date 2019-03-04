package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceParameterBinding extends TypeDerived {
  var expression: Expression
  var parameterRef: ResourceParameter
}

object ResourceParameterBinding {
  @scala.inline
  def apply($type: ElementType, expression: Expression, parameterRef: ResourceParameter): ResourceParameterBinding = {
    val __obj = js.Dynamic.literal($type = $type, expression = expression, parameterRef = parameterRef)
  
    __obj.asInstanceOf[ResourceParameterBinding]
  }
}

