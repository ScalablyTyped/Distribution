package typings.baseui.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelState extends js.Object {
  var expanded: Boolean = js.native
}

object PanelState {
  @scala.inline
  def apply(expanded: Boolean): PanelState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelState]
  }
  @scala.inline
  implicit class PanelStateOps[Self <: PanelState] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
  }
  
}

