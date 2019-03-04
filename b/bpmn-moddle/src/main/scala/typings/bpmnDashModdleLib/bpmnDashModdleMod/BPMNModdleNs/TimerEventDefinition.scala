package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerEventDefinition extends BaseElement {
  var timeCycle: Expression
  var timeDate: Expression
  var timeDuration: Expression
}

object TimerEventDefinition {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    timeCycle: Expression,
    timeDate: Expression,
    timeDuration: Expression,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): TimerEventDefinition = {
    val __obj = js.Dynamic.literal($type = $type, id = id, timeCycle = timeCycle, timeDate = timeDate, timeDuration = timeDuration)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[TimerEventDefinition]
  }
}

