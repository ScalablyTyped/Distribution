package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscalationEventDefinition
  extends StObject
     with BaseElement {
  
  var escalationRef: Escalation
}
object EscalationEventDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, escalationRef: Escalation, id: String): EscalationEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], escalationRef = escalationRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscalationEventDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EscalationEventDefinition] (val x: Self) extends AnyVal {
    
    inline def setEscalationRef(value: Escalation): Self = StObject.set(x, "escalationRef", value.asInstanceOf[js.Any])
  }
}
