package typings.blueprintjsTable.editableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableCellState extends js.Object {
  var dirtyValue: js.UndefOr[String] = js.native
  var isEditing: js.UndefOr[Boolean] = js.native
  var savedValue: js.UndefOr[String] = js.native
}

object IEditableCellState {
  @scala.inline
  def apply(): IEditableCellState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableCellState]
  }
  @scala.inline
  implicit class IEditableCellStateOps[Self <: IEditableCellState] (val x: Self) extends AnyVal {
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
    def setDirtyValue(value: String): Self = this.set("dirtyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtyValue: Self = this.set("dirtyValue", js.undefined)
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    @scala.inline
    def setSavedValue(value: String): Self = this.set("savedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedValue: Self = this.set("savedValue", js.undefined)
  }
  
}

