package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3CopyObjectOperation extends js.Object {
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.native
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.native
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.native
  /**
    * 
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.native
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.native
  /**
    * The Legal Hold status to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.native
  /**
    * The Retention mode to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.native
  /**
    * The date when the applied Object Retention configuration will expire on all objects in the Batch Operations job.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.native
  /**
    * 
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.native
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.native
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.native
  /**
    * 
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.native
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.native
}

object S3CopyObjectOperation {
  @scala.inline
  def apply(): S3CopyObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
  @scala.inline
  implicit class S3CopyObjectOperationOps[Self <: S3CopyObjectOperation] (val x: Self) extends AnyVal {
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
    def setAccessControlGrantsVarargs(value: S3Grant*): Self = this.set("AccessControlGrants", js.Array(value :_*))
    @scala.inline
    def setAccessControlGrants(value: S3GrantList): Self = this.set("AccessControlGrants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlGrants: Self = this.set("AccessControlGrants", js.undefined)
    @scala.inline
    def setCannedAccessControlList(value: S3CannedAccessControlList): Self = this.set("CannedAccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedAccessControlList: Self = this.set("CannedAccessControlList", js.undefined)
    @scala.inline
    def setMetadataDirective(value: S3MetadataDirective): Self = this.set("MetadataDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataDirective: Self = this.set("MetadataDirective", js.undefined)
    @scala.inline
    def setModifiedSinceConstraint(value: TimeStamp): Self = this.set("ModifiedSinceConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedSinceConstraint: Self = this.set("ModifiedSinceConstraint", js.undefined)
    @scala.inline
    def setNewObjectMetadata(value: S3ObjectMetadata): Self = this.set("NewObjectMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewObjectMetadata: Self = this.set("NewObjectMetadata", js.undefined)
    @scala.inline
    def setNewObjectTaggingVarargs(value: S3Tag*): Self = this.set("NewObjectTagging", js.Array(value :_*))
    @scala.inline
    def setNewObjectTagging(value: S3TagSet): Self = this.set("NewObjectTagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewObjectTagging: Self = this.set("NewObjectTagging", js.undefined)
    @scala.inline
    def setObjectLockLegalHoldStatus(value: S3ObjectLockLegalHoldStatus): Self = this.set("ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockLegalHoldStatus: Self = this.set("ObjectLockLegalHoldStatus", js.undefined)
    @scala.inline
    def setObjectLockMode(value: S3ObjectLockMode): Self = this.set("ObjectLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockMode: Self = this.set("ObjectLockMode", js.undefined)
    @scala.inline
    def setObjectLockRetainUntilDate(value: TimeStamp): Self = this.set("ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockRetainUntilDate: Self = this.set("ObjectLockRetainUntilDate", js.undefined)
    @scala.inline
    def setRedirectLocation(value: NonEmptyMaxLength2048String): Self = this.set("RedirectLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectLocation: Self = this.set("RedirectLocation", js.undefined)
    @scala.inline
    def setRequesterPays(value: Boolean): Self = this.set("RequesterPays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPays: Self = this.set("RequesterPays", js.undefined)
    @scala.inline
    def setSSEAwsKmsKeyId(value: KmsKeyArnString): Self = this.set("SSEAwsKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEAwsKmsKeyId: Self = this.set("SSEAwsKmsKeyId", js.undefined)
    @scala.inline
    def setStorageClass(value: S3StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setTargetKeyPrefix(value: NonEmptyMaxLength1024String): Self = this.set("TargetKeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetKeyPrefix: Self = this.set("TargetKeyPrefix", js.undefined)
    @scala.inline
    def setTargetResource(value: S3BucketArnString): Self = this.set("TargetResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResource: Self = this.set("TargetResource", js.undefined)
    @scala.inline
    def setUnModifiedSinceConstraint(value: TimeStamp): Self = this.set("UnModifiedSinceConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnModifiedSinceConstraint: Self = this.set("UnModifiedSinceConstraint", js.undefined)
  }
  
}

