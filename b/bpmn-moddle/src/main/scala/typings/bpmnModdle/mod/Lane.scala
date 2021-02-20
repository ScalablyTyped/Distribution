package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lane extends BaseElement {
  
  var childLaneSet: LaneSet = js.native
  
  var flowNodeRef: js.Array[FlowNode] = js.native
  
  var name: String = js.native
  
  var partitionElement: BaseElement = js.native
  
  var partitionElementRef: BaseElement = js.native
}
object Lane {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LaneMutableBuilder[Self <: Lane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildLaneSet(value: LaneSet): Self = StObject.set(x, "childLaneSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowNodeRef(value: js.Array[FlowNode]): Self = StObject.set(x, "flowNodeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowNodeRefVarargs(value: FlowNode*): Self = StObject.set(x, "flowNodeRef", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionElement(value: BaseElement): Self = StObject.set(x, "partitionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionElementRef(value: BaseElement): Self = StObject.set(x, "partitionElementRef", value.asInstanceOf[js.Any])
  }
}
