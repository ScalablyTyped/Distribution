package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplatePermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * A list of resource permissions to be granted on the template. 
    */
  var GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * A list of resource permissions to be revoked from the template. 
    */
  var RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
}

object UpdateTemplatePermissionsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    GrantPermissions: UpdateResourcePermissionList = null,
    RevokePermissions: UpdateResourcePermissionList = null
  ): UpdateTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (GrantPermissions != null) __obj.updateDynamic("GrantPermissions")(GrantPermissions.asInstanceOf[js.Any])
    if (RevokePermissions != null) __obj.updateDynamic("RevokePermissions")(RevokePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplatePermissionsRequest]
  }
}

