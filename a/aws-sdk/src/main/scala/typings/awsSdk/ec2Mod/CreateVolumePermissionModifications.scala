package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVolumePermissionModifications extends js.Object {
  /**
    * Adds the specified AWS account ID or group to the list.
    */
  var Add: js.UndefOr[CreateVolumePermissionList] = js.native
  /**
    * Removes the specified AWS account ID or group from the list.
    */
  var Remove: js.UndefOr[CreateVolumePermissionList] = js.native
}

object CreateVolumePermissionModifications {
  @scala.inline
  def apply(): CreateVolumePermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermissionModifications]
  }
  @scala.inline
  implicit class CreateVolumePermissionModificationsOps[Self <: CreateVolumePermissionModifications] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: CreateVolumePermission*): Self = this.set("Add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: CreateVolumePermissionList): Self = this.set("Add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("Add", js.undefined)
    @scala.inline
    def setRemoveVarargs(value: CreateVolumePermission*): Self = this.set("Remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: CreateVolumePermissionList): Self = this.set("Remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("Remove", js.undefined)
  }
  
}

