package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalUserTask extends GlobalTask {
  var implementation: java.lang.String
  var renderings: Rendering
}

object GlobalUserTask {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    implementation: java.lang.String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: java.lang.String,
    renderings: Rendering,
    resources: ResourceRole,
    supportedInterfaceRef: Interface,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalUserTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("implementation")(implementation)
    __obj.updateDynamic("ioBinding")(ioBinding)
    __obj.updateDynamic("ioSpecification")(ioSpecification)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("renderings")(renderings)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("supportedInterfaceRef")(supportedInterfaceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalUserTask]
  }
}

