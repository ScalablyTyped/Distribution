package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyFpgaImageAttributeRequest extends js.Object {
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[FpgaImageAttributeName] = js.native
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
  /**
    * The load permission for the AFI.
    */
  var LoadPermission: js.UndefOr[LoadPermissionModifications] = js.native
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The operation type.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.native
  /**
    * The product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid only when modifying the productCodes attribute.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.native
  /**
    * The user groups. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.native
  /**
    * The AWS account IDs. This parameter is valid only when modifying the loadPermission attribute.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}

object ModifyFpgaImageAttributeRequest {
  @scala.inline
  def apply(
    FpgaImageId: FpgaImageId,
    Attribute: FpgaImageAttributeName = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LoadPermission: LoadPermissionModifications = null,
    Name: String = null,
    OperationType: OperationType = null,
    ProductCodes: ProductCodeStringList = null,
    UserGroups: UserGroupStringList = null,
    UserIds: UserIdStringList = null
  ): ModifyFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LoadPermission != null) __obj.updateDynamic("LoadPermission")(LoadPermission.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (UserGroups != null) __obj.updateDynamic("UserGroups")(UserGroups.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFpgaImageAttributeRequest]
  }
}

