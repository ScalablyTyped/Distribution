package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallChoreography extends ChoreographyActivity {
  var calledChoreographyRef: Choreography
  var participantAssociations: js.Array[ParticipantAssociation]
}

object CallChoreography {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    calledChoreographyRef: Choreography,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRef: js.Array[Participant],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null,
    name: String = null
  ): CallChoreography = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, auditing = auditing, calledChoreographyRef = calledChoreographyRef, categoryValueRef = categoryValueRef, correlationKeys = correlationKeys, id = id, incoming = incoming, initiatingParticipantRef = initiatingParticipantRef, lanes = lanes, loopType = loopType, monitoring = monitoring, outgoing = outgoing, participantAssociations = participantAssociations, participantRef = participantRef)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CallChoreography]
  }
}

