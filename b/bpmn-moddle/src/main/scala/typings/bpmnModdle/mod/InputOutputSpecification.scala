package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOutputSpecification extends BaseElement {
  var dataInputs: js.Array[DataInput]
  var dataOutputs: js.Array[DataOutput]
  var inputSets: js.Array[InputSet]
  var outputSets: js.Array[OutputSet]
}

object InputOutputSpecification {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputs: js.Array[DataInput],
    dataOutputs: js.Array[DataOutput],
    id: String,
    inputSets: js.Array[InputSet],
    outputSets: js.Array[OutputSet],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): InputOutputSpecification = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputs = dataInputs.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSets = inputSets.asInstanceOf[js.Any], outputSets = outputSets.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOutputSpecification]
  }
}

