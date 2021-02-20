package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends FlowNode {
  
  var default: SequenceFlow = js.native
  
  var boundaryEventRefs: js.Array[BoundaryEvent] = js.native
  
  var completionQuantity: Double = js.native
  
  var dataInputAssociations: js.Array[DataInputAssociation] = js.native
  
  var dataOutputAssociations: js.Array[DataOutputAssociation] = js.native
  
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
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundaryEventRefs(value: js.Array[BoundaryEvent]): Self = StObject.set(x, "boundaryEventRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryEventRefsVarargs(value: BoundaryEvent*): Self = StObject.set(x, "boundaryEventRefs", js.Array(value :_*))
    
    @scala.inline
    def setCompletionQuantity(value: Double): Self = StObject.set(x, "completionQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInputAssociations(value: js.Array[DataInputAssociation]): Self = StObject.set(x, "dataInputAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataInputAssociationsVarargs(value: DataInputAssociation*): Self = StObject.set(x, "dataInputAssociations", js.Array(value :_*))
    
    @scala.inline
    def setDataOutputAssociations(value: js.Array[DataOutputAssociation]): Self = StObject.set(x, "dataOutputAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOutputAssociationsVarargs(value: DataOutputAssociation*): Self = StObject.set(x, "dataOutputAssociations", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: SequenceFlow): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoSpecification(value: InputOutputSpecification): Self = StObject.set(x, "ioSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsForCompensation(value: Boolean): Self = StObject.set(x, "isForCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopCharacteristics(value: LoopCharacteristics): Self = StObject.set(x, "loopCharacteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: ResourceRole): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartQuantity(value: Double): Self = StObject.set(x, "startQuantity", value.asInstanceOf[js.Any])
  }
}
