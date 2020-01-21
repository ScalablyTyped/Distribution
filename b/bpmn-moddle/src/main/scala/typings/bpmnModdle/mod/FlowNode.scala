package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowNode extends FlowElement {
  var incoming: js.Array[SequenceFlow] = js.native
  var lanes: js.Array[Lane] = js.native
  var outgoing: js.Array[SequenceFlow] = js.native
}

