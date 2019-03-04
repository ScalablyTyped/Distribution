package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorElement extends BaseElement {
  var errorCode: java.lang.String
  var name: java.lang.String
  var structureRef: ItemDefinition
}

object ErrorElement {
  @scala.inline
  def apply(
    $type: ElementType,
    errorCode: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    structureRef: ItemDefinition,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ErrorElement = {
    val __obj = js.Dynamic.literal($type = $type, errorCode = errorCode, id = id, name = name, structureRef = structureRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ErrorElement]
  }
}

