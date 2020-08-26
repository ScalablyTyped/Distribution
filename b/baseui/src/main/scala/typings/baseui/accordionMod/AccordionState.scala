package typings.baseui.accordionMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionState extends js.Object {
  var expanded: js.Array[Key] = js.native
}

object AccordionState {
  @scala.inline
  def apply(expanded: js.Array[Key]): AccordionState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionState]
  }
  @scala.inline
  implicit class AccordionStateOps[Self <: AccordionState] (val x: Self) extends AnyVal {
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
    def setExpandedVarargs(value: Key*): Self = this.set("expanded", js.Array(value :_*))
    @scala.inline
    def setExpanded(value: js.Array[Key]): Self = this.set("expanded", value.asInstanceOf[js.Any])
  }
  
}

