package typings
package bpmnDashModdleLib.bpmnDashModdleMod

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
    $parent: TypeDerived,
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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, dataState = dataState, id = id, isCollection = isCollection, itemSubjectRef = itemSubjectRef, name = name, outputSetRef = outputSetRef, outputSetWithOptional = outputSetWithOptional, outputSetWithWhileExecuting = outputSetWithWhileExecuting)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataOutput]
  }
}

