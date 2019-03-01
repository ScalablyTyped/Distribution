package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryValue extends BaseElement {
  var categorizedFlowElements: js.Array[FlowElement]
  var value: java.lang.String
}

object CategoryValue {
  @scala.inline
  def apply(
    $type: ElementType,
    categorizedFlowElements: js.Array[FlowElement],
    id: java.lang.String,
    value: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CategoryValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("categorizedFlowElements")(categorizedFlowElements)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("value")(value)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CategoryValue]
  }
}

