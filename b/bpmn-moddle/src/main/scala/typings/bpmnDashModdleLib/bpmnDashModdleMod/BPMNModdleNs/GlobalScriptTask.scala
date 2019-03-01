package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalScriptTask extends GlobalTask {
  var script: java.lang.String
  var scriptLanguage: java.lang.String
}

object GlobalScriptTask {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: java.lang.String,
    resources: ResourceRole,
    script: java.lang.String,
    scriptLanguage: java.lang.String,
    supportedInterfaceRef: Interface,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalScriptTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ioBinding")(ioBinding)
    __obj.updateDynamic("ioSpecification")(ioSpecification)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("scriptLanguage")(scriptLanguage)
    __obj.updateDynamic("supportedInterfaceRef")(supportedInterfaceRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[GlobalScriptTask]
  }
}

