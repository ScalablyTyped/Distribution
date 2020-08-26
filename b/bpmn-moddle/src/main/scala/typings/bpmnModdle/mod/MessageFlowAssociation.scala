package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageFlowAssociation extends BaseElement {
  var innerMessageFlowRef: MessageFlow = js.native
  var outerMessageFlowRef: MessageFlow = js.native
}

object MessageFlowAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    innerMessageFlowRef: MessageFlow,
    outerMessageFlowRef: MessageFlow
  ): MessageFlowAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerMessageFlowRef = innerMessageFlowRef.asInstanceOf[js.Any], outerMessageFlowRef = outerMessageFlowRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFlowAssociation]
  }
  @scala.inline
  implicit class MessageFlowAssociationOps[Self <: MessageFlowAssociation] (val x: Self) extends AnyVal {
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
    def setInnerMessageFlowRef(value: MessageFlow): Self = this.set("innerMessageFlowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterMessageFlowRef(value: MessageFlow): Self = this.set("outerMessageFlowRef", value.asInstanceOf[js.Any])
  }
  
}

