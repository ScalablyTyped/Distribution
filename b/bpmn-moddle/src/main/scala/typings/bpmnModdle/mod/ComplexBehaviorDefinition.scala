package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexBehaviorDefinition extends BaseElement {
  
  var condition: FormalExpression = js.native
  
  var event: ImplicitThrowEvent = js.native
}
object ComplexBehaviorDefinition {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    condition: FormalExpression,
    event: ImplicitThrowEvent,
    id: String
  ): ComplexBehaviorDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexBehaviorDefinition]
  }
  
  @scala.inline
  implicit class ComplexBehaviorDefinitionOps[Self <: ComplexBehaviorDefinition] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: FormalExpression): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: ImplicitThrowEvent): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
