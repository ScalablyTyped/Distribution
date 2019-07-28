package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubConversation extends ConversationNode {
  var conversationNodes: js.Array[ConversationNode]
}

object SubConversation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    conversationNodes: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): SubConversation = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, conversationNodes = conversationNodes, correlationKeys = correlationKeys, id = id, incomingConversationLinks = incomingConversationLinks, messageFlowRefs = messageFlowRefs, name = name, outgoingConversationLinks = outgoingConversationLinks, participantRefs = participantRefs)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[SubConversation]
  }
}

