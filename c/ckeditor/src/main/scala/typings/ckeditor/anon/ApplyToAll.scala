package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyToAll extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
}

object ApplyToAll {
  @scala.inline
  def apply(): ApplyToAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyToAll]
  }
  @scala.inline
  implicit class ApplyToAllOps[Self <: ApplyToAll] (val x: Self) extends AnyVal {
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
    def setApplyToAll(value: Boolean): Self = this.set("applyToAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyToAll: Self = this.set("applyToAll", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

