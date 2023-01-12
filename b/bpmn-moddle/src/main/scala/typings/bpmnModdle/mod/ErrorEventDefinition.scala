package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEventDefinition
  extends StObject
     with BaseElement {
  
  var errorRef: ErrorElement
}
object ErrorEventDefinition {
  
  inline def apply($parent: TypeDerived, $type: ElementType, errorRef: ErrorElement, id: String): ErrorEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorEventDefinition] (val x: Self) extends AnyVal {
    
    inline def setErrorRef(value: ErrorElement): Self = StObject.set(x, "errorRef", value.asInstanceOf[js.Any])
  }
}
