package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends SubProcess {
  var method: java.lang.String
  var protocal: java.lang.String
}

object Transaction {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: scala.Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    ioSpecification: InputOutputSpecification,
    isForCompensation: scala.Boolean,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    method: java.lang.String,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    protocal: java.lang.String,
    resources: ResourceRole,
    startQuantity: scala.Double,
    triggeredByEvent: scala.Boolean,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("boundaryEventRefs")(boundaryEventRefs)
    __obj.updateDynamic("categoryValueRef")(categoryValueRef)
    __obj.updateDynamic("completionQuantity")(completionQuantity)
    __obj.updateDynamic("dataInputAssociations")(dataInputAssociations)
    __obj.updateDynamic("dataOutputAssociations")(dataOutputAssociations)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("flowElements")(flowElements)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("incomingConversationLinks")(incomingConversationLinks)
    __obj.updateDynamic("ioSpecification")(ioSpecification)
    __obj.updateDynamic("isForCompensation")(isForCompensation)
    __obj.updateDynamic("laneSets")(laneSets)
    __obj.updateDynamic("lanes")(lanes)
    __obj.updateDynamic("loopCharacteristics")(loopCharacteristics)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.updateDynamic("outgoingConversationLinks")(outgoingConversationLinks)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("protocal")(protocal)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("startQuantity")(startQuantity)
    __obj.updateDynamic("triggeredByEvent")(triggeredByEvent)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Transaction]
  }
}

