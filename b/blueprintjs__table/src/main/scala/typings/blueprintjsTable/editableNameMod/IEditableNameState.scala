package typings.blueprintjsTable.editableNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableNameState extends js.Object {
  var dirtyName: js.UndefOr[String] = js.native
  var isEditing: js.UndefOr[Boolean] = js.native
  var savedName: js.UndefOr[String] = js.native
}

object IEditableNameState {
  @scala.inline
  def apply(): IEditableNameState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableNameState]
  }
  @scala.inline
  implicit class IEditableNameStateOps[Self <: IEditableNameState] (val x: Self) extends AnyVal {
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
    def setDirtyName(value: String): Self = this.set("dirtyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtyName: Self = this.set("dirtyName", js.undefined)
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    @scala.inline
    def setSavedName(value: String): Self = this.set("savedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedName: Self = this.set("savedName", js.undefined)
  }
  
}

