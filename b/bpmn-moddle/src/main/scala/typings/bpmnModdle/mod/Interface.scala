package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interface
  extends StObject
     with BaseElement {
  
  var implementationRef: String
  
  var name: String
  
  var operations: js.Array[Operation]
}
object Interface {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    implementationRef: String,
    name: String,
    operations: js.Array[Operation]
  ): Interface = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationRef = implementationRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interface] (val x: Self) extends AnyVal {
    
    inline def setImplementationRef(value: String): Self = StObject.set(x, "implementationRef", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
