package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class LaneOps[Self <: Lane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildLaneSet(value: LaneSet): Self = this.set("childLaneSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowNodeRefVarargs(value: FlowNode*): Self = this.set("flowNodeRef", js.Array(value :_*))
    @scala.inline
    def setFlowNodeRef(value: js.Array[FlowNode]): Self = this.set("flowNodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionElement(value: BaseElement): Self = this.set("partitionElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionElementRef(value: BaseElement): Self = this.set("partitionElementRef", value.asInstanceOf[js.Any])
  }
  
}

