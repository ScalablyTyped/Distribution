package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorElement extends BaseElement {
  var errorCode: String
  var name: String
  var structureRef: ItemDefinition
}

object ErrorElement {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ErrorElement = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, errorCode = errorCode, id = id, name = name, structureRef = structureRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ErrorElement]
  }
}

