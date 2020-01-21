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
  def apply(permissionArn: String, permissionVersion: Int | Double = null): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    if (permissionVersion != null) __obj.updateDynamic("permissionVersion")(permissionVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
}

