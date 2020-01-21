package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceSharePermissionsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The permissions associated with the resource share.
    */
  var permissions: js.UndefOr[ResourceSharePermissionList] = js.native
}

object ListResourceSharePermissionsResponse {
  @scala.inline
  def apply(nextToken: String = null, permissions: ResourceSharePermissionList = null): ListResourceSharePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceSharePermissionsResponse]
  }
}

