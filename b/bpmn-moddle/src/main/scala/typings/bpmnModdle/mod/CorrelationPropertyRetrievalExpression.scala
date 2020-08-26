package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationPropertyRetrievalExpression extends BaseElement {
  var messagePath: FormalExpression = js.native
  var messageRef: Message = js.native
}

object CorrelationPropertyRetrievalExpression {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    messagePath: FormalExpression,
    messageRef: Message
  ): CorrelationPropertyRetrievalExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messagePath = messagePath.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyRetrievalExpression]
  }
  @scala.inline
  implicit class CorrelationPropertyRetrievalExpressionOps[Self <: CorrelationPropertyRetrievalExpression] (val x: Self) extends AnyVal {
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
    def setMessagePath(value: FormalExpression): Self = this.set("messagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageRef(value: Message): Self = this.set("messageRef", value.asInstanceOf[js.Any])
  }
  
}

