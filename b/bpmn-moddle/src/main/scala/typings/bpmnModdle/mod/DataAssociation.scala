package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataAssociation extends BaseElement {
  var assignment: Assignment = js.native
  var sourceRef: ItemAwareElement = js.native
  var targetRef: ItemAwareElement = js.native
  var transformation: FormalExpression = js.native
}

object DataAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    assignment: Assignment,
    id: String,
    sourceRef: ItemAwareElement,
    targetRef: ItemAwareElement,
    transformation: FormalExpression
  ): DataAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], assignment = assignment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAssociation]
  }
  @scala.inline
  implicit class DataAssociationOps[Self <: DataAssociation] (val x: Self) extends AnyVal {
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
    def setAssignment(value: Assignment): Self = this.set("assignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRef(value: ItemAwareElement): Self = this.set("sourceRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: ItemAwareElement): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformation(value: FormalExpression): Self = this.set("transformation", value.asInstanceOf[js.Any])
  }
  
}

