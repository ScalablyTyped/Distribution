package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAwareElement extends BaseElement {
  var dataState: DataState
  var itemSubjectRef: ItemDefinition
}

object ItemAwareElement {
  @scala.inline
  def apply(
    $type: ElementType,
    dataState: DataState,
    id: java.lang.String,
    itemSubjectRef: ItemDefinition,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ItemAwareElement = {
    val __obj = js.Dynamic.literal($type = $type, dataState = dataState, id = id, itemSubjectRef = itemSubjectRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ItemAwareElement]
  }
}

