package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Front extends js.Object {
  var front: js.UndefOr[Boolean] = js.native
}

object Front {
  @scala.inline
  def apply(): Front = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Front]
  }
  @scala.inline
  implicit class FrontOps[Self <: Front] (val x: Self) extends AnyVal {
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
    def setFront(value: Boolean): Self = this.set("front", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFront: Self = this.set("front", js.undefined)
  }
  
}

