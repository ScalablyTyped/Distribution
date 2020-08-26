package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMoving extends js.Object {
  var isMoving: Boolean = js.native
}

object IsMoving {
  @scala.inline
  def apply(isMoving: Boolean): IsMoving = {
    val __obj = js.Dynamic.literal(isMoving = isMoving.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMoving]
  }
  @scala.inline
  implicit class IsMovingOps[Self <: IsMoving] (val x: Self) extends AnyVal {
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
    def setIsMoving(value: Boolean): Self = this.set("isMoving", value.asInstanceOf[js.Any])
  }
  
}

