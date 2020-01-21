package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceFlow extends FlowElement {
  var conditionExpression: Expression = js.native
  var isImmediate: Boolean = js.native
  var sourceRef: FlowNode = js.native
  var targetRef: FlowNode = js.native
}

