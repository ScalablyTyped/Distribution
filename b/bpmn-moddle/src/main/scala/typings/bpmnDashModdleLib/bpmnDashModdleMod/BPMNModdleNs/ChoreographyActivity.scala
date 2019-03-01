package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoreographyActivity extends FlowNode {
  var correlationKeys: js.Array[CorrelationKey]
  var initiatingParticipantRef: Participant
  var loopType: ChoreographyLoopType
  var participantRef: js.Array[Participant]
}

object ChoreographyActivity {
  @scala.inline
  def apply(
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantRef: js.Array[Participant],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): ChoreographyActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("correlationKeys")(correlationKeys)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("initiatingParticipantRef")(initiatingParticipantRef)
    __obj.updateDynamic("lanes")(lanes)
    __obj.updateDynamic("loopType")(loopType)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("participantRef")(participantRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChoreographyActivity]
  }
}

