package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SequenceFlowOps[Self <: SequenceFlow] (val x: Self) extends AnyVal {
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
    def setConditionExpression(value: Expression): Self = this.set("conditionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsImmediate(value: Boolean): Self = this.set("isImmediate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRef(value: FlowNode): Self = this.set("sourceRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: FlowNode): Self = this.set("targetRef", value.asInstanceOf[js.Any])
  }
  
}

