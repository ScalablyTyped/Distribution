package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ChoreographyActivityMutableBuilder[Self <: ChoreographyActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = StObject.set(x, "correlationKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = StObject.set(x, "correlationKeys", js.Array(value :_*))
    
    @scala.inline
    def setInitiatingParticipantRef(value: Participant): Self = StObject.set(x, "initiatingParticipantRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopType(value: ChoreographyLoopType): Self = StObject.set(x, "loopType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRef(value: js.Array[Participant]): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRefVarargs(value: Participant*): Self = StObject.set(x, "participantRef", js.Array(value :_*))
  }
}
