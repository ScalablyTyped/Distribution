package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lane
  extends StObject
     with BaseElement {
  
  var childLaneSet: LaneSet
  
  var flowNodeRef: js.Array[FlowNode]
  
  var name: String
  
  var partitionElement: BaseElement
  
  var partitionElementRef: BaseElement
}
object Lane {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    childLaneSet: LaneSet,
    flowNodeRef: js.Array[FlowNode],
    id: String,
    name: String,
    partitionElement: BaseElement,
    partitionElementRef: BaseElement
  ): Lane = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], childLaneSet = childLaneSet.asInstanceOf[js.Any], flowNodeRef = flowNodeRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionElement = partitionElement.asInstanceOf[js.Any], partitionElementRef = partitionElementRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  
  extension [Self <: Lane](x: Self) {
    
    inline def setChildLaneSet(value: LaneSet): Self = StObject.set(x, "childLaneSet", value.asInstanceOf[js.Any])
    
    inline def setFlowNodeRef(value: js.Array[FlowNode]): Self = StObject.set(x, "flowNodeRef", value.asInstanceOf[js.Any])
    
    inline def setFlowNodeRefVarargs(value: FlowNode*): Self = StObject.set(x, "flowNodeRef", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartitionElement(value: BaseElement): Self = StObject.set(x, "partitionElement", value.asInstanceOf[js.Any])
    
    inline def setPartitionElementRef(value: BaseElement): Self = StObject.set(x, "partitionElementRef", value.asInstanceOf[js.Any])
  }
}
