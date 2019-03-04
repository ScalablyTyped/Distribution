package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationKey extends BaseElement {
  var correlationPropertyRef: CorrelationProperty
  var name: java.lang.String
}

object CorrelationKey {
  @scala.inline
  def apply(
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    id: java.lang.String,
    name: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CorrelationKey = {
    val __obj = js.Dynamic.literal($type = $type, correlationPropertyRef = correlationPropertyRef, id = id, name = name)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CorrelationKey]
  }
}

