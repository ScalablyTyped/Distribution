package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorElement extends BaseElement {
  
  var errorCode: String = js.native
  
  var name: String = js.native
  
  var structureRef: ItemDefinition = js.native
}
object ErrorElement {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition
  ): ErrorElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorElement]
  }
  
  @scala.inline
  implicit class ErrorElementMutableBuilder[Self <: ErrorElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
