package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends FlowNode {
  var boundaryEventRefs: js.Array[BoundaryEvent] = js.native
  var completionQuantity: Double = js.native
  var dataInputAssociations: js.Array[DataInputAssociation] = js.native
  var dataOutputAssociations: js.Array[DataOutputAssociation] = js.native
  var default: SequenceFlow = js.native
  var ioSpecification: InputOutputSpecification = js.native
  var isForCompensation: Boolean = js.native
  var loopCharacteristics: LoopCharacteristics = js.native
  var properties: js.Array[Property] = js.native
  var resources: ResourceRole = js.native
  var startQuantity: Double = js.native
}

