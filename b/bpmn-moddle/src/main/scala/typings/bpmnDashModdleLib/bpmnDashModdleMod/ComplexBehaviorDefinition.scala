package typings
package bpmnDashModdleLib.bpmnDashModdleMod

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
    $parent: TypeDerived,
    $type: ElementType,
    condition: FormalExpression,
    event: ImplicitThrowEvent,
    id: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): ComplexBehaviorDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, condition = condition, event = event, id = id)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[ComplexBehaviorDefinition]
  }
}

