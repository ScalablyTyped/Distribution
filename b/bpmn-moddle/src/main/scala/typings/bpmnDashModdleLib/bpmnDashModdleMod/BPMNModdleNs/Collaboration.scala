package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaboration extends BaseElement {
  var artifacts: js.Array[Artifact]
  var choreographyRef: js.Array[Choreography]
  var conversationAssociations: js.Array[ConversationAssociation]
  var conversationLinks: js.Array[ConversationLink]
  var conversations: js.Array[ConversationNode]
  var correlationKeys: js.Array[CorrelationKey]
  var isClosed: scala.Boolean
  var messageFlowAssociations: js.Array[MessageFlowAssociation]
  var messageFlows: js.Array[MessageFlow]
  var name: java.lang.String
  var participantAssociations: js.Array[ParticipantAssociation]
  var participants: js.Array[Participant]
}

object Collaboration {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    choreographyRef: js.Array[Choreography],
    conversationAssociations: js.Array[ConversationAssociation],
    conversationLinks: js.Array[ConversationLink],
    conversations: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    id: java.lang.String,
    isClosed: scala.Boolean,
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: java.lang.String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Collaboration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("choreographyRef")(choreographyRef)
    __obj.updateDynamic("conversationAssociations")(conversationAssociations)
    __obj.updateDynamic("conversationLinks")(conversationLinks)
    __obj.updateDynamic("conversations")(conversations)
    __obj.updateDynamic("correlationKeys")(correlationKeys)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("messageFlowAssociations")(messageFlowAssociations)
    __obj.updateDynamic("messageFlows")(messageFlows)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("participantAssociations")(participantAssociations)
    __obj.updateDynamic("participants")(participants)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Collaboration]
  }
}

