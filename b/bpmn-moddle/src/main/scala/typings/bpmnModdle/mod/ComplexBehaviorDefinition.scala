package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ComplexBehaviorDefinitionMutableBuilder[Self <: ComplexBehaviorDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: FormalExpression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: ImplicitThrowEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
