package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.CallableElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ trait Process
  extends StObject
     with FlowElementsContainer {
  
  var artifacts: js.Array[Artifact]
  
  var auditing: Auditing
  
  var correlationSubscriptions: js.Array[CorrelationSubscription]
  
  var definitionalCollaborationRef: Collaboration
  
  var ioBinding: InputOutputBinding
  
  var ioSpecification: InputOutputSpecification
  
  var isClosed: Boolean
  
  var isExecutable: Boolean
  
  var monitoring: Monitoring
  
  var name: String
  
  var processType: String
  
  var properties: js.Array[Property]
  
  var resources: js.Array[ResourceRole]
  
  var supportedInterfaceRef: Interface
  
  var supports: js.Array[Process]
}
object Process {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    correlationSubscriptions: js.Array[CorrelationSubscription],
    definitionalCollaborationRef: Collaboration,
    flowElements: js.Array[FlowElement],
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    isClosed: Boolean,
    isExecutable: Boolean,
    laneSets: js.Array[LaneSet],
    monitoring: Monitoring,
    name: String,
    processType: String,
    properties: js.Array[Property],
    resources: js.Array[ResourceRole],
    supportedInterfaceRef: Interface,
    supports: js.Array[Process]
  ): Process = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], correlationSubscriptions = correlationSubscriptions.asInstanceOf[js.Any], definitionalCollaborationRef = definitionalCollaborationRef.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isExecutable = isExecutable.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processType = processType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  
  @scala.inline
  implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setAuditing(value: Auditing): Self = StObject.set(x, "auditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationSubscriptions(value: js.Array[CorrelationSubscription]): Self = StObject.set(x, "correlationSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationSubscriptionsVarargs(value: CorrelationSubscription*): Self = StObject.set(x, "correlationSubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitionalCollaborationRef(value: Collaboration): Self = StObject.set(x, "definitionalCollaborationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoBinding(value: InputOutputBinding): Self = StObject.set(x, "ioBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoSpecification(value: InputOutputSpecification): Self = StObject.set(x, "ioSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessType(value: String): Self = StObject.set(x, "processType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ResourceRole]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: ResourceRole*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSupportedInterfaceRef(value: Interface): Self = StObject.set(x, "supportedInterfaceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports(value: js.Array[Process]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVarargs(value: Process*): Self = StObject.set(x, "supports", js.Array(value :_*))
  }
}
