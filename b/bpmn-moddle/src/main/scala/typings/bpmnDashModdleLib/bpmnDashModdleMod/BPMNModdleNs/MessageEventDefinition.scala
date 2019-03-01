package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventDefinition extends BaseElement {
  var nessageRef: Message
  var operationRef: Operation
}

object MessageEventDefinition {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    nessageRef: Message,
    operationRef: Operation,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MessageEventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("nessageRef")(nessageRef)
    __obj.updateDynamic("operationRef")(operationRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[MessageEventDefinition]
  }
}

