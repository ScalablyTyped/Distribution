package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallConversation extends ConversationNode {
  
  var calledCollaborationRef: Collaboration = js.native
  
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
}
object CallConversation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    calledCollaborationRef: Collaboration,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRefs: js.Array[Participant]
  ): CallConversation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], calledCollaborationRef = calledCollaborationRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallConversation]
  }
  
  @scala.inline
  implicit class CallConversationMutableBuilder[Self <: CallConversation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalledCollaborationRef(value: Collaboration): Self = StObject.set(x, "calledCollaborationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = StObject.set(x, "participantAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociationsVarargs(value: ParticipantAssociation*): Self = StObject.set(x, "participantAssociations", js.Array(value :_*))
  }
}
