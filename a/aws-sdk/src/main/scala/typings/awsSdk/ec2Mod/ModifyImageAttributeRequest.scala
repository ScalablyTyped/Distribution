package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute to modify. The valid values are description, launchPermission, and productCodes.
    */
  var Attribute: js.UndefOr[String] = js.native
  /**
    * A new description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
  /**
    * A new launch permission for the AMI.
    */
  var LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.native
  /**
    * The operation type. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.native
  /**
    * The DevPay product codes. After you add a product code to an AMI, it can't be removed.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.native
  /**
    * The user groups. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.native
  /**
    * The AWS account IDs. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
  /**
    * The value of the attribute being modified. This parameter can be used only when the Attribute parameter is description or productCodes.
    */
  var Value: js.UndefOr[String] = js.native
}

object ModifyImageAttributeRequest {
  @scala.inline
  def apply(ImageId: ImageId): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
  @scala.inline
  implicit class ModifyImageAttributeRequestOps[Self <: ModifyImageAttributeRequest] (val x: Self) extends AnyVal {
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
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribute(value: String): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    @scala.inline
    def setDescription(value: AttributeValue): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setLaunchPermission(value: LaunchPermissionModifications): Self = this.set("LaunchPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchPermission: Self = this.set("LaunchPermission", js.undefined)
    @scala.inline
    def setOperationType(value: OperationType): Self = this.set("OperationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("OperationType", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: String*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeStringList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    @scala.inline
    def setUserGroupsVarargs(value: String*): Self = this.set("UserGroups", js.Array(value :_*))
    @scala.inline
    def setUserGroups(value: UserGroupStringList): Self = this.set("UserGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserGroups: Self = this.set("UserGroups", js.undefined)
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("UserIds", js.Array(value :_*))
    @scala.inline
    def setUserIds(value: UserIdStringList): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

