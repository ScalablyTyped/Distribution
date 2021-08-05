package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CopyObjectOperation extends StObject {
  
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.undefined
  
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
  
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.undefined
  
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * 
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.undefined
  
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.undefined
  
  /**
    * The legal hold status to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The retention mode to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.undefined
  
  /**
    * The date when the applied object retention configuration expires on all objects in the Batch Operations job.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * Specifies an optional metadata property for website redirects, x-amz-website-redirect-location. Allows webpage redirects if the object is accessed through a website endpoint.
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.undefined
  
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.undefined
  
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.undefined
  
  /**
    * Specifies the folder prefix into which you would like the objects to be copied. For example, to copy objects into a folder named "Folder1" in the destination bucket, set the TargetKeyPrefix to "Folder1/".
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * Specifies the destination bucket ARN for the batch copy operation. For example, to copy objects to a bucket named "destinationBucket", set the TargetResource to "arn:aws:s3:::destinationBucket".
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.undefined
  
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
}
object S3CopyObjectOperation {
  
  inline def apply(): S3CopyObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
  
  extension [Self <: S3CopyObjectOperation](x: Self) {
    
    inline def setAccessControlGrants(value: S3GrantList): Self = StObject.set(x, "AccessControlGrants", value.asInstanceOf[js.Any])
    
    inline def setAccessControlGrantsUndefined: Self = StObject.set(x, "AccessControlGrants", js.undefined)
    
    inline def setAccessControlGrantsVarargs(value: S3Grant*): Self = StObject.set(x, "AccessControlGrants", js.Array(value :_*))
    
    inline def setCannedAccessControlList(value: S3CannedAccessControlList): Self = StObject.set(x, "CannedAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setCannedAccessControlListUndefined: Self = StObject.set(x, "CannedAccessControlList", js.undefined)
    
    inline def setMetadataDirective(value: S3MetadataDirective): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
    
    inline def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
    
    inline def setModifiedSinceConstraint(value: TimeStamp): Self = StObject.set(x, "ModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    inline def setModifiedSinceConstraintUndefined: Self = StObject.set(x, "ModifiedSinceConstraint", js.undefined)
    
    inline def setNewObjectMetadata(value: S3ObjectMetadata): Self = StObject.set(x, "NewObjectMetadata", value.asInstanceOf[js.Any])
    
    inline def setNewObjectMetadataUndefined: Self = StObject.set(x, "NewObjectMetadata", js.undefined)
    
    inline def setNewObjectTagging(value: S3TagSet): Self = StObject.set(x, "NewObjectTagging", value.asInstanceOf[js.Any])
    
    inline def setNewObjectTaggingUndefined: Self = StObject.set(x, "NewObjectTagging", js.undefined)
    
    inline def setNewObjectTaggingVarargs(value: S3Tag*): Self = StObject.set(x, "NewObjectTagging", js.Array(value :_*))
    
    inline def setObjectLockLegalHoldStatus(value: S3ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: S3ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: TimeStamp): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setRedirectLocation(value: NonEmptyMaxLength2048String): Self = StObject.set(x, "RedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setRedirectLocationUndefined: Self = StObject.set(x, "RedirectLocation", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    inline def setSSEAwsKmsKeyId(value: KmsKeyArnString): Self = StObject.set(x, "SSEAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEAwsKmsKeyIdUndefined: Self = StObject.set(x, "SSEAwsKmsKeyId", js.undefined)
    
    inline def setStorageClass(value: S3StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTargetKeyPrefix(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "TargetKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyPrefixUndefined: Self = StObject.set(x, "TargetKeyPrefix", js.undefined)
    
    inline def setTargetResource(value: S3BucketArnString): Self = StObject.set(x, "TargetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "TargetResource", js.undefined)
    
    inline def setUnModifiedSinceConstraint(value: TimeStamp): Self = StObject.set(x, "UnModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    inline def setUnModifiedSinceConstraintUndefined: Self = StObject.set(x, "UnModifiedSinceConstraint", js.undefined)
  }
}
