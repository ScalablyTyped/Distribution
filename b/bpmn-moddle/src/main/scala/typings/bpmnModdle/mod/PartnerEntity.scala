package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerEntity
  extends StObject
     with BaseElement {
  
  var name: String
  
  var participantRef: js.Array[Participant]
}
object PartnerEntity {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    participantRef: js.Array[Participant]
  ): PartnerEntity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerEntity]
  }
  
  @scala.inline
  implicit class PartnerEntityMutableBuilder[Self <: PartnerEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRef(value: js.Array[Participant]): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRefVarargs(value: Participant*): Self = StObject.set(x, "participantRef", js.Array(value :_*))
  }
}
