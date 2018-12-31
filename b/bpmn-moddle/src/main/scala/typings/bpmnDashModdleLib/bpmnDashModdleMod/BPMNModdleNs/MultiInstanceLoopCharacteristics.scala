package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiInstanceLoopCharacteristics extends BaseElement {
  var behavior: MultiInstanceBehaviour
  var completionCondition: Expression
  var complexBehaviorDefinition: ComplexBehaviorDefinition
  var inputDataItem: DataInput
  var isSequential: scala.Boolean
  var loopCardinality: Expression
  var loopDataInputRef: ItemAwareElement
  var loopDataOutputRef: ItemAwareElement
  var noneBehaviorEventRef: EventDefinition
  var oneBehaviorEventRef: EventDefinition
  var outputDataItem: DataOutput
}

