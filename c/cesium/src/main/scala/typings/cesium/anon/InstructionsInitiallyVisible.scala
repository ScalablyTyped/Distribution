package typings.cesium.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstructionsInitiallyVisible extends js.Object {
  var container: Element | String = js.native
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.native
}

object InstructionsInitiallyVisible {
  @scala.inline
  def apply(container: Element | String): InstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionsInitiallyVisible]
  }
  @scala.inline
  implicit class InstructionsInitiallyVisibleOps[Self <: InstructionsInitiallyVisible] (val x: Self) extends AnyVal {
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
    def setContainer(value: Element | String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstructionsInitiallyVisible(value: Boolean): Self = this.set("instructionsInitiallyVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionsInitiallyVisible: Self = this.set("instructionsInitiallyVisible", js.undefined)
  }
  
}

