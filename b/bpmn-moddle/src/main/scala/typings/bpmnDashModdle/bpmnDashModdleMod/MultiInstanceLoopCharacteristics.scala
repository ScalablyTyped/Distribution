package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiInstanceLoopCharacteristics extends BaseElement {
  var behavior: MultiInstanceBehaviour
  var completionCondition: Expression
  var complexBehaviorDefinition: ComplexBehaviorDefinition
  var inputDataItem: DataInput
  var isSequential: Boolean
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
    id: String,
    inputDataItem: DataInput,
    isSequential: Boolean,
    loopCardinality: Expression,
    loopDataInputRef: ItemAwareElement,
    loopDataOutputRef: ItemAwareElement,
    noneBehaviorEventRef: EventDefinition,
    oneBehaviorEventRef: EventDefinition,
    outputDataItem: DataOutput,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MultiInstanceLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], behavior = behavior.asInstanceOf[js.Any], completionCondition = completionCondition.asInstanceOf[js.Any], complexBehaviorDefinition = complexBehaviorDefinition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputDataItem = inputDataItem.asInstanceOf[js.Any], isSequential = isSequential.asInstanceOf[js.Any], loopCardinality = loopCardinality.asInstanceOf[js.Any], loopDataInputRef = loopDataInputRef.asInstanceOf[js.Any], loopDataOutputRef = loopDataOutputRef.asInstanceOf[js.Any], noneBehaviorEventRef = noneBehaviorEventRef.asInstanceOf[js.Any], oneBehaviorEventRef = oneBehaviorEventRef.asInstanceOf[js.Any], outputDataItem = outputDataItem.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInstanceLoopCharacteristics]
  }
}

