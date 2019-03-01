package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOutput extends ItemAwareElement {
  /**
    * @default false
    */
  var isCollection: scala.Boolean
  var name: java.lang.String
  var outputSetRef: js.Array[InputSet]
  var outputSetWithOptional: js.Array[InputSet]
  var outputSetWithWhileExecuting: js.Array[InputSet]
}

object DataOutput {
  @scala.inline
  def apply(
    $type: ElementType,
    dataState: DataState,
    id: java.lang.String,
    isCollection: scala.Boolean,
    itemSubjectRef: ItemDefinition,
    name: java.lang.String,
    outputSetRef: js.Array[InputSet],
    outputSetWithOptional: js.Array[InputSet],
    outputSetWithWhileExecuting: js.Array[InputSet],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("dataState")(dataState)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isCollection")(isCollection)
    __obj.updateDynamic("itemSubjectRef")(itemSubjectRef)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outputSetRef")(outputSetRef)
    __obj.updateDynamic("outputSetWithOptional")(outputSetWithOptional)
    __obj.updateDynamic("outputSetWithWhileExecuting")(outputSetWithWhileExecuting)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataOutput]
  }
}

