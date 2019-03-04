package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerEntity extends BaseElement {
  var name: java.lang.String
  var participantRef: js.Array[Participant]
}

object PartnerEntity {
  @scala.inline
  def apply(
    $type: ElementType,
    id: java.lang.String,
    name: java.lang.String,
    participantRef: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): PartnerEntity = {
    val __obj = js.Dynamic.literal($type = $type, id = id, name = name, participantRef = participantRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[PartnerEntity]
  }
}

