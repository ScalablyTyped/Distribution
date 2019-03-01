package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceParameter extends BaseElement {
  var isRequired: scala.Boolean
  var name: java.lang.String
  var `type`: ItemDefinition
}

object ResourceParameter {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    isRequired: scala.Boolean,
    name: java.lang.String,
    `type`: ItemDefinition,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ResourceParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isRequired")(isRequired)
    __obj.updateDynamic("name")(name)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ResourceParameter]
  }
}

