package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowNode
  extends StObject
     with FlowElement {
  
  var incoming: js.Array[SequenceFlow]
  
  var lanes: js.Array[Lane]
  
  var outgoing: js.Array[SequenceFlow]
}
object FlowNode {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): FlowNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowNode] (val x: Self) extends AnyVal {
    
    inline def setIncoming(value: js.Array[SequenceFlow]): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
    
    inline def setIncomingVarargs(value: SequenceFlow*): Self = StObject.set(x, "incoming", js.Array(value*))
    
    inline def setLanes(value: js.Array[Lane]): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
    
    inline def setLanesVarargs(value: Lane*): Self = StObject.set(x, "lanes", js.Array(value*))
    
    inline def setOutgoing(value: js.Array[SequenceFlow]): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    
    inline def setOutgoingVarargs(value: SequenceFlow*): Self = StObject.set(x, "outgoing", js.Array(value*))
  }
}
