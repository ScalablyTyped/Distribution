package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallableElement extends BaseElement {
  var ioBinding: InputOutputBinding
  var ioSpecification: InputOutputSpecification
  var name: String
  var supportedInterfaceRef: Interface
}

object CallableElement {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    supportedInterfaceRef: Interface,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CallableElement = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, ioBinding = ioBinding, ioSpecification = ioSpecification, name = name, supportedInterfaceRef = supportedInterfaceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CallableElement]
  }
}

