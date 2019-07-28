package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionNode extends TypeDerived {
  var incomingConversationLinks: js.Array[ConversationLink]
  var outgoingConversationLinks: js.Array[ConversationLink]
}

object InteractionNode {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    incomingConversationLinks: js.Array[ConversationLink],
    outgoingConversationLinks: js.Array[ConversationLink]
  ): InteractionNode = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, incomingConversationLinks = incomingConversationLinks, outgoingConversationLinks = outgoingConversationLinks)
  
    __obj.asInstanceOf[InteractionNode]
  }
}

