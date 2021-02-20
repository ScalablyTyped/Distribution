package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3CopyObjectOperation extends StObject {
  
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
    * The legal hold status to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.native
  
  /**
    * The retention mode to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.native
  
  /**
    * The date when the applied object retention configuration expires on all objects in the Batch Operations job.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.native
  
  /**
    * Specifies an optional metadata property for website redirects, x-amz-website-redirect-location. Allows webpage redirects if the object is accessed through a website endpoint.
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
    * Specifies the folder prefix into which you would like the objects to be copied. For example, to copy objects into a folder named "Folder1" in the destination bucket, set the TargetKeyPrefix to "Folder1/".
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * Specifies the destination bucket ARN for the batch copy operation. For example, to copy objects to a bucket named "destinationBucket", set the TargetResource to "arn:aws:s3:::destinationBucket".
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
  implicit class S3CopyObjectOperationMutableBuilder[Self <: S3CopyObjectOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlGrants(value: S3GrantList): Self = StObject.set(x, "AccessControlGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlGrantsUndefined: Self = StObject.set(x, "AccessControlGrants", js.undefined)
    
    @scala.inline
    def setAccessControlGrantsVarargs(value: S3Grant*): Self = StObject.set(x, "AccessControlGrants", js.Array(value :_*))
    
    @scala.inline
    def setCannedAccessControlList(value: S3CannedAccessControlList): Self = StObject.set(x, "CannedAccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedAccessControlListUndefined: Self = StObject.set(x, "CannedAccessControlList", js.undefined)
    
    @scala.inline
    def setMetadataDirective(value: S3MetadataDirective): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
    
    @scala.inline
    def setModifiedSinceConstraint(value: TimeStamp): Self = StObject.set(x, "ModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedSinceConstraintUndefined: Self = StObject.set(x, "ModifiedSinceConstraint", js.undefined)
    
    @scala.inline
    def setNewObjectMetadata(value: S3ObjectMetadata): Self = StObject.set(x, "NewObjectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectMetadataUndefined: Self = StObject.set(x, "NewObjectMetadata", js.undefined)
    
    @scala.inline
    def setNewObjectTagging(value: S3TagSet): Self = StObject.set(x, "NewObjectTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectTaggingUndefined: Self = StObject.set(x, "NewObjectTagging", js.undefined)
    
    @scala.inline
    def setNewObjectTaggingVarargs(value: S3Tag*): Self = StObject.set(x, "NewObjectTagging", js.Array(value :_*))
    
    @scala.inline
    def setObjectLockLegalHoldStatus(value: S3ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    @scala.inline
    def setObjectLockMode(value: S3ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    @scala.inline
    def setObjectLockRetainUntilDate(value: TimeStamp): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    @scala.inline
    def setRedirectLocation(value: NonEmptyMaxLength2048String): Self = StObject.set(x, "RedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectLocationUndefined: Self = StObject.set(x, "RedirectLocation", js.undefined)
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    @scala.inline
    def setSSEAwsKmsKeyId(value: KmsKeyArnString): Self = StObject.set(x, "SSEAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEAwsKmsKeyIdUndefined: Self = StObject.set(x, "SSEAwsKmsKeyId", js.undefined)
    
    @scala.inline
    def setStorageClass(value: S3StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setTargetKeyPrefix(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "TargetKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyPrefixUndefined: Self = StObject.set(x, "TargetKeyPrefix", js.undefined)
    
    @scala.inline
    def setTargetResource(value: S3BucketArnString): Self = StObject.set(x, "TargetResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceUndefined: Self = StObject.set(x, "TargetResource", js.undefined)
    
    @scala.inline
    def setUnModifiedSinceConstraint(value: TimeStamp): Self = StObject.set(x, "UnModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnModifiedSinceConstraintUndefined: Self = StObject.set(x, "UnModifiedSinceConstraint", js.undefined)
  }
}
