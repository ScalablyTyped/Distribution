package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.Collaboration because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, isClosed, participants, messageFlows, artifacts, conversations, conversationAssociations, participantAssociations, messageFlowAssociations, correlationKeys, choreographyRef, conversationLinks */ @js.native
trait GlobalChoreographyTask extends FlowElementsContainer {
  var artifacts: js.Array[Artifact] = js.native
  var choreographyRef: js.Array[Choreography] = js.native
  var conversationAssociations: js.Array[ConversationAssociation] = js.native
  var conversationLinks: js.Array[ConversationLink] = js.native
  var conversations: js.Array[ConversationNode] = js.native
  var correlationKeys: js.Array[CorrelationKey] = js.native
  var initiatingParticipantRef: Participant = js.native
  var isClosed: Boolean = js.native
  var messageFlowAssociations: js.Array[MessageFlowAssociation] = js.native
  var messageFlows: js.Array[MessageFlow] = js.native
  var name: String = js.native
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
  var participants: js.Array[Participant] = js.native
}

