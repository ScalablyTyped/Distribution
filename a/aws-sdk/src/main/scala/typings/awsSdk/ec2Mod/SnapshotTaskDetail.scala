package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotTaskDetail extends StObject {
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the disk in the snapshot, in GiB.
    */
  var DiskImageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The format of the disk image from which the snapshot is created.
    */
  var Format: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The percentage of completion for the import snapshot task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  
  /**
    * The snapshot ID of the disk being imported.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * A brief status for the import snapshot task.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A detailed status message for the import snapshot task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the disk image from which the snapshot is created.
    */
  var Url: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucketDetails] = js.undefined
}
object SnapshotTaskDetail {
  
  @scala.inline
  def apply(): SnapshotTaskDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotTaskDetail]
  }
  
  @scala.inline
  implicit class SnapshotTaskDetailMutableBuilder[Self <: SnapshotTaskDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDiskImageSize(value: Double): Self = StObject.set(x, "DiskImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskImageSizeUndefined: Self = StObject.set(x, "DiskImageSize", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUserBucket(value: UserBucketDetails): Self = StObject.set(x, "UserBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserBucketUndefined: Self = StObject.set(x, "UserBucket", js.undefined)
  }
}
