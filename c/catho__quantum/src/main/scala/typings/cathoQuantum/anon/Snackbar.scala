package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snackbar extends js.Object {
  var button: js.UndefOr[js.Object] = js.native
  var snackbar: js.UndefOr[js.Object] = js.native
}

object Snackbar {
  @scala.inline
  def apply(): Snackbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snackbar]
  }
  @scala.inline
  implicit class SnackbarOps[Self <: Snackbar] (val x: Self) extends AnyVal {
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
    def setButton(value: js.Object): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setSnackbar(value: js.Object): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnackbar: Self = this.set("snackbar", js.undefined)
  }
  
}

