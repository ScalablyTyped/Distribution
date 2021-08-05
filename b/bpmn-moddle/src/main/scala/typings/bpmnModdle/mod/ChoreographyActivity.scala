package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoreographyActivity
  extends StObject
     with FlowNode {
  
  var correlationKeys: js.Array[CorrelationKey]
  
  var initiatingParticipantRef: Participant
  
  var loopType: ChoreographyLoopType
  
  var participantRef: js.Array[Participant]
}
object ChoreographyActivity {
  
  inline def apply(
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
  
  extension [Self <: ChoreographyActivity](x: Self) {
    
    inline def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = StObject.set(x, "correlationKeys", value.asInstanceOf[js.Any])
    
    inline def setCorrelationKeysVarargs(value: CorrelationKey*): Self = StObject.set(x, "correlationKeys", js.Array(value :_*))
    
    inline def setInitiatingParticipantRef(value: Participant): Self = StObject.set(x, "initiatingParticipantRef", value.asInstanceOf[js.Any])
    
    inline def setLoopType(value: ChoreographyLoopType): Self = StObject.set(x, "loopType", value.asInstanceOf[js.Any])
    
    inline def setParticipantRef(value: js.Array[Participant]): Self = StObject.set(x, "participantRef", value.asInstanceOf[js.Any])
    
    inline def setParticipantRefVarargs(value: Participant*): Self = StObject.set(x, "participantRef", js.Array(value :_*))
  }
}
