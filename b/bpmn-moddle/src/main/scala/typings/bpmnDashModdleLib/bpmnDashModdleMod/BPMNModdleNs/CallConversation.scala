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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("calledCollaborationRef")(calledCollaborationRef)
    __obj.updateDynamic("correlationKeys")(correlationKeys)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incomingConversationLinks")(incomingConversationLinks)
    __obj.updateDynamic("messageFlowRefs")(messageFlowRefs)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outgoingConversationLinks")(outgoingConversationLinks)
    __obj.updateDynamic("participantAssociations")(participantAssociations)
    __obj.updateDynamic("participantRefs")(participantRefs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CallConversation]
  }
}

