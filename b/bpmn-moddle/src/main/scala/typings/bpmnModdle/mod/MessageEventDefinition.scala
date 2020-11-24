package typings.bpmnModdle.mod

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
  implicit class MessageEventDefinitionOps[Self <: MessageEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessageRef(value: Message): Self = this.set("messageRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationRef(value: Operation): Self = this.set("operationRef", value.asInstanceOf[js.Any])
  }
}
