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
  def apply(
    permissionArn: String,
    resourceShareArn: String,
    clientToken: String = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): AssociateResourceSharePermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceSharePermissionRequest]
  }
}

