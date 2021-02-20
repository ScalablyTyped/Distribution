package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends BaseElement {
  
  var errorRef: ErrorElement = js.native
  
  var implementationRef: String = js.native
  
  var inMessageRef: Message = js.native
  
  var name: String = js.native
  
  var outMessageRef: Message = js.native
}
object Operation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorRef: ErrorElement,
    id: String,
    implementationRef: String,
    inMessageRef: Message,
    name: String,
    outMessageRef: Message
  ): Operation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationRef = implementationRef.asInstanceOf[js.Any], inMessageRef = inMessageRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outMessageRef = outMessageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorRef(value: ErrorElement): Self = StObject.set(x, "errorRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationRef(value: String): Self = StObject.set(x, "implementationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMessageRef(value: Message): Self = StObject.set(x, "inMessageRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutMessageRef(value: Message): Self = StObject.set(x, "outMessageRef", value.asInstanceOf[js.Any])
  }
}
