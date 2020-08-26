package typings.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleClick extends js.Object {
  var delay: Double = js.native
}

object DoubleClick {
  @scala.inline
  def apply(delay: Double): DoubleClick = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClick]
  }
  @scala.inline
  implicit class DoubleClickOps[Self <: DoubleClick] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
  }
  
}

