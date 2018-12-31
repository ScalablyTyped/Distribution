package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends FlowNode {
  var boundaryEventRefs: js.Array[BoundaryEvent]
  var completionQuantity: scala.Double
  var dataInputAssociations: js.Array[DataInputAssociation]
  var dataOutputAssociations: js.Array[DataOutputAssociation]
  var default: SequenceFlow
  var ioSpecification: InputOutputSpecification
  var isForCompensation: scala.Boolean
  var loopCharacteristics: LoopCharacteristics
  var properties: js.Array[Property]
  var resources: ResourceRole
  var startQuantity: scala.Double
}

