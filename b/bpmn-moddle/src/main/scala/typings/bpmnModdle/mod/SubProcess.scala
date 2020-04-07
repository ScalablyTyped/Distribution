package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks
- typings.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ trait SubProcess extends Activity {
  var artifacts: js.Array[Artifact]
  var flowElements: js.Array[FlowElement]
  var incomingConversationLinks: js.Array[ConversationLink]
  var laneSets: js.Array[LaneSet]
  var outgoingConversationLinks: js.Array[ConversationLink]
  var triggeredByEvent: Boolean
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
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    flowElements: js.Array[FlowElement],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: Double,
    triggeredByEvent: Boolean,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): SubProcess = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any], triggeredByEvent = triggeredByEvent.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubProcess]
  }
}

