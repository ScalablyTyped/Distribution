package typings.blueprintjsCore.anon

import typings.blueprintjsCore.toasterMod.IToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toasts extends js.Object {
  var toasts: js.Array[IToastOptions] = js.native
}

object Toasts {
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): Toasts = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toasts]
  }
  @scala.inline
  implicit class ToastsOps[Self <: Toasts] (val x: Self) extends AnyVal {
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
    def setToastsVarargs(value: IToastOptions*): Self = this.set("toasts", js.Array(value :_*))
    @scala.inline
    def setToasts(value: js.Array[IToastOptions]): Self = this.set("toasts", value.asInstanceOf[js.Any])
  }
  
}

