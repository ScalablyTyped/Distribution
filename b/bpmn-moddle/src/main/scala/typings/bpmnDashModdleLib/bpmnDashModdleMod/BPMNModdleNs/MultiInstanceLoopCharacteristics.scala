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

object MultiInstanceLoopCharacteristics {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    behavior: MultiInstanceBehaviour,
    completionCondition: Expression,
    complexBehaviorDefinition: ComplexBehaviorDefinition,
    id: java.lang.String,
    inputDataItem: DataInput,
    isSequential: scala.Boolean,
    loopCardinality: Expression,
    loopDataInputRef: ItemAwareElement,
    loopDataOutputRef: ItemAwareElement,
    noneBehaviorEventRef: EventDefinition,
    oneBehaviorEventRef: EventDefinition,
    outputDataItem: DataOutput,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MultiInstanceLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, behavior = behavior, completionCondition = completionCondition, complexBehaviorDefinition = complexBehaviorDefinition, id = id, inputDataItem = inputDataItem, isSequential = isSequential, loopCardinality = loopCardinality, loopDataInputRef = loopDataInputRef, loopDataOutputRef = loopDataOutputRef, noneBehaviorEventRef = noneBehaviorEventRef, oneBehaviorEventRef = oneBehaviorEventRef, outputDataItem = outputDataItem)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[MultiInstanceLoopCharacteristics]
  }
}

