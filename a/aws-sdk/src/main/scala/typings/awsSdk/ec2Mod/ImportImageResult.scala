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
  def apply(): ImportImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageResult]
  }
  @scala.inline
  implicit class ImportImageResultOps[Self <: ImportImageResult] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: String): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setHypervisor(value: String): Self = this.set("Hypervisor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHypervisor: Self = this.set("Hypervisor", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setImportTaskId(value: ImportImageTaskId): Self = this.set("ImportTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTaskId: Self = this.set("ImportTaskId", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationResponse*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    @scala.inline
    def setLicenseSpecifications(value: ImportImageLicenseSpecificationListResponse): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseSpecifications: Self = this.set("LicenseSpecifications", js.undefined)
    @scala.inline
    def setLicenseType(value: String): Self = this.set("LicenseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseType: Self = this.set("LicenseType", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setProgress(value: String): Self = this.set("Progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    @scala.inline
    def setSnapshotDetailsVarargs(value: SnapshotDetail*): Self = this.set("SnapshotDetails", js.Array(value :_*))
    @scala.inline
    def setSnapshotDetails(value: SnapshotDetailList): Self = this.set("SnapshotDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotDetails: Self = this.set("SnapshotDetails", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

