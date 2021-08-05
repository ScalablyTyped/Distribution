package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Escalation
  extends StObject
     with BaseElement {
  
  var escalationCode: String
  
  var name: String
  
  var structureRef: ItemDefinition
}
object Escalation {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    escalationCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition
  ): Escalation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], escalationCode = escalationCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escalation]
  }
  
  extension [Self <: Escalation](x: Self) {
    
    inline def setEscalationCode(value: String): Self = StObject.set(x, "escalationCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
