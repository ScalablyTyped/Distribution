package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveResourcePermissionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The principal ID of the resource.
    */
  var PrincipalId: IdType = js.native
  /**
    * The principal type of the resource.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.workdocsMod.PrincipalType] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object RemoveResourcePermissionRequest {
  @scala.inline
  def apply(
    PrincipalId: IdType,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    PrincipalType: PrincipalType = null
  ): RemoveResourcePermissionRequest = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResourcePermissionRequest]
  }
}

