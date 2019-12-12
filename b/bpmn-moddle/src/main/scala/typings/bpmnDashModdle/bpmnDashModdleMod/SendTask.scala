package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait SendTask extends Activity {
  var implementation: String = js.native
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var messageRef: Message = js.native
  var operationRef: Operation = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

