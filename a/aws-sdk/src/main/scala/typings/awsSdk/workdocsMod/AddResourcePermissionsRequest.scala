package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[typings.awsSdk.workdocsMod.NotificationOptions] = js.native
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object AddResourcePermissionsRequest {
  @scala.inline
  def apply(
    Principals: SharePrincipalList,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    NotificationOptions: NotificationOptions = null
  ): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (NotificationOptions != null) __obj.updateDynamic("NotificationOptions")(NotificationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
}

