package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.BaseElement because Would inherit conflicting mutable fields List($type))*/
trait Participant extends InteractionNode {
  var endPointRefs: js.Array[EndPoint]
  var interfaceRef: js.Array[Interface]
  var name: java.lang.String
  var participantMultiplicity: ParticipantMultiplicity
  var processRef: Process
}

