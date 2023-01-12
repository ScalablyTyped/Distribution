package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventDefinition
  extends StObject
     with BaseElement {
  
  var messageRef: Message
  
  var operationRef: Operation
}
object MessageEventDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String, messageRef: Message, operationRef: Operation): MessageEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEventDefinition] (val x: Self) extends AnyVal {
    
    inline def setMessageRef(value: Message): Self = StObject.set(x, "messageRef", value.asInstanceOf[js.Any])
    
    inline def setOperationRef(value: Operation): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
  }
}
