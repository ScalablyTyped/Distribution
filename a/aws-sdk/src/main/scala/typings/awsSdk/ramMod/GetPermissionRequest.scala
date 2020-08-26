package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionRequest extends js.Object {
  /**
    * The ARN of the permission.
    */
  var permissionArn: String = js.native
  /**
    * The identifier for the version of the permission.
    */
  var permissionVersion: js.UndefOr[Integer] = js.native
}

object GetPermissionRequest {
  @scala.inline
  def apply(permissionArn: String): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
  @scala.inline
  implicit class GetPermissionRequestOps[Self <: GetPermissionRequest] (val x: Self) extends AnyVal {
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
    def setPermissionArn(value: String): Self = this.set("permissionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionVersion(value: Integer): Self = this.set("permissionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionVersion: Self = this.set("permissionVersion", js.undefined)
  }
  
}

