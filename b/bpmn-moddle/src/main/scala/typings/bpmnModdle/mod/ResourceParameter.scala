package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceParameter
  extends StObject
     with BaseElement {
  
  var isRequired: Boolean
  
  var name: String
  
  var `type`: ItemDefinition
}
object ResourceParameter {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    isRequired: Boolean,
    name: String,
    `type`: ItemDefinition
  ): ResourceParameter = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceParameter] (val x: Self) extends AnyVal {
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ItemDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
