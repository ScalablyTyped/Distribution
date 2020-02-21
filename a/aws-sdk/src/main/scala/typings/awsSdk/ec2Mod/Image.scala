package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The architecture of the image.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * Any block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  /**
    * The date and time the image was created.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The description of the AMI that was provided during image creation.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  /**
    * The hypervisor type of the image.
    */
  var Hypervisor: js.UndefOr[HypervisorType] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The location of the AMI.
    */
  var ImageLocation: js.UndefOr[String] = js.native
  /**
    * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
    */
  var ImageOwnerAlias: js.UndefOr[String] = js.native
  /**
    * The type of image.
    */
  var ImageType: js.UndefOr[ImageTypeValues] = js.native
  /**
    * The kernel associated with the image, if any. Only applicable for machine images.
    */
  var KernelId: js.UndefOr[String] = js.native
  /**
    * The name of the AMI that was provided during image creation.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the image owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * This value is set to windows for Windows AMIs; otherwise, it is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
  /**
    * The platform details associated with the billing code of the AMI. For more information, see Obtaining Billing Information in the Amazon Elastic Compute Cloud User Guide.
    */
  var PlatformDetails: js.UndefOr[String] = js.native
  /**
    * Any product codes associated with the AMI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * Indicates whether the image has public launch permissions. The value is true if this image has public launch permissions or false if it has only implicit and explicit launch permissions.
    */
  var Public: js.UndefOr[Boolean] = js.native
  /**
    * The RAM disk associated with the image, if any. Only applicable for machine images.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  /**
    * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
    */
  var RootDeviceType: js.UndefOr[DeviceType] = js.native
  /**
    * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  /**
    * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
    */
  var State: js.UndefOr[ImageState] = js.native
  /**
    * The reason for the state change.
    */
  var StateReason: js.UndefOr[typings.awsSdk.ec2Mod.StateReason] = js.native
  /**
    * Any tags assigned to the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI. usageOperation corresponds to the lineitem/Operation column on your AWS Cost and Usage Report and in the AWS Price List API. For the list of UsageOperation codes, see Platform Details and Usage Operation Billing Codes in the Amazon Elastic Compute Cloud User Guide.
    */
  var UsageOperation: js.UndefOr[String] = js.native
  /**
    * The type of virtualization of the AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.ec2Mod.VirtualizationType] = js.native
}

object Image {
  @scala.inline
  def apply(
    Architecture: ArchitectureValues = null,
    BlockDeviceMappings: BlockDeviceMappingList = null,
    CreationDate: String = null,
    Description: String = null,
    EnaSupport: js.UndefOr[scala.Boolean] = js.undefined,
    Hypervisor: HypervisorType = null,
    ImageId: String = null,
    ImageLocation: String = null,
    ImageOwnerAlias: String = null,
    ImageType: ImageTypeValues = null,
    KernelId: String = null,
    Name: String = null,
    OwnerId: String = null,
    Platform: PlatformValues = null,
    PlatformDetails: String = null,
    ProductCodes: ProductCodeList = null,
    Public: js.UndefOr[scala.Boolean] = js.undefined,
    RamdiskId: String = null,
    RootDeviceName: String = null,
    RootDeviceType: DeviceType = null,
    SriovNetSupport: String = null,
    State: ImageState = null,
    StateReason: StateReason = null,
    Tags: TagList = null,
    UsageOperation: String = null,
    VirtualizationType: VirtualizationType = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(EnaSupport)) __obj.updateDynamic("EnaSupport")(EnaSupport.asInstanceOf[js.Any])
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (ImageLocation != null) __obj.updateDynamic("ImageLocation")(ImageLocation.asInstanceOf[js.Any])
    if (ImageOwnerAlias != null) __obj.updateDynamic("ImageOwnerAlias")(ImageOwnerAlias.asInstanceOf[js.Any])
    if (ImageType != null) __obj.updateDynamic("ImageType")(ImageType.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PlatformDetails != null) __obj.updateDynamic("PlatformDetails")(PlatformDetails.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (!js.isUndefined(Public)) __obj.updateDynamic("Public")(Public.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName.asInstanceOf[js.Any])
    if (RootDeviceType != null) __obj.updateDynamic("RootDeviceType")(RootDeviceType.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UsageOperation != null) __obj.updateDynamic("UsageOperation")(UsageOperation.asInstanceOf[js.Any])
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

