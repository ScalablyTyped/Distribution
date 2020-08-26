package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Association extends BaseElement {
  var associationDirection: AssociationDirection = js.native
  var sourceRef: BaseElement = js.native
  var targetRef: BaseElement = js.native
}

object Association {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    associationDirection: AssociationDirection,
    id: String,
    sourceRef: BaseElement,
    targetRef: BaseElement
  ): Association = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], associationDirection = associationDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
  @scala.inline
  implicit class AssociationOps[Self <: Association] (val x: Self) extends AnyVal {
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
    def setAssociationDirection(value: AssociationDirection): Self = this.set("associationDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRef(value: BaseElement): Self = this.set("sourceRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: BaseElement): Self = this.set("targetRef", value.asInstanceOf[js.Any])
  }
  
}

