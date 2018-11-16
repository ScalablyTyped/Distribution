package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.CallableElement because Would inherit conflicting mutable fields List($type, $attrs, documentation, id, extensionElements, extensionDefinitions))*/

trait Process extends FlowElementsContainer {
  var artifacts: js.Array[Artifact]
  var auditing: Auditing
  var correlationSubscriptions: js.Array[CorrelationSubscription]
  var definitionalCollaborationRef: Collaboration
  var isClosed: scala.Boolean
  var isExecutable: scala.Boolean
  var monitoring: Monitoring
  var processType: java.lang.String
  var properties: js.Array[Property]
  var resources: js.Array[ResourceRole]
  var supports: js.Array[Process]
}

