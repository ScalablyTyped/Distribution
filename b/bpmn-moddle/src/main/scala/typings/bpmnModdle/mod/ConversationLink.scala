package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationLink extends BaseElement {
  var name: String = js.native
  var sourceRef: InteractionNode = js.native
  var targetRef: InteractionNode = js.native
}

object ConversationLink {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    sourceRef: InteractionNode,
    targetRef: InteractionNode
  ): ConversationLink = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationLink]
  }
  @scala.inline
  implicit class ConversationLinkOps[Self <: ConversationLink] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRef(value: InteractionNode): Self = this.set("sourceRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetRef(value: InteractionNode): Self = this.set("targetRef", value.asInstanceOf[js.Any])
  }
  
}

