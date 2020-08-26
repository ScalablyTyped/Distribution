package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOption extends js.Object {
  /**
    * Apply a CSS fade transition to the toast.
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide the toast.
    *
    * @default true
    */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
    * Delay hiding the toast in millisecond.
    *
    * @default 500
    */
  var delay: js.UndefOr[Double] = js.native
}

object ToastOption {
  @scala.inline
  def apply(): ToastOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOption]
  }
  @scala.inline
  implicit class ToastOptionOps[Self <: ToastOption] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
  
}

