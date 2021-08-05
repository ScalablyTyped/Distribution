package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionNode
  extends StObject
     with TypeDerived {
  
  var incomingConversationLinks: js.Array[ConversationLink]
  
  var outgoingConversationLinks: js.Array[ConversationLink]
}
object InteractionNode {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    incomingConversationLinks: js.Array[ConversationLink],
    outgoingConversationLinks: js.Array[ConversationLink]
  ): InteractionNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionNode]
  }
  
  extension [Self <: InteractionNode](x: Self) {
    
    inline def setIncomingConversationLinks(value: js.Array[ConversationLink]): Self = StObject.set(x, "incomingConversationLinks", value.asInstanceOf[js.Any])
    
    inline def setIncomingConversationLinksVarargs(value: ConversationLink*): Self = StObject.set(x, "incomingConversationLinks", js.Array(value :_*))
    
    inline def setOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = StObject.set(x, "outgoingConversationLinks", value.asInstanceOf[js.Any])
    
    inline def setOutgoingConversationLinksVarargs(value: ConversationLink*): Self = StObject.set(x, "outgoingConversationLinks", js.Array(value :_*))
  }
}
