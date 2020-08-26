package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageRequest extends js.Object {
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.native
  /**
    * The client-specific data.
    */
  var ClientData: js.UndefOr[typings.awsSdk.ec2Mod.ClientData] = js.native
  /**
    * The token to enable idempotency for VM import requests.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * A description string for the import image task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the disk containers.
    */
  var DiskContainers: js.UndefOr[ImageDiskContainerList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the destination AMI of the imported image should be encrypted. The default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The target hypervisor platform. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.native
  /**
    * An identifier for the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted AMI. This parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default CMK for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  The CMK identifier may be provided in any of the following formats:    Key ID   Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the key namespace, and then the CMK ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.    AWS parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.  The specified CMK must exist in the Region that the AMI is being copied to. Amazon EBS does not support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The ARNs of the license configurations.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListRequest] = js.native
  /**
    * The license type to be used for the Amazon Machine Image (AMI) after importing. By default, we detect the source-system operating system (OS) and apply the appropriate license. Specify AWS to replace the source-system license with an AWS license, if appropriate. Specify BYOL to retain the source-system license, if appropriate. To use BYOL, you must have existing licenses with rights to use these licenses in a third party cloud, such as AWS. For more information, see Prerequisites in the VM Import/Export User Guide.
    */
  var LicenseType: js.UndefOr[String] = js.native
  /**
    * The operating system of the virtual machine. Valid values: Windows | Linux 
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The name of the role to use when not using the default role, 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * The tags to apply to the image being imported.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object ImportImageRequest {
  @scala.inline
  def apply(): ImportImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageRequest]
  }
  @scala.inline
  implicit class ImportImageRequestOps[Self <: ImportImageRequest] (val x: Self) extends AnyVal {
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
    def setClientData(value: ClientData): Self = this.set("ClientData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientData: Self = this.set("ClientData", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDiskContainersVarargs(value: ImageDiskContainer*): Self = this.set("DiskContainers", js.Array(value :_*))
    @scala.inline
    def setDiskContainers(value: ImageDiskContainerList): Self = this.set("DiskContainers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskContainers: Self = this.set("DiskContainers", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setHypervisor(value: String): Self = this.set("Hypervisor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHypervisor: Self = this.set("Hypervisor", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationRequest*): Self = this.set("LicenseSpecifications", js.Array(value :_*))
    @scala.inline
    def setLicenseSpecifications(value: ImportImageLicenseSpecificationListRequest): Self = this.set("LicenseSpecifications", value.asInstanceOf[js.Any])
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
    def setRoleName(value: String): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

