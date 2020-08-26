package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVolumePermission extends js.Object {
  /**
    * The group to be added or removed. The possible value is all.
    */
  var Group: js.UndefOr[PermissionGroup] = js.native
  /**
    * The AWS account ID to be added or removed.
    */
  var UserId: js.UndefOr[String] = js.native
}

object CreateVolumePermission {
  @scala.inline
  def apply(): CreateVolumePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermission]
  }
  @scala.inline
  implicit class CreateVolumePermissionOps[Self <: CreateVolumePermission] (val x: Self) extends AnyVal {
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
    def setGroup(value: PermissionGroup): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

