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
  def apply(
    ImageId: ImageId,
    Attribute: String = null,
    Description: AttributeValue = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchPermission: LaunchPermissionModifications = null,
    OperationType: OperationType = null,
    ProductCodes: ProductCodeStringList = null,
    UserGroups: UserGroupStringList = null,
    UserIds: UserIdStringList = null,
    Value: String = null
  ): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LaunchPermission != null) __obj.updateDynamic("LaunchPermission")(LaunchPermission.asInstanceOf[js.Any])
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (UserGroups != null) __obj.updateDynamic("UserGroups")(UserGroups.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
}

