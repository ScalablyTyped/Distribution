package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2VolumeDetails extends js.Object {
  
  /**
    * The volume attachments.
    */
  var Attachments: js.UndefOr[AwsEc2VolumeAttachmentList] = js.native
  
  /**
    * Indicates when the volume was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.native
  
  /**
    * The snapshot from which the volume was created.
    */
  var SnapshotId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The volume state.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2VolumeDetails {
  
  @scala.inline
  def apply(): AwsEc2VolumeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VolumeDetails]
  }
  
  @scala.inline
  implicit class AwsEc2VolumeDetailsOps[Self <: AwsEc2VolumeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentsVarargs(value: AwsEc2VolumeAttachment*): Self = this.set("Attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: AwsEc2VolumeAttachmentList): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("Attachments", js.undefined)
    
    @scala.inline
    def setCreateTime(value: NonEmptyString): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: NonEmptyString): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
