package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubConversation
  extends StObject
     with ConversationNode {
  
  var conversationNodes: js.Array[ConversationNode]
}
object SubConversation {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    conversationNodes: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): SubConversation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], conversationNodes = conversationNodes.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubConversation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubConversation] (val x: Self) extends AnyVal {
    
    inline def setConversationNodes(value: js.Array[ConversationNode]): Self = StObject.set(x, "conversationNodes", value.asInstanceOf[js.Any])
    
    inline def setConversationNodesVarargs(value: ConversationNode*): Self = StObject.set(x, "conversationNodes", js.Array(value*))
  }
}
