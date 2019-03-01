package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDefinition extends BaseElement {
  var `import`: Import
  /** @default false */
  var isCollection: scala.Boolean
  var itemKind: ItemKind
  var structureRef: java.lang.String
}

object ItemDefinition {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    `import`: Import,
    isCollection: scala.Boolean,
    itemKind: ItemKind,
    structureRef: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ItemDefinition = {
    val __obj = js.Dynamic.literal(`import` = `import`)
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isCollection")(isCollection)
    __obj.updateDynamic("itemKind")(itemKind)
    __obj.updateDynamic("structureRef")(structureRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ItemDefinition]
  }
}

