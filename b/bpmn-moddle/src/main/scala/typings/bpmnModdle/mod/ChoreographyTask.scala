package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoreographyTask
  extends StObject
     with ChoreographyActivity {
  
  var messageFlowRef: js.Array[MessageFlow]
}
object ChoreographyTask {
  
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
    messageFlowRef: js.Array[MessageFlow],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantRef: js.Array[Participant]
  ): ChoreographyTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], messageFlowRef = messageFlowRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoreographyTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoreographyTask] (val x: Self) extends AnyVal {
    
    inline def setMessageFlowRef(value: js.Array[MessageFlow]): Self = StObject.set(x, "messageFlowRef", value.asInstanceOf[js.Any])
    
    inline def setMessageFlowRefVarargs(value: MessageFlow*): Self = StObject.set(x, "messageFlowRef", js.Array(value*))
  }
}
