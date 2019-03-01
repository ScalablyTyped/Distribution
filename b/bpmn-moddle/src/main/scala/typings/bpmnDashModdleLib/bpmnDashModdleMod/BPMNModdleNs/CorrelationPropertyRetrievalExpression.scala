package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationPropertyRetrievalExpression extends BaseElement {
  var messagePath: FormalExpression
  var messageRef: Message
}

object CorrelationPropertyRetrievalExpression {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    messagePath: FormalExpression,
    messageRef: Message,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CorrelationPropertyRetrievalExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("messagePath")(messagePath)
    __obj.updateDynamic("messageRef")(messageRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CorrelationPropertyRetrievalExpression]
  }
}

