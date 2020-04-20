package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionNode]
  }
}

