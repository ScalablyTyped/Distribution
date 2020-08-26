package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dismiss extends js.Object {
  def dismiss(): Unit = js.native
}

object Dismiss {
  @scala.inline
  def apply(dismiss: () => Unit): Dismiss = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[Dismiss]
  }
  @scala.inline
  implicit class DismissOps[Self <: Dismiss] (val x: Self) extends AnyVal {
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
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
  }
  
}

