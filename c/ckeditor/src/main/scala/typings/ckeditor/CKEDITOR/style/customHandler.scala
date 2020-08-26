package typings.ckeditor.CKEDITOR.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait customHandler extends js.Object {
  var assignedTo: js.UndefOr[Double] = js.native
  var setup: js.UndefOr[js.Function1[/* style */ definition, Unit]] = js.native
  var `type`: String | Double = js.native
}

object customHandler {
  @scala.inline
  def apply(`type`: String | Double): customHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[customHandler]
  }
  @scala.inline
  implicit class customHandlerOps[Self <: customHandler] (val x: Self) extends AnyVal {
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
    def setType(value: String | Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignedTo(value: Double): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    @scala.inline
    def setSetup(value: /* style */ definition => Unit): Self = this.set("setup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
  }
  
}

