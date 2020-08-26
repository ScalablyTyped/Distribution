package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowElementsContainer extends BaseElement {
  var flowElements: js.Array[FlowElement] = js.native
  var laneSets: js.Array[LaneSet] = js.native
}

object FlowElementsContainer {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    flowElements: js.Array[FlowElement],
    id: String,
    laneSets: js.Array[LaneSet]
  ): FlowElementsContainer = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowElementsContainer]
  }
  @scala.inline
  implicit class FlowElementsContainerOps[Self <: FlowElementsContainer] (val x: Self) extends AnyVal {
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
    def setFlowElementsVarargs(value: FlowElement*): Self = this.set("flowElements", js.Array(value :_*))
    @scala.inline
    def setFlowElements(value: js.Array[FlowElement]): Self = this.set("flowElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaneSetsVarargs(value: LaneSet*): Self = this.set("laneSets", js.Array(value :_*))
    @scala.inline
    def setLaneSets(value: js.Array[LaneSet]): Self = this.set("laneSets", value.asInstanceOf[js.Any])
  }
  
}

