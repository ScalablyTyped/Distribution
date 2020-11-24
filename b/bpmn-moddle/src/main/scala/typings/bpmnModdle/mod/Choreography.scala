package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.Collaboration because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, isClosed, participants, messageFlows, artifacts, conversations, conversationAssociations, participantAssociations, messageFlowAssociations, correlationKeys, choreographyRef, conversationLinks */ @js.native
trait Choreography extends FlowElementsContainer {
  
  var artifacts: js.Array[Artifact] = js.native
  
  var choreographyRef: js.Array[Choreography] = js.native
  
  var conversationAssociations: js.Array[ConversationAssociation] = js.native
  
  var conversationLinks: js.Array[ConversationLink] = js.native
  
  var conversations: js.Array[ConversationNode] = js.native
  
  var correlationKeys: js.Array[CorrelationKey] = js.native
  
  var isClosed: Boolean = js.native
  
  var messageFlowAssociations: js.Array[MessageFlowAssociation] = js.native
  
  var messageFlows: js.Array[MessageFlow] = js.native
  
  var name: String = js.native
  
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
  
  var participants: js.Array[Participant] = js.native
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
  implicit class ChoreographyOps[Self <: Choreography] (val x: Self) extends AnyVal {
    
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
    def setArtifactsVarargs(value: Artifact*): Self = this.set("artifacts", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoreographyRefVarargs(value: Choreography*): Self = this.set("choreographyRef", js.Array(value :_*))
    
    @scala.inline
    def setChoreographyRef(value: js.Array[Choreography]): Self = this.set("choreographyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationAssociationsVarargs(value: ConversationAssociation*): Self = this.set("conversationAssociations", js.Array(value :_*))
    
    @scala.inline
    def setConversationAssociations(value: js.Array[ConversationAssociation]): Self = this.set("conversationAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationLinksVarargs(value: ConversationLink*): Self = this.set("conversationLinks", js.Array(value :_*))
    
    @scala.inline
    def setConversationLinks(value: js.Array[ConversationLink]): Self = this.set("conversationLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationsVarargs(value: ConversationNode*): Self = this.set("conversations", js.Array(value :_*))
    
    @scala.inline
    def setConversations(value: js.Array[ConversationNode]): Self = this.set("conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = this.set("correlationKeys", js.Array(value :_*))
    
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = this.set("correlationKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowAssociationsVarargs(value: MessageFlowAssociation*): Self = this.set("messageFlowAssociations", js.Array(value :_*))
    
    @scala.inline
    def setMessageFlowAssociations(value: js.Array[MessageFlowAssociation]): Self = this.set("messageFlowAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowsVarargs(value: MessageFlow*): Self = this.set("messageFlows", js.Array(value :_*))
    
    @scala.inline
    def setMessageFlows(value: js.Array[MessageFlow]): Self = this.set("messageFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociationsVarargs(value: ParticipantAssociation*): Self = this.set("participantAssociations", js.Array(value :_*))
    
    @scala.inline
    def setParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = this.set("participantAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[Participant]): Self = this.set("participants", value.asInstanceOf[js.Any])
  }
}
