package typings.confirmdialog.options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait buttonOptionss extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  var confirm: js.UndefOr[js.Function0[Unit]] = js.native
}

object buttonOptionss {
  @scala.inline
  def apply(): buttonOptionss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[buttonOptionss]
  }
  @scala.inline
  implicit class buttonOptionssOps[Self <: buttonOptionss] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setConfirm(value: () => Unit): Self = this.set("confirm", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
  }
  
}

