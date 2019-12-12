package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnDashModdle.bpmnDashModdleMod.TypeDerived because Already inherited
- typings.bpmnDashModdle.bpmnDashModdleMod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks */ @js.native
trait ManualTask extends Activity {
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

