package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collaboration extends BaseElement {
  var artifacts: js.Array[Artifact] = js.native
  var choreographyRef: js.Array[Choreography] = js.native
  var conversationAssociations: js.Array[ConversationAssociation] = js.native
  var conversationLinks: js.Array[ConversationLink] = js.native
  var conversations: js.Array[ConversationNode] = js.native
  var correlationKeys: js.Array[CorrelationKey] = js.native
  var isClosed: Boolean = js.native
  var messageFlowAssociations: js.Array[MessageFlowAssociation] = js.native
  var messageFlows: js.Array[MessageFlow] = js.native
  var name: String = js.native
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
  var participants: js.Array[Participant] = js.native
}

