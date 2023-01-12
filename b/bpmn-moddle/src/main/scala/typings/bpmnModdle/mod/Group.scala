package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with BaseElement {
  
  var categoryValueRef: CategoryValue
}
object Group {
  
  inline def apply($parent: TypeDerived, $type: ElementType, categoryValueRef: CategoryValue, id: String): Group = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setCategoryValueRef(value: CategoryValue): Self = StObject.set(x, "categoryValueRef", value.asInstanceOf[js.Any])
  }
}
