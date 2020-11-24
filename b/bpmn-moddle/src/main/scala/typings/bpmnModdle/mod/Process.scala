package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.CallableElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ @js.native
trait Process extends FlowElementsContainer {
  
  var artifacts: js.Array[Artifact] = js.native
  
  var auditing: Auditing = js.native
  
  var correlationSubscriptions: js.Array[CorrelationSubscription] = js.native
  
  var definitionalCollaborationRef: Collaboration = js.native
  
  var ioBinding: InputOutputBinding = js.native
  
  var ioSpecification: InputOutputSpecification = js.native
  
  var isClosed: Boolean = js.native
  
  var isExecutable: Boolean = js.native
  
  var monitoring: Monitoring = js.native
  
  var name: String = js.native
  
  var processType: String = js.native
  
  var properties: js.Array[Property] = js.native
  
  var resources: js.Array[ResourceRole] = js.native
  
  var supportedInterfaceRef: Interface = js.native
  
  var supports: js.Array[Process] = js.native
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
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    
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
    def setAuditing(value: Auditing): Self = this.set("auditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationSubscriptionsVarargs(value: CorrelationSubscription*): Self = this.set("correlationSubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setCorrelationSubscriptions(value: js.Array[CorrelationSubscription]): Self = this.set("correlationSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionalCollaborationRef(value: Collaboration): Self = this.set("definitionalCollaborationRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoBinding(value: InputOutputBinding): Self = this.set("ioBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoSpecification(value: InputOutputSpecification): Self = this.set("ioSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = this.set("isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessType(value: String): Self = this.set("processType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: ResourceRole*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ResourceRole]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedInterfaceRef(value: Interface): Self = this.set("supportedInterfaceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVarargs(value: Process*): Self = this.set("supports", js.Array(value :_*))
    
    @scala.inline
    def setSupports(value: js.Array[Process]): Self = this.set("supports", value.asInstanceOf[js.Any])
  }
}
