package typings.bpmnModdle.mod

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
  implicit class EscalationEventDefinitionOps[Self <: EscalationEventDefinition] (val x: Self) extends AnyVal {
    
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
    def setEscalationRef(value: Escalation): Self = this.set("escalationRef", value.asInstanceOf[js.Any])
  }
}
