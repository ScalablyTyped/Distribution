package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportImageResult extends StObject {
  
  /**
    * The architecture of the virtual machine.
    */
  var Architecture: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the AMI is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target hypervisor of the import task.
    */
  var Hypervisor: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Machine Image (AMI) created by the import task.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The task ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[ImportImageTaskId] = js.undefined
  
  /**
    * The identifier for the symmetric KMS key that was used to create the encrypted AMI.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.undefined
  
  /**
    * The ARNs of the license configurations.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.undefined
  
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system of the virtual machine.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The progress of the task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined
  
  /**
    * A brief status of the task.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A detailed status message of the import task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the import image task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The usage operation value.
    */
  var UsageOperation: js.UndefOr[String] = js.undefined
}
object ImportImageResult {
  
  inline def apply(): ImportImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageResult]
  }
  
  extension [Self <: ImportImageResult](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setHypervisor(value: String): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImportTaskId(value: ImportImageTaskId): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseSpecifications(value: ImportImageLicenseSpecificationListResponse): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    inline def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationResponse*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value*))
    
    inline def setLicenseType(value: String): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setSnapshotDetails(value: SnapshotDetailList): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
    
    inline def setSnapshotDetailsUndefined: Self = StObject.set(x, "SnapshotDetails", js.undefined)
    
    inline def setSnapshotDetailsVarargs(value: SnapshotDetail*): Self = StObject.set(x, "SnapshotDetails", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUsageOperation(value: String): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    inline def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
  }
}
