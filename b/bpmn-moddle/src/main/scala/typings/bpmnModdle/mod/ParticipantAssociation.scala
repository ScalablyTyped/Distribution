package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantAssociation
  extends StObject
     with BaseElement {
  
  var innerParticipantRef: Participant
  
  var outerParticipantRef: Participant
}
object ParticipantAssociation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerParticipantRef: Participant,
    outerParticipantRef: Participant
  ): ParticipantAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerParticipantRef = innerParticipantRef.asInstanceOf[js.Any], outerParticipantRef = outerParticipantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantAssociation]
  }
  
  @scala.inline
  implicit class ParticipantAssociationMutableBuilder[Self <: ParticipantAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerParticipantRef(value: Participant): Self = StObject.set(x, "innerParticipantRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterParticipantRef(value: Participant): Self = StObject.set(x, "outerParticipantRef", value.asInstanceOf[js.Any])
  }
}
