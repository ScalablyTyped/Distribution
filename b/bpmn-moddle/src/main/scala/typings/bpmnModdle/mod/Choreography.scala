package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.Collaboration because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, isClosed, participants, messageFlows, artifacts, conversations, conversationAssociations, participantAssociations, messageFlowAssociations, correlationKeys, choreographyRef, conversationLinks */ trait Choreography
  extends StObject
     with FlowElementsContainer {
  
  var artifacts: js.Array[Artifact]
  
  var choreographyRef: js.Array[Choreography]
  
  var conversationAssociations: js.Array[ConversationAssociation]
  
  var conversationLinks: js.Array[ConversationLink]
  
  var conversations: js.Array[ConversationNode]
  
  var correlationKeys: js.Array[CorrelationKey]
  
  var isClosed: Boolean
  
  var messageFlowAssociations: js.Array[MessageFlowAssociation]
  
  var messageFlows: js.Array[MessageFlow]
  
  var name: String
  
  var participantAssociations: js.Array[ParticipantAssociation]
  
  var participants: js.Array[Participant]
}
object Choreography {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    choreographyRef: js.Array[Choreography],
    conversationAssociations: js.Array[ConversationAssociation],
    conversationLinks: js.Array[ConversationLink],
    conversations: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: String,
    isClosed: Boolean,
    laneSets: js.Array[LaneSet],
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant]
  ): Choreography = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], choreographyRef = choreographyRef.asInstanceOf[js.Any], conversationAssociations = conversationAssociations.asInstanceOf[js.Any], conversationLinks = conversationLinks.asInstanceOf[js.Any], conversations = conversations.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], messageFlowAssociations = messageFlowAssociations.asInstanceOf[js.Any], messageFlows = messageFlows.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choreography]
  }
  
  @scala.inline
  implicit class ChoreographyMutableBuilder[Self <: Choreography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setChoreographyRef(value: js.Array[Choreography]): Self = StObject.set(x, "choreographyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoreographyRefVarargs(value: Choreography*): Self = StObject.set(x, "choreographyRef", js.Array(value :_*))
    
    @scala.inline
    def setConversationAssociations(value: js.Array[ConversationAssociation]): Self = StObject.set(x, "conversationAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationAssociationsVarargs(value: ConversationAssociation*): Self = StObject.set(x, "conversationAssociations", js.Array(value :_*))
    
    @scala.inline
    def setConversationLinks(value: js.Array[ConversationLink]): Self = StObject.set(x, "conversationLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationLinksVarargs(value: ConversationLink*): Self = StObject.set(x, "conversationLinks", js.Array(value :_*))
    
    @scala.inline
    def setConversations(value: js.Array[ConversationNode]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationsVarargs(value: ConversationNode*): Self = StObject.set(x, "conversations", js.Array(value :_*))
    
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = StObject.set(x, "correlationKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = StObject.set(x, "correlationKeys", js.Array(value :_*))
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowAssociations(value: js.Array[MessageFlowAssociation]): Self = StObject.set(x, "messageFlowAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowAssociationsVarargs(value: MessageFlowAssociation*): Self = StObject.set(x, "messageFlowAssociations", js.Array(value :_*))
    
    @scala.inline
    def setMessageFlows(value: js.Array[MessageFlow]): Self = StObject.set(x, "messageFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowsVarargs(value: MessageFlow*): Self = StObject.set(x, "messageFlows", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = StObject.set(x, "participantAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociationsVarargs(value: ParticipantAssociation*): Self = StObject.set(x, "participantAssociations", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value :_*))
  }
}
