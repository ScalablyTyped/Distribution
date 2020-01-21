package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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

