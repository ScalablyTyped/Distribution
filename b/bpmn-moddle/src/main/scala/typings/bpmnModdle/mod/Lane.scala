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

