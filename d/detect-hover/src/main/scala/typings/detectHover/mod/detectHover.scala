package typings.detectHover.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectHover extends js.Object {
  var anyHover: Boolean = js.native
  var anyNone: Boolean = js.native
  var hover: Boolean = js.native
  var none: Boolean = js.native
  def update(): Unit = js.native
}

object detectHover {
  @scala.inline
  def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: () => Unit): detectHover = {
    val __obj = js.Dynamic.literal(anyHover = anyHover.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectHover]
  }
  @scala.inline
  implicit class detectHoverOps[Self <: detectHover] (val x: Self) extends AnyVal {
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
    def setAnyHover(value: Boolean): Self = this.set("anyHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnyNone(value: Boolean): Self = this.set("anyNone", value.asInstanceOf[js.Any])
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Boolean): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

