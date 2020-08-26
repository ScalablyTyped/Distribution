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
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): UpdateTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplatePermissionsRequest]
  }
  @scala.inline
  implicit class UpdateTemplatePermissionsRequestOps[Self <: UpdateTemplatePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantPermissionsVarargs(value: ResourcePermission*): Self = this.set("GrantPermissions", js.Array(value :_*))
    @scala.inline
    def setGrantPermissions(value: UpdateResourcePermissionList): Self = this.set("GrantPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantPermissions: Self = this.set("GrantPermissions", js.undefined)
    @scala.inline
    def setRevokePermissionsVarargs(value: ResourcePermission*): Self = this.set("RevokePermissions", js.Array(value :_*))
    @scala.inline
    def setRevokePermissions(value: UpdateResourcePermissionList): Self = this.set("RevokePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevokePermissions: Self = this.set("RevokePermissions", js.undefined)
  }
  
}

