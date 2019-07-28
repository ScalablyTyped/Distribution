package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalUserTask extends GlobalTask {
  var implementation: String
  var renderings: Rendering
}

object GlobalUserTask {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    implementation: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    renderings: Rendering,
    resources: ResourceRole,
    supportedInterfaceRef: Interface,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalUserTask = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, implementation = implementation, ioBinding = ioBinding, ioSpecification = ioSpecification, name = name, renderings = renderings, resources = resources, supportedInterfaceRef = supportedInterfaceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalUserTask]
  }
}

