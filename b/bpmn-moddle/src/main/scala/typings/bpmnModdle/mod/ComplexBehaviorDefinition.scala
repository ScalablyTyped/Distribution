package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexBehaviorDefinition
  extends StObject
     with BaseElement {
  
  var condition: FormalExpression
  
  var event: ImplicitThrowEvent
}
object ComplexBehaviorDefinition {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ComplexBehaviorDefinition] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: FormalExpression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ImplicitThrowEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
