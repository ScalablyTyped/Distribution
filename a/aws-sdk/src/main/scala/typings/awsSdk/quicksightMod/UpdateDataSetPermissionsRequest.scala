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
  def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId): UpdateDataSetPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetPermissionsRequest]
  }
  @scala.inline
  implicit class UpdateDataSetPermissionsRequestOps[Self <: UpdateDataSetPermissionsRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantPermissionsVarargs(value: ResourcePermission*): Self = this.set("GrantPermissions", js.Array(value :_*))
    @scala.inline
    def setGrantPermissions(value: ResourcePermissionList): Self = this.set("GrantPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantPermissions: Self = this.set("GrantPermissions", js.undefined)
    @scala.inline
    def setRevokePermissionsVarargs(value: ResourcePermission*): Self = this.set("RevokePermissions", js.Array(value :_*))
    @scala.inline
    def setRevokePermissions(value: ResourcePermissionList): Self = this.set("RevokePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevokePermissions: Self = this.set("RevokePermissions", js.undefined)
  }
  
}

