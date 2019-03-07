package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalBusinessRuleTask extends GlobalTask {
  var implementation: java.lang.String
}

object GlobalBusinessRuleTask {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: java.lang.String,
    implementation: java.lang.String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: java.lang.String,
    resources: ResourceRole,
    supportedInterfaceRef: Interface,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalBusinessRuleTask = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, implementation = implementation, ioBinding = ioBinding, ioSpecification = ioSpecification, name = name, resources = resources, supportedInterfaceRef = supportedInterfaceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalBusinessRuleTask]
  }
}

