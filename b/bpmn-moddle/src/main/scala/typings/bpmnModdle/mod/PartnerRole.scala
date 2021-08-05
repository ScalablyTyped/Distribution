package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerRole
  extends StObject
     with BaseElement {
  
  var name: String
  
  var participantRef: js.Array[Participant]
}
object PartnerRole {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    participantRef: js.Array[Participant]
  ): PartnerRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerRole]
  }
  
  extension [Self <: PartnerRole](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParticipantRef(value: js.Array[Participant]): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    inline def setParticipantRefVarargs(value: Participant*): Self = StObject.set(x, "participantRef", js.Array(value :_*))
  }
}
