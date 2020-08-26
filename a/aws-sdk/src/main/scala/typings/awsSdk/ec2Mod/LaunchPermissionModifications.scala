package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionModifications extends js.Object {
  /**
    * The AWS account ID to add to the list of launch permissions for the AMI.
    */
  var Add: js.UndefOr[LaunchPermissionList] = js.native
  /**
    * The AWS account ID to remove from the list of launch permissions for the AMI.
    */
  var Remove: js.UndefOr[LaunchPermissionList] = js.native
}

object LaunchPermissionModifications {
  @scala.inline
  def apply(): LaunchPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionModifications]
  }
  @scala.inline
  implicit class LaunchPermissionModificationsOps[Self <: LaunchPermissionModifications] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: LaunchPermission*): Self = this.set("Add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: LaunchPermissionList): Self = this.set("Add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("Add", js.undefined)
    @scala.inline
    def setRemoveVarargs(value: LaunchPermission*): Self = this.set("Remove", js.Array(value :_*))
    @scala.inline
    def setRemove(value: LaunchPermissionList): Self = this.set("Remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("Remove", js.undefined)
  }
  
}

