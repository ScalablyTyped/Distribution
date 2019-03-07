package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallConversation extends ConversationNode {
  var calledCollaborationRef: Collaboration
  var participantAssociations: js.Array[ParticipantAssociation]
}

object CallConversation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    calledCollaborationRef: Collaboration,
    correlationKeys: js.Array[CorrelationKey],
    id: java.lang.String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: java.lang.String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRefs: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CallConversation = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, calledCollaborationRef = calledCollaborationRef, correlationKeys = correlationKeys, id = id, incomingConversationLinks = incomingConversationLinks, messageFlowRefs = messageFlowRefs, name = name, outgoingConversationLinks = outgoingConversationLinks, participantAssociations = participantAssociations, participantRefs = participantRefs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CallConversation]
  }
}

