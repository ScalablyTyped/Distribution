package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEventDefinition extends BaseElement {
  
  var messageRef: Message = js.native
  
  var operationRef: Operation = js.native
}
object MessageEventDefinition {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, messageRef: Message, operationRef: Operation): MessageEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventDefinition]
  }
  
  @scala.inline
  implicit class MessageEventDefinitionMutableBuilder[Self <: MessageEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageRef(value: Message): Self = StObject.set(x, "messageRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationRef(value: Operation): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
  }
}
