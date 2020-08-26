package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceParameterBinding extends TypeDerived {
  var expression: Expression = js.native
  var parameterRef: ResourceParameter = js.native
}

object ResourceParameterBinding {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, expression: Expression, parameterRef: ResourceParameter): ResourceParameterBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], parameterRef = parameterRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameterBinding]
  }
  @scala.inline
  implicit class ResourceParameterBindingOps[Self <: ResourceParameterBinding] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterRef(value: ResourceParameter): Self = this.set("parameterRef", value.asInstanceOf[js.Any])
  }
  
}

