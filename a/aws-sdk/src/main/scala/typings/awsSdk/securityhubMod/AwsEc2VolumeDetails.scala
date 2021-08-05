package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VolumeDetails extends StObject {
  
  /**
    * The volume attachments.
    */
  var Attachments: js.UndefOr[AwsEc2VolumeAttachmentList] = js.undefined
  
  /**
    * Indicates when the volume was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot from which the volume was created.
    */
  var SnapshotId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The volume state.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VolumeDetails {
  
  inline def apply(): AwsEc2VolumeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeDetails]
  }
  
  extension [Self <: AwsEc2VolumeDetails](x: Self) {
    
    inline def setAttachments(value: AwsEc2VolumeAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AwsEc2VolumeAttachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    inline def setCreateTime(value: NonEmptyString): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
