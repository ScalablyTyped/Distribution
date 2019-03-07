package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationAssociation extends ConversationNode {
  var innerConversationNodeRef: ConversationNode
  var outerConversationNodeRef: ConversationNode
}

object ConversationAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeys: js.Array[CorrelationKey],
    id: java.lang.String,
    incomingConversationLinks: js.Array[ConversationLink],
    innerConversationNodeRef: ConversationNode,
    messageFlowRefs: js.Array[MessageFlow],
    name: java.lang.String,
    outerConversationNodeRef: ConversationNode,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ConversationAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, correlationKeys = correlationKeys, id = id, incomingConversationLinks = incomingConversationLinks, innerConversationNodeRef = innerConversationNodeRef, messageFlowRefs = messageFlowRefs, name = name, outerConversationNodeRef = outerConversationNodeRef, outgoingConversationLinks = outgoingConversationLinks, participantRefs = participantRefs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ConversationAssociation]
  }
}

