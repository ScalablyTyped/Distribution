package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.CallableElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ trait Process extends FlowElementsContainer {
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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, artifacts = artifacts, auditing = auditing, correlationSubscriptions = correlationSubscriptions, definitionalCollaborationRef = definitionalCollaborationRef, flowElements = flowElements, id = id, ioBinding = ioBinding, ioSpecification = ioSpecification, isClosed = isClosed, isExecutable = isExecutable, laneSets = laneSets, monitoring = monitoring, name = name, processType = processType, properties = properties, resources = resources, supportedInterfaceRef = supportedInterfaceRef, supports = supports)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Process]
  }
}

