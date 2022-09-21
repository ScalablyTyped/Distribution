package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowElementsContainer
  extends StObject
     with BaseElement {
  
  var flowElements: js.Array[FlowElement]
  
  var laneSets: js.Array[LaneSet]
}
object FlowElementsContainer {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    flowElements: js.Array[FlowElement],
    id: String,
    laneSets: js.Array[LaneSet]
  ): FlowElementsContainer = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowElementsContainer]
  }
  
  extension [Self <: FlowElementsContainer](x: Self) {
    
    inline def setFlowElements(value: js.Array[FlowElement]): Self = StObject.set(x, "flowElements", value.asInstanceOf[js.Any])
    
    inline def setFlowElementsVarargs(value: FlowElement*): Self = StObject.set(x, "flowElements", js.Array(value*))
    
    inline def setLaneSets(value: js.Array[LaneSet]): Self = StObject.set(x, "laneSets", value.asInstanceOf[js.Any])
    
    inline def setLaneSetsVarargs(value: LaneSet*): Self = StObject.set(x, "laneSets", js.Array(value*))
  }
}
