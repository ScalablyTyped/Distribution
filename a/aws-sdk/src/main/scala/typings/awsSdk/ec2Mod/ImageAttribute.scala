package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageAttribute extends js.Object {
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * A description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  /**
    * The launch permissions.
    */
  var LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.native
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
}

object ImageAttribute {
  @scala.inline
  def apply(
    BlockDeviceMappings: BlockDeviceMappingList = null,
    Description: AttributeValue = null,
    ImageId: String = null,
    KernelId: AttributeValue = null,
    LaunchPermissions: LaunchPermissionList = null,
    ProductCodes: ProductCodeList = null,
    RamdiskId: AttributeValue = null,
    SriovNetSupport: AttributeValue = null
  ): ImageAttribute = {
    val __obj = js.Dynamic.literal()
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (LaunchPermissions != null) __obj.updateDynamic("LaunchPermissions")(LaunchPermissions.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAttribute]
  }
}

