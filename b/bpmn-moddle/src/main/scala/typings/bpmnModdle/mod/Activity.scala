package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends FlowNode {
  var boundaryEventRefs: js.Array[BoundaryEvent] = js.native
  var completionQuantity: Double = js.native
  var dataInputAssociations: js.Array[DataInputAssociation] = js.native
  var dataOutputAssociations: js.Array[DataOutputAssociation] = js.native
  var default: SequenceFlow = js.native
  var ioSpecification: InputOutputSpecification = js.native
  var isForCompensation: Boolean = js.native
  var loopCharacteristics: LoopCharacteristics = js.native
  var properties: js.Array[Property] = js.native
  var resources: ResourceRole = js.native
  var startQuantity: Double = js.native
}

object Activity {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: String,
    incoming: js.Array[SequenceFlow],
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: Double
  ): Activity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
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
    def setBoundaryEventRefsVarargs(value: BoundaryEvent*): Self = this.set("boundaryEventRefs", js.Array(value :_*))
    @scala.inline
    def setBoundaryEventRefs(value: js.Array[BoundaryEvent]): Self = this.set("boundaryEventRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionQuantity(value: Double): Self = this.set("completionQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataInputAssociationsVarargs(value: DataInputAssociation*): Self = this.set("dataInputAssociations", js.Array(value :_*))
    @scala.inline
    def setDataInputAssociations(value: js.Array[DataInputAssociation]): Self = this.set("dataInputAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataOutputAssociationsVarargs(value: DataOutputAssociation*): Self = this.set("dataOutputAssociations", js.Array(value :_*))
    @scala.inline
    def setDataOutputAssociations(value: js.Array[DataOutputAssociation]): Self = this.set("dataOutputAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: SequenceFlow): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setIoSpecification(value: InputOutputSpecification): Self = this.set("ioSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsForCompensation(value: Boolean): Self = this.set("isForCompensation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopCharacteristics(value: LoopCharacteristics): Self = this.set("loopCharacteristics", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResources(value: ResourceRole): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartQuantity(value: Double): Self = this.set("startQuantity", value.asInstanceOf[js.Any])
  }
  
}

