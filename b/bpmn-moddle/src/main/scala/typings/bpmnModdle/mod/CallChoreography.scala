package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], calledChoreographyRef = calledChoreographyRef.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallChoreography]
  }
}

