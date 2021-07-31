package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallableElement
  extends StObject
     with BaseElement {
  
  var ioBinding: InputOutputBinding
  
  var ioSpecification: InputOutputSpecification
  
  var name: String
  
  var supportedInterfaceRef: Interface
}
object CallableElement {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    supportedInterfaceRef: Interface
  ): CallableElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallableElement]
  }
  
  @scala.inline
  implicit class CallableElementMutableBuilder[Self <: CallableElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIoBinding(value: InputOutputBinding): Self = StObject.set(x, "ioBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoSpecification(value: InputOutputSpecification): Self = StObject.set(x, "ioSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedInterfaceRef(value: Interface): Self = StObject.set(x, "supportedInterfaceRef", value.asInstanceOf[js.Any])
  }
}
