package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EscalationEventDefinition extends BaseElement {
  
  var escalationRef: Escalation = js.native
}
object EscalationEventDefinition {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, escalationRef: Escalation, id: String): EscalationEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], escalationRef = escalationRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscalationEventDefinition]
  }
  
  @scala.inline
  implicit class EscalationEventDefinitionMutableBuilder[Self <: EscalationEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscalationRef(value: Escalation): Self = StObject.set(x, "escalationRef", value.asInstanceOf[js.Any])
  }
}
