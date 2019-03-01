package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStore extends ItemAwareElement {
  var capacity: scala.Double
  var isUnlimited: scala.Boolean
  var name: java.lang.String
}

object DataStore {
  @scala.inline
  def apply(
    $type: ElementType,
    capacity: scala.Double,
    dataState: DataState,
    id: java.lang.String,
    isUnlimited: scala.Boolean,
    itemSubjectRef: ItemDefinition,
    name: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): DataStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("capacity")(capacity)
    __obj.updateDynamic("dataState")(dataState)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isUnlimited")(isUnlimited)
    __obj.updateDynamic("itemSubjectRef")(itemSubjectRef)
    __obj.updateDynamic("name")(name)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[DataStore]
  }
}

