package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportImageRequest extends StObject {
  
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.undefined
  
  /**
    * The client-specific data.
    */
  var ClientData: js.UndefOr[typings.awsSdk.ec2Mod.ClientData] = js.undefined
  
  /**
    * The token to enable idempotency for VM import requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description string for the import image task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the disk containers.
    */
  var DiskContainers: js.UndefOr[ImageDiskContainerList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the destination AMI of the imported image should be encrypted. The default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target hypervisor platform. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier for the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted AMI. This parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default CMK for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  The CMK identifier may be provided in any of the following formats:    Key ID   Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the key namespace, and then the CMK ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.    AWS parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.  The specified CMK must exist in the Region that the AMI is being copied to. Amazon EBS does not support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.undefined
  
  /**
    * The ARNs of the license configurations.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListRequest] = js.undefined
  
  /**
    * The license type to be used for the Amazon Machine Image (AMI) after importing. By default, we detect the source-system operating system (OS) and apply the appropriate license. Specify AWS to replace the source-system license with an AWS license, if appropriate. Specify BYOL to retain the source-system license, if appropriate. To use BYOL, you must have existing licenses with rights to use these licenses in a third party cloud, such as AWS. For more information, see Prerequisites in the VM Import/Export User Guide.
    */
  var LicenseType: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system of the virtual machine. Valid values: Windows | Linux 
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the role to use when not using the default role, 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the image being imported.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object ImportImageRequest {
  
  inline def apply(): ImportImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageRequest]
  }
  
  extension [Self <: ImportImageRequest](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setClientData(value: ClientData): Self = StObject.set(x, "ClientData", value.asInstanceOf[js.Any])
    
    inline def setClientDataUndefined: Self = StObject.set(x, "ClientData", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDiskContainers(value: ImageDiskContainerList): Self = StObject.set(x, "DiskContainers", value.asInstanceOf[js.Any])
    
    inline def setDiskContainersUndefined: Self = StObject.set(x, "DiskContainers", js.undefined)
    
    inline def setDiskContainersVarargs(value: ImageDiskContainer*): Self = StObject.set(x, "DiskContainers", js.Array(value :_*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setHypervisor(value: String): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseSpecifications(value: ImportImageLicenseSpecificationListRequest): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationRequest*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    inline def setLicenseType(value: String): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setRoleName(value: String): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
