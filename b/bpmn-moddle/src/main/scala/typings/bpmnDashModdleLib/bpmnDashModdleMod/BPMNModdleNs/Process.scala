package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.CallableElement because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ trait Process extends FlowElementsContainer {
  var artifacts: js.Array[Artifact]
  var auditing: Auditing
  var correlationSubscriptions: js.Array[CorrelationSubscription]
  var definitionalCollaborationRef: Collaboration
  var ioBinding: InputOutputBinding
  var ioSpecification: InputOutputSpecification
  var isClosed: scala.Boolean
  var isExecutable: scala.Boolean
  var monitoring: Monitoring
  var name: java.lang.String
  var processType: java.lang.String
  var properties: js.Array[Property]
  var resources: js.Array[ResourceRole]
  var supportedInterfaceRef: Interface
  var supports: js.Array[Process]
}

object Process {
  @scala.inline
  def apply(
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    correlationSubscriptions: js.Array[CorrelationSubscription],
    definitionalCollaborationRef: Collaboration,
    flowElements: js.Array[FlowElement],
    id: java.lang.String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    isClosed: scala.Boolean,
    isExecutable: scala.Boolean,
    laneSets: js.Array[LaneSet],
    monitoring: Monitoring,
    name: java.lang.String,
    processType: java.lang.String,
    properties: js.Array[Property],
    resources: js.Array[ResourceRole],
    supportedInterfaceRef: Interface,
    supports: js.Array[Process],
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Process = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("auditing")(auditing)
    __obj.updateDynamic("correlationSubscriptions")(correlationSubscriptions)
    __obj.updateDynamic("definitionalCollaborationRef")(definitionalCollaborationRef)
    __obj.updateDynamic("flowElements")(flowElements)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ioBinding")(ioBinding)
    __obj.updateDynamic("ioSpecification")(ioSpecification)
    __obj.updateDynamic("isClosed")(isClosed)
    __obj.updateDynamic("isExecutable")(isExecutable)
    __obj.updateDynamic("laneSets")(laneSets)
    __obj.updateDynamic("monitoring")(monitoring)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("processType")(processType)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("supportedInterfaceRef")(supportedInterfaceRef)
    __obj.updateDynamic("supports")(supports)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Process]
  }
}

