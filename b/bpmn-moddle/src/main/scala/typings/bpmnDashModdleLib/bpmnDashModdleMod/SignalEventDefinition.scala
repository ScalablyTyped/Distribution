package typings
package bpmnDashModdleLib.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalEventDefinition extends BaseElement {
  var signalRef: Signal
}

object SignalEventDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: java.lang.String,
    signalRef: Signal,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): SignalEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, id = id, signalRef = signalRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[SignalEventDefinition]
  }
}

