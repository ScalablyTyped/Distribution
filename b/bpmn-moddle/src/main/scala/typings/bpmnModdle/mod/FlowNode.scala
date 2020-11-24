package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowNode extends FlowElement {
  
  var incoming: js.Array[SequenceFlow] = js.native
  
  var lanes: js.Array[Lane] = js.native
  
  var outgoing: js.Array[SequenceFlow] = js.native
}
object FlowNode {
  
  @scala.inline
  def apply(
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
  implicit class FlowNodeOps[Self <: FlowNode] (val x: Self) extends AnyVal {
    
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
    def setIncomingVarargs(value: SequenceFlow*): Self = this.set("incoming", js.Array(value :_*))
    
    @scala.inline
    def setIncoming(value: js.Array[SequenceFlow]): Self = this.set("incoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanesVarargs(value: Lane*): Self = this.set("lanes", js.Array(value :_*))
    
    @scala.inline
    def setLanes(value: js.Array[Lane]): Self = this.set("lanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingVarargs(value: SequenceFlow*): Self = this.set("outgoing", js.Array(value :_*))
    
    @scala.inline
    def setOutgoing(value: js.Array[SequenceFlow]): Self = this.set("outgoing", value.asInstanceOf[js.Any])
  }
}
