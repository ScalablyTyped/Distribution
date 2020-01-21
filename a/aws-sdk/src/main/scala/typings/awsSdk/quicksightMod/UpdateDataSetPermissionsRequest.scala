package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetPermissionsRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dataset whose permissions you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * The resource permissions that you want to grant to the dataset.
    */
  var GrantPermissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The resource permissions that you want to revoke from the dataset.
    */
  var RevokePermissions: js.UndefOr[ResourcePermissionList] = js.native
}

object UpdateDataSetPermissionsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    GrantPermissions: ResourcePermissionList = null,
    RevokePermissions: ResourcePermissionList = null
  ): UpdateDataSetPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    if (GrantPermissions != null) __obj.updateDynamic("GrantPermissions")(GrantPermissions.asInstanceOf[js.Any])
    if (RevokePermissions != null) __obj.updateDynamic("RevokePermissions")(RevokePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetPermissionsRequest]
  }
}

