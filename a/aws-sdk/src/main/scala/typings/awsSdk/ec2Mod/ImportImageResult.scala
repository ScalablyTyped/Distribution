package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageResult extends js.Object {
  /**
    * The architecture of the virtual machine.
    */
  var Architecture: js.UndefOr[String] = js.native
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the AMI is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The target hypervisor of the import task.
    */
  var Hypervisor: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) created by the import task.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The task ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[ImportImageTaskId] = js.native
  /**
    * The identifier for the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted AMI.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The ARNs of the license configurations.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.native
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.native
  /**
    * The operating system of the virtual machine.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The progress of the task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.native
  /**
    * A brief status of the task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * A detailed status message of the import task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the image being imported.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportImageResult {
  @scala.inline
  def apply(
    Architecture: String = null,
    Description: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Hypervisor: String = null,
    ImageId: String = null,
    ImportTaskId: ImportImageTaskId = null,
    KmsKeyId: KmsKeyId = null,
    LicenseSpecifications: ImportImageLicenseSpecificationListResponse = null,
    LicenseType: String = null,
    Platform: String = null,
    Progress: String = null,
    SnapshotDetails: SnapshotDetailList = null,
    Status: String = null,
    StatusMessage: String = null,
    Tags: TagList = null
  ): ImportImageResult = {
    val __obj = js.Dynamic.literal()
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.get.asInstanceOf[js.Any])
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LicenseSpecifications != null) __obj.updateDynamic("LicenseSpecifications")(LicenseSpecifications.asInstanceOf[js.Any])
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (SnapshotDetails != null) __obj.updateDynamic("SnapshotDetails")(SnapshotDetails.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportImageResult]
  }
}

