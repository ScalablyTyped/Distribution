package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowElement
  extends StObject
     with BaseElement {
  
  var auditing: Auditing
  
  var categoryValueRef: js.Array[CategoryValue]
  
  var monitoring: Monitoring
  
  var name: js.UndefOr[String] = js.undefined
}
object FlowElement {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: String,
    monitoring: Monitoring
  ): FlowElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowElement] (val x: Self) extends AnyVal {
    
    inline def setAuditing(value: Auditing): Self = StObject.set(x, "auditing", value.asInstanceOf[js.Any])
    
    inline def setCategoryValueRef(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValueRef", value.asInstanceOf[js.Any])
    
    inline def setCategoryValueRefVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValueRef", js.Array(value*))
    
    inline def setMonitoring(value: Monitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
