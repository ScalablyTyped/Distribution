package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assignment extends BaseElement {
  var from: Expression = js.native
  var to: Expression = js.native
}

object Assignment {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, from: Expression, id: String, to: Expression): Assignment = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
  @scala.inline
  implicit class AssignmentOps[Self <: Assignment] (val x: Self) extends AnyVal {
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
    def setFrom(value: Expression): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: Expression): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

