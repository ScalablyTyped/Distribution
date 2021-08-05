package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ trait Event
  extends StObject
     with FlowNode {
  
  var incomingConversationLinks: js.Array[ConversationLink]
  
  var outgoingConversationLinks: js.Array[ConversationLink]
  
  var properties: js.Array[Property]
}
object Event {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property]
  ): Event = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setIncomingConversationLinks(value: js.Array[ConversationLink]): Self = StObject.set(x, "incomingConversationLinks", value.asInstanceOf[js.Any])
    
    inline def setIncomingConversationLinksVarargs(value: ConversationLink*): Self = StObject.set(x, "incomingConversationLinks", js.Array(value :_*))
    
    inline def setOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = StObject.set(x, "outgoingConversationLinks", value.asInstanceOf[js.Any])
    
    inline def setOutgoingConversationLinksVarargs(value: ConversationLink*): Self = StObject.set(x, "outgoingConversationLinks", js.Array(value :_*))
    
    inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
