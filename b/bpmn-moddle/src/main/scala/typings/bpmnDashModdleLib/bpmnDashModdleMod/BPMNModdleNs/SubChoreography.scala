package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.FlowElementsContainer because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ trait SubChoreography extends ChoreographyActivity {
  var artifacts: js.Array[Artifact]
  var flowElements: js.Array[FlowElement]
  var laneSets: js.Array[LaneSet]
}

object SubChoreography {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    laneSets: js.Array[LaneSet],
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
  ): SubChoreography = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("correlationKeys")(correlationKeys)
    __obj.updateDynamic("flowElements")(flowElements)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("initiatingParticipantRef")(initiatingParticipantRef)
    __obj.updateDynamic("laneSets")(laneSets)
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
    __obj.asInstanceOf[SubChoreography]
  }
}

