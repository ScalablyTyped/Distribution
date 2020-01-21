package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiInstanceLoopCharacteristics extends BaseElement {
  var behavior: MultiInstanceBehaviour = js.native
  var completionCondition: Expression = js.native
  var complexBehaviorDefinition: ComplexBehaviorDefinition = js.native
  var inputDataItem: DataInput = js.native
  var isSequential: Boolean = js.native
  var loopCardinality: Expression = js.native
  var loopDataInputRef: ItemAwareElement = js.native
  var loopDataOutputRef: ItemAwareElement = js.native
  var noneBehaviorEventRef: EventDefinition = js.native
  var oneBehaviorEventRef: EventDefinition = js.native
  var outputDataItem: DataOutput = js.native
}

