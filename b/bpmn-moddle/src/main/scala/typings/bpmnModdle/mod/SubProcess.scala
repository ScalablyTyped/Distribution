package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks
- typings.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ @js.native
trait SubProcess extends Activity {
  var artifacts: js.Array[Artifact] = js.native
  var flowElements: js.Array[FlowElement] = js.native
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var laneSets: js.Array[LaneSet] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
  var triggeredByEvent: Boolean = js.native
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
    triggeredByEvent: Boolean
  ): SubProcess = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any], triggeredByEvent = triggeredByEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubProcess]
  }
  @scala.inline
  implicit class SubProcessOps[Self <: SubProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowElementsVarargs(value: FlowElement*): Self = this.set("flowElements", js.Array(value :_*))
    @scala.inline
    def setFlowElements(value: js.Array[FlowElement]): Self = this.set("flowElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingConversationLinksVarargs(value: ConversationLink*): Self = this.set("incomingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setIncomingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("incomingConversationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaneSetsVarargs(value: LaneSet*): Self = this.set("laneSets", js.Array(value :_*))
    @scala.inline
    def setLaneSets(value: js.Array[LaneSet]): Self = this.set("laneSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingConversationLinksVarargs(value: ConversationLink*): Self = this.set("outgoingConversationLinks", js.Array(value :_*))
    @scala.inline
    def setOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = this.set("outgoingConversationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggeredByEvent(value: Boolean): Self = this.set("triggeredByEvent", value.asInstanceOf[js.Any])
  }
  
}

