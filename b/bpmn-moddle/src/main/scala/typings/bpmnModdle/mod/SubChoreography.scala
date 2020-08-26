package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ @js.native
trait SubChoreography extends ChoreographyActivity {
  var artifacts: js.Array[Artifact] = js.native
  var flowElements: js.Array[FlowElement] = js.native
  var laneSets: js.Array[LaneSet] = js.native
}

object SubChoreography {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantRef: js.Array[Participant]
  ): SubChoreography = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubChoreography]
  }
  @scala.inline
  implicit class SubChoreographyOps[Self <: SubChoreography] (val x: Self) extends AnyVal {
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
    def setLaneSetsVarargs(value: LaneSet*): Self = this.set("laneSets", js.Array(value :_*))
    @scala.inline
    def setLaneSets(value: js.Array[LaneSet]): Self = this.set("laneSets", value.asInstanceOf[js.Any])
  }
  
}

