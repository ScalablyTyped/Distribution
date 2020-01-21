package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionResponse extends js.Object {
  /**
    * Information about the permission.
    */
  var permission: js.UndefOr[ResourceSharePermissionDetail] = js.native
}

object GetPermissionResponse {
  @scala.inline
  def apply(permission: ResourceSharePermissionDetail = null): GetPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionResponse]
  }
}

