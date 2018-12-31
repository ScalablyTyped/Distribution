package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.BaseElement because Would inherit conflicting mutable fields List($type))*/
trait ConversationNode extends InteractionNode {
  var correlationKeys: js.Array[CorrelationKey]
  var messageFlowRefs: js.Array[MessageFlow]
  var name: java.lang.String
  var participantRefs: js.Array[Participant]
}

