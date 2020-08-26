package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResourceSharePermissionRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The ARN of the AWS RAM permission to associate with the resource share.
    */
  var permissionArn: String = js.native
  /**
    * Indicates whether the permission should replace the permissions that are currently associated with the resource share. Use true to replace the current permissions. Use false to add the permission to the current permission.
    */
  var replace: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String = js.native
}

object AssociateResourceSharePermissionRequest {
  @scala.inline
  def apply(permissionArn: String, resourceShareArn: String): AssociateResourceSharePermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceSharePermissionRequest]
  }
  @scala.inline
  implicit class AssociateResourceSharePermissionRequestOps[Self <: AssociateResourceSharePermissionRequest] (val x: Self) extends AnyVal {
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
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

