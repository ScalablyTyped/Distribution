package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalChoreographyTask extends Choreography {
  var initiatingParticipantRef: Participant
}

object GlobalChoreographyTask {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    choreographyRef: js.Array[Choreography],
    conversationAssociations: js.Array[ConversationAssociation],
    conversationLinks: js.Array[ConversationLink],
    conversations: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    initiatingParticipantRef: Participant,
    isClosed: scala.Boolean,
    laneSets: js.Array[LaneSet],
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: java.lang.String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalChoreographyTask = {
    val __obj = js.Dynamic.literal($type = $type, artifacts = artifacts, choreographyRef = choreographyRef, conversationAssociations = conversationAssociations, conversationLinks = conversationLinks, conversations = conversations, correlationKeys = correlationKeys, flowElements = flowElements, id = id, initiatingParticipantRef = initiatingParticipantRef, isClosed = isClosed, laneSets = laneSets, messageFlowAssociations = messageFlowAssociations, messageFlows = messageFlows, name = name, participantAssociations = participantAssociations, participants = participants)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalChoreographyTask]
  }
}

