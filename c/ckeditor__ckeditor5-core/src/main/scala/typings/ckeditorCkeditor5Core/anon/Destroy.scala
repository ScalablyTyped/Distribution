package typings.ckeditorCkeditor5Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destroy extends js.Object {
  def destroy(): Unit | Null | js.Promise[_] = js.native
}

object Destroy {
  @scala.inline
  def apply(destroy: () => Unit | Null | js.Promise[_]): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroy]
  }
  @scala.inline
  implicit class DestroyOps[Self <: Destroy] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit | Null | js.Promise[_]): Self = this.set("destroy", js.Any.fromFunction0(value))
  }
  
}

