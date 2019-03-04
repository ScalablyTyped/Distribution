package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Escalation extends BaseElement {
  var escalationCode: java.lang.String
  var name: java.lang.String
  var structureRef: ItemDefinition
}

object Escalation {
  @scala.inline
  def apply(
    $type: ElementType,
    escalationCode: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    structureRef: ItemDefinition,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Escalation = {
    val __obj = js.Dynamic.literal($type = $type, escalationCode = escalationCode, id = id, name = name, structureRef = structureRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Escalation]
  }
}

