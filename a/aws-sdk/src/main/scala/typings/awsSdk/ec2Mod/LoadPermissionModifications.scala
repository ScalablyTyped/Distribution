package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPermissionModifications extends js.Object {
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.native
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.native
}

object LoadPermissionModifications {
  @scala.inline
  def apply(): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionModifications]
  }
  @scala.inline
  implicit class LoadPermissionModificationsOps[Self <: LoadPermissionModifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddVarargs(value: LoadPermissionRequest*): Self = this.set("Add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: LoadPermissionListRequest): Self = this.set("Add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("Add", js.undefined)
    @scala.inline
    def setRemoveVarargs(value: LoadPermissionRequest*): Self = this.set("Remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: LoadPermissionListRequest): Self = this.set("Remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("Remove", js.undefined)
  }
  
}

