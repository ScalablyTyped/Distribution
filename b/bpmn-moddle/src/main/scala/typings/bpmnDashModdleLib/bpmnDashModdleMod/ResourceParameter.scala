package typings
package bpmnDashModdleLib.bpmnDashModdleMod

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
    $parent: TypeDerived,
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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, isRequired = isRequired, name = name)
    __obj.updateDynamic("type")(`type`)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ResourceParameter]
  }
}

