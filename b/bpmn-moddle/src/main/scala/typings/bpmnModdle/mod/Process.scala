package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.CallableElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ trait Process extends FlowElementsContainer {
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
    supports: js.Array[Process],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Process = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], correlationSubscriptions = correlationSubscriptions.asInstanceOf[js.Any], definitionalCollaborationRef = definitionalCollaborationRef.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isExecutable = isExecutable.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processType = processType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

