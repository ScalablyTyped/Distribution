package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait ReceiveTask extends Activity {
  var implementation: String = js.native
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var instantiate: Boolean = js.native
  var messageRef: Message = js.native
  var operationRef: Operation = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

