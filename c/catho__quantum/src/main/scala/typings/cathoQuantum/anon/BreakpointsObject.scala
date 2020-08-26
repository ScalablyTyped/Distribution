package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakpointsObject extends js.Object {
  var breakpoints: js.Object = js.native
}

object BreakpointsObject {
  @scala.inline
  def apply(breakpoints: js.Object): BreakpointsObject = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsObject]
  }
  @scala.inline
  implicit class BreakpointsObjectOps[Self <: BreakpointsObject] (val x: Self) extends AnyVal {
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
    def setBreakpoints(value: js.Object): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
  }
  
}

