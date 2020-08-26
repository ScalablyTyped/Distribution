package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert extends js.Object {
  var alert: js.UndefOr[js.Object] = js.native
  var button: js.UndefOr[js.Object] = js.native
}

object Alert {
  @scala.inline
  def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
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
    def setAlert(value: js.Object): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setButton(value: js.Object): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
  }
  
}

