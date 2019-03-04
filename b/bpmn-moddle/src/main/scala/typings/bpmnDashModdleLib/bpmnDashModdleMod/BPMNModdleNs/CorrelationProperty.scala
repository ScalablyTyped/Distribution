package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationProperty extends BaseElement {
  var correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression
  var name: java.lang.String
  var `type`: ItemDefinition
}

object CorrelationProperty {
  @scala.inline
  def apply(
    $type: ElementType,
    correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression,
    id: java.lang.String,
    name: java.lang.String,
    `type`: ItemDefinition,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): CorrelationProperty = {
    val __obj = js.Dynamic.literal($type = $type, correlationPropertyRetrievalExpression = correlationPropertyRetrievalExpression, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[CorrelationProperty]
  }
}

