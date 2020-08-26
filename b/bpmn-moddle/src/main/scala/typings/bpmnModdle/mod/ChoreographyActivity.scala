package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoreographyActivity extends FlowNode {
  var correlationKeys: js.Array[CorrelationKey] = js.native
  var initiatingParticipantRef: Participant = js.native
  var loopType: ChoreographyLoopType = js.native
  var participantRef: js.Array[Participant] = js.native
}

object ChoreographyActivity {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantRef: js.Array[Participant]
  ): ChoreographyActivity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoreographyActivity]
  }
  @scala.inline
  implicit class ChoreographyActivityOps[Self <: ChoreographyActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = this.set("correlationKeys", js.Array(value :_*))
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = this.set("correlationKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitiatingParticipantRef(value: Participant): Self = this.set("initiatingParticipantRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopType(value: ChoreographyLoopType): Self = this.set("loopType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantRefVarargs(value: Participant*): Self = this.set("participantRef", js.Array(value :_*))
    @scala.inline
    def setParticipantRef(value: js.Array[Participant]): Self = this.set("participantRef", value.asInstanceOf[js.Any])
  }
  
}

