package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationAssociation
  extends StObject
     with ConversationNode {
  
  var innerConversationNodeRef: ConversationNode
  
  var outerConversationNodeRef: ConversationNode
}
object ConversationAssociation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    innerConversationNodeRef: ConversationNode,
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outerConversationNodeRef: ConversationNode,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): ConversationAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], innerConversationNodeRef = innerConversationNodeRef.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outerConversationNodeRef = outerConversationNodeRef.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationAssociation]
  }
  
  @scala.inline
  implicit class ConversationAssociationMutableBuilder[Self <: ConversationAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerConversationNodeRef(value: ConversationNode): Self = StObject.set(x, "innerConversationNodeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterConversationNodeRef(value: ConversationNode): Self = StObject.set(x, "outerConversationNodeRef", value.asInstanceOf[js.Any])
  }
}
