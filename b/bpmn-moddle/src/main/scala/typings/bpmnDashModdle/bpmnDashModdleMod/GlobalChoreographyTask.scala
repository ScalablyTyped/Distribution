package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.BaseElement because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.Collaboration because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, isClosed, participants, messageFlows, artifacts, conversations, conversationAssociations, participantAssociations, messageFlowAssociations, correlationKeys, choreographyRef, conversationLinks */ trait GlobalChoreographyTask extends FlowElementsContainer {
  var artifacts: js.Array[Artifact]
  var choreographyRef: js.Array[Choreography]
  var conversationAssociations: js.Array[ConversationAssociation]
  var conversationLinks: js.Array[ConversationLink]
  var conversations: js.Array[ConversationNode]
  var correlationKeys: js.Array[CorrelationKey]
  var initiatingParticipantRef: Participant
  var isClosed: Boolean
  var messageFlowAssociations: js.Array[MessageFlowAssociation]
  var messageFlows: js.Array[MessageFlow]
  var name: String
  var participantAssociations: js.Array[ParticipantAssociation]
  var participants: js.Array[Participant]
}

object GlobalChoreographyTask {
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
    initiatingParticipantRef: Participant,
    isClosed: Boolean,
    laneSets: js.Array[LaneSet],
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalChoreographyTask = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, artifacts = artifacts, choreographyRef = choreographyRef, conversationAssociations = conversationAssociations, conversationLinks = conversationLinks, conversations = conversations, correlationKeys = correlationKeys, flowElements = flowElements, id = id, initiatingParticipantRef = initiatingParticipantRef, isClosed = isClosed, laneSets = laneSets, messageFlowAssociations = messageFlowAssociations, messageFlows = messageFlows, name = name, participantAssociations = participantAssociations, participants = participants)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalChoreographyTask]
  }
}

