package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.InteractionNode because var conflicts: $type. Inlined incomingConversationLinks, outgoingConversationLinks- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.FlowElementsContainer because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ trait SubProcess extends Activity {
  var artifacts: js.Array[Artifact]
  var flowElements: js.Array[FlowElement]
  var incomingConversationLinks: js.Array[ConversationLink]
  var laneSets: js.Array[LaneSet]
  var outgoingConversationLinks: js.Array[ConversationLink]
  var triggeredByEvent: scala.Boolean
}

