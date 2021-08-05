package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category
  extends StObject
     with BaseElement {
  
  var categoryValue: CategoryValue
  
  var name: String
}
object Category {
  
  inline def apply($parent: TypeDerived, $type: ElementType, categoryValue: CategoryValue, id: String, name: String): Category = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], categoryValue = categoryValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategoryValue(value: CategoryValue): Self = StObject.set(x, "categoryValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
