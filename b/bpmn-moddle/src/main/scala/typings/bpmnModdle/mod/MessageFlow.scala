package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageFlow
  extends StObject
     with BaseElement {
  
  var messageRef: Message
  
  var name: String
  
  var sourceRef: InteractionNode
  
  var targetRef: InteractionNode
}
object MessageFlow {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    messageRef: Message,
    name: String,
    sourceRef: InteractionNode,
    targetRef: InteractionNode
  ): MessageFlow = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageFlow] (val x: Self) extends AnyVal {
    
    inline def setMessageRef(value: Message): Self = StObject.set(x, "messageRef", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceRef(value: InteractionNode): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRef(value: InteractionNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
