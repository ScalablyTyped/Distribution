package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deletable extends js.Object {
  var callback: js.UndefOr[js.Function] = js.native
  var deletable: js.UndefOr[Boolean] = js.native
  var deleteLabel: js.UndefOr[String] = js.native
  var doneLabel: js.UndefOr[String] = js.native
  var editLabel: js.UndefOr[String] = js.native
  var movable: js.UndefOr[Boolean] = js.native
}

object Deletable {
  @scala.inline
  def apply(): Deletable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deletable]
  }
  @scala.inline
  implicit class DeletableOps[Self <: Deletable] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDeletable(value: Boolean): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
    @scala.inline
    def setDeleteLabel(value: String): Self = this.set("deleteLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteLabel: Self = this.set("deleteLabel", js.undefined)
    @scala.inline
    def setDoneLabel(value: String): Self = this.set("doneLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoneLabel: Self = this.set("doneLabel", js.undefined)
    @scala.inline
    def setEditLabel(value: String): Self = this.set("editLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditLabel: Self = this.set("editLabel", js.undefined)
    @scala.inline
    def setMovable(value: Boolean): Self = this.set("movable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovable: Self = this.set("movable", js.undefined)
  }
  
}

