package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEventDefinition extends BaseElement {
  
  var errorRef: ErrorElement = js.native
}
object ErrorEventDefinition {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, errorRef: ErrorElement, id: String): ErrorEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventDefinition]
  }
  
  @scala.inline
  implicit class ErrorEventDefinitionMutableBuilder[Self <: ErrorEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorRef(value: ErrorElement): Self = StObject.set(x, "errorRef", value.asInstanceOf[js.Any])
  }
}
