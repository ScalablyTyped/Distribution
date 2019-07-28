package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends BaseElement {
  var errorRef: ErrorElement
  var implementationRef: String
  var inMessageRef: Message
  var name: String
  var outMessageRef: Message
}

object Operation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorRef: ErrorElement,
    id: String,
    implementationRef: String,
    inMessageRef: Message,
    name: String,
    outMessageRef: Message,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Operation = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, errorRef = errorRef, id = id, implementationRef = implementationRef, inMessageRef = inMessageRef, name = name, outMessageRef = outMessageRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Operation]
  }
}

