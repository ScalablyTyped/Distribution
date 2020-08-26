package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeaterName extends js.Object {
  var repeaterName: js.UndefOr[js.Any] = js.native
}

object RepeaterName {
  @scala.inline
  def apply(): RepeaterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeaterName]
  }
  @scala.inline
  implicit class RepeaterNameOps[Self <: RepeaterName] (val x: Self) extends AnyVal {
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
    def setRepeaterName(value: js.Any): Self = this.set("repeaterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeaterName: Self = this.set("repeaterName", js.undefined)
  }
  
}

