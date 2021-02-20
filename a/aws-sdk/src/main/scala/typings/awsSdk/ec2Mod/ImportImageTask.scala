package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportImageTask extends StObject {
  
  /**
    * The architecture of the virtual machine. Valid values: i386 | x86_64 | arm64 
    */
  var Architecture: js.UndefOr[String] = js.native
  
  /**
    * A description of the import task.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the image is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The target hypervisor for the import task. Valid values: xen 
    */
  var Hypervisor: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the import image task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted image.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The ARNs of the license configurations that are associated with the import image task.
    */
  var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse] = js.native
  
  /**
    * The license type of the virtual machine.
    */
  var LicenseType: js.UndefOr[String] = js.native
  
  /**
    * The description string for the import image task.
    */
  var Platform: js.UndefOr[String] = js.native
  
  /**
    * The percentage of progress of the import image task.
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * Information about the snapshots.
    */
  var SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.native
  
  /**
    * A brief status for the import image task.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * A descriptive status message for the import image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The tags for the import image task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ImportImageTask {
  
  @scala.inline
  def apply(): ImportImageTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageTask]
  }
  
  @scala.inline
  implicit class ImportImageTaskMutableBuilder[Self <: ImportImageTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setHypervisor(value: String): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseSpecifications(value: ImportImageLicenseSpecificationListResponse): Self = StObject.set(x, "LicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseSpecificationsUndefined: Self = StObject.set(x, "LicenseSpecifications", js.undefined)
    
    @scala.inline
    def setLicenseSpecificationsVarargs(value: ImportImageLicenseConfigurationResponse*): Self = StObject.set(x, "LicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setLicenseType(value: String): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setSnapshotDetails(value: SnapshotDetailList): Self = StObject.set(x, "SnapshotDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDetailsUndefined: Self = StObject.set(x, "SnapshotDetails", js.undefined)
    
    @scala.inline
    def setSnapshotDetailsVarargs(value: SnapshotDetail*): Self = StObject.set(x, "SnapshotDetails", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
