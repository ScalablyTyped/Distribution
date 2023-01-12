package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryValue
  extends StObject
     with BaseElement {
  
  var categorizedFlowElements: js.Array[FlowElement]
  
  var value: String
}
object CategoryValue {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    categorizedFlowElements: js.Array[FlowElement],
    id: String,
    value: String
  ): CategoryValue = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], categorizedFlowElements = categorizedFlowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryValue] (val x: Self) extends AnyVal {
    
    inline def setCategorizedFlowElements(value: js.Array[FlowElement]): Self = StObject.set(x, "categorizedFlowElements", value.asInstanceOf[js.Any])
    
    inline def setCategorizedFlowElementsVarargs(value: FlowElement*): Self = StObject.set(x, "categorizedFlowElements", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
