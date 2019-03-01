package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompensateEventDefinition extends BaseElement {
  var activityRef: Activity
  var waitForCompletion: scala.Boolean
}

object CompensateEventDefinition {
  @scala.inline
  def apply(
    $type: ElementType,
    activityRef: Activity,
    id: java.lang.String,
    waitForCompletion: scala.Boolean,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CompensateEventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("activityRef")(activityRef)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("waitForCompletion")(waitForCompletion)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CompensateEventDefinition]
  }
}

