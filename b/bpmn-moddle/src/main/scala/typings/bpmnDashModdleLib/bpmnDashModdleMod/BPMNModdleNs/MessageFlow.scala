package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFlow extends BaseElement {
  var messageRef: Message
  var name: java.lang.String
  var sourceRef: InteractionNode
  var targetRef: InteractionNode
}

object MessageFlow {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    messageRef: Message,
    name: java.lang.String,
    sourceRef: InteractionNode,
    targetRef: InteractionNode,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): MessageFlow = {
    val __obj = js.Dynamic.literal($type = $type, id = id, messageRef = messageRef, name = name, sourceRef = sourceRef, targetRef = targetRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[MessageFlow]
  }
}

