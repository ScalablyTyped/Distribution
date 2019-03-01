package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

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
    $type: ElementType,
    dataInputs: js.Array[DataInput],
    dataOutputs: js.Array[DataOutput],
    id: java.lang.String,
    inputSets: js.Array[InputSet],
    outputSets: js.Array[OutputSet],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): InputOutputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("dataInputs")(dataInputs)
    __obj.updateDynamic("dataOutputs")(dataOutputs)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inputSets")(inputSets)
    __obj.updateDynamic("outputSets")(outputSets)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[InputOutputSpecification]
  }
}

