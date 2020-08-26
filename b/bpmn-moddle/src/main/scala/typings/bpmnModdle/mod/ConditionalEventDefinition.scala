package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalEventDefinition extends BaseElement {
  var condition: Expression = js.native
}

object ConditionalEventDefinition {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, condition: Expression, id: String): ConditionalEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalEventDefinition]
  }
  @scala.inline
  implicit class ConditionalEventDefinitionOps[Self <: ConditionalEventDefinition] (val x: Self) extends AnyVal {
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
    def setCondition(value: Expression): Self = this.set("condition", value.asInstanceOf[js.Any])
  }
  
}

