package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDefinition extends BaseElement {
  var `import`: Import
  /** @default false */
  var isCollection: Boolean
  var itemKind: ItemKind
  var structureRef: String
}

object ItemDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    `import`: Import,
    isCollection: Boolean,
    itemKind: ItemKind,
    structureRef: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ItemDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, isCollection = isCollection, itemKind = itemKind, structureRef = structureRef)
    __obj.updateDynamic("import")(`import`)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ItemDefinition]
  }
}

