package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceFlow extends FlowElement {
  
  var conditionExpression: Expression = js.native
  
  var isImmediate: Boolean = js.native
  
  var sourceRef: FlowNode = js.native
  
  var targetRef: FlowNode = js.native
}
object SequenceFlow {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    conditionExpression: Expression,
    id: String,
    isImmediate: Boolean,
    monitoring: Monitoring,
    sourceRef: FlowNode,
    targetRef: FlowNode
  ): SequenceFlow = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], conditionExpression = conditionExpression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isImmediate = isImmediate.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceFlow]
  }
  
  @scala.inline
  implicit class SequenceFlowMutableBuilder[Self <: SequenceFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionExpression(value: Expression): Self = StObject.set(x, "conditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImmediate(value: Boolean): Self = StObject.set(x, "isImmediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRef(value: FlowNode): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: FlowNode): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
