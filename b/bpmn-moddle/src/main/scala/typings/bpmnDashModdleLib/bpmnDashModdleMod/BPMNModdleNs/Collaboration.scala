package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaboration extends BaseElement {
  var artifacts: js.Array[Artifact]
  var choreographyRef: js.Array[Choreography]
  var conversationAssociations: js.Array[ConversationAssociation]
  var conversationLinks: js.Array[ConversationLink]
  var conversations: js.Array[ConversationNode]
  var correlationKeys: js.Array[CorrelationKey]
  var isClosed: scala.Boolean
  var messageFlowAssociations: js.Array[MessageFlowAssociation]
  var messageFlows: js.Array[MessageFlow]
  var name: java.lang.String
  var participantAssociations: js.Array[ParticipantAssociation]
  var participants: js.Array[Participant]
}

