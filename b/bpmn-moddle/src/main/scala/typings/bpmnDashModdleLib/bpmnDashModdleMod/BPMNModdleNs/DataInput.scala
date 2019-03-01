package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataInput extends ItemAwareElement {
  var inputSetRef: InputSet
  var inputSetWithOptional: InputSet
  var inputSetWithWhileExecuting: InputSet
  /** @default false */
  var isCollection: scala.Boolean
  var name: java.lang.String
}

object DataInput {
  @scala.inline
  def apply(
    $type: ElementType,
    dataState: DataState,
    id: java.lang.String,
    inputSetRef: InputSet,
    inputSetWithOptional: InputSet,
    inputSetWithWhileExecuting: InputSet,
    isCollection: scala.Boolean,
    itemSubjectRef: ItemDefinition,
    name: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("dataState")(dataState)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inputSetRef")(inputSetRef)
    __obj.updateDynamic("inputSetWithOptional")(inputSetWithOptional)
    __obj.updateDynamic("inputSetWithWhileExecuting")(inputSetWithWhileExecuting)
    __obj.updateDynamic("isCollection")(isCollection)
    __obj.updateDynamic("itemSubjectRef")(itemSubjectRef)
    __obj.updateDynamic("name")(name)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataInput]
  }
}

