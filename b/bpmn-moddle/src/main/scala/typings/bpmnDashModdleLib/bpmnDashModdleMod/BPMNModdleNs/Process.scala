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

