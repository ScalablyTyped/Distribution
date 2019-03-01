package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexBehaviorDefinition extends BaseElement {
  var condition: FormalExpression
  var event: ImplicitThrowEvent
}

object ComplexBehaviorDefinition {
  @scala.inline
  def apply(
    $type: ElementType,
    condition: FormalExpression,
    event: ImplicitThrowEvent,
    id: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ComplexBehaviorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("id")(id)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ComplexBehaviorDefinition]
  }
}

