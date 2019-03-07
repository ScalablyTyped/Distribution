package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ trait SubProcess extends Activity {
  var artifacts: js.Array[Artifact]
  var flowElements: js.Array[FlowElement]
  var incomingConversationLinks: js.Array[ConversationLink]
  var laneSets: js.Array[LaneSet]
  var outgoingConversationLinks: js.Array[ConversationLink]
  var triggeredByEvent: scala.Boolean
}

object SubProcess {
  @scala.inline
  def apply(
    $parent: TypeDerived,
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
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: scala.Double,
    triggeredByEvent: scala.Boolean,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: java.lang.String = null
  ): SubProcess = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, artifacts = artifacts, auditing = auditing, boundaryEventRefs = boundaryEventRefs, categoryValueRef = categoryValueRef, completionQuantity = completionQuantity, dataInputAssociations = dataInputAssociations, dataOutputAssociations = dataOutputAssociations, default = default, flowElements = flowElements, id = id, incoming = incoming, incomingConversationLinks = incomingConversationLinks, ioSpecification = ioSpecification, isForCompensation = isForCompensation, laneSets = laneSets, lanes = lanes, loopCharacteristics = loopCharacteristics, monitoring = monitoring, outgoing = outgoing, outgoingConversationLinks = outgoingConversationLinks, properties = properties, resources = resources, startQuantity = startQuantity, triggeredByEvent = triggeredByEvent)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SubProcess]
  }
}

