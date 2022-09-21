package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketMetadata extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account that owns the bucket.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the bucket policy for the bucket requires server-side encryption of objects when objects are uploaded to the bucket. Possible values are: FALSE - The bucket policy requires server-side encryption of new objects. PutObject requests must include the x-amz-server-side-encryption header and the value for that header must be AES256 or aws:kms. TRUE - The bucket doesn't have a bucket policy or it has a bucket policy that doesn't require server-side encryption of new objects. If a bucket policy exists, it doesn't require PutObject requests to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256 or aws:kms. UNKNOWN - Amazon Macie can't determine whether the bucket policy requires server-side encryption of new objects.
    */
  var allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var bucketArn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var bucketCreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var bucketName: js.UndefOr[string] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a supported storage class and have a file name extension for a supported file or storage format. If versioning is enabled for the bucket, Macie calculates this value based on the size of the latest version of each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each applicable object in the bucket.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * Specifies the error code for an error that prevented Amazon Macie from retrieving and processing information about the bucket and the bucket's objects. If this value is ACCESS_DENIED, Macie doesn't have permission to retrieve the information. For example, the bucket has a restrictive bucket policy and Amazon S3 denied the request. If this value is null, Macie was able to retrieve and process the information.
    */
  var errorCode: js.UndefOr[BucketMetadataErrorCode] = js.undefined
  
  /**
    * A brief description of the error (errorCode) that prevented Amazon Macie from retrieving and processing information about the bucket and the bucket's objects. This value is null if Macie was able to retrieve and process the information.
    */
  var errorMessage: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket, and, if so, the details of the job that ran most recently.
    */
  var jobDetails: js.UndefOr[JobDetails] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved both bucket and object metadata from Amazon S3 for the bucket.
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total number of objects in the bucket.
    */
  var objectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
    */
  var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined
  
  /**
    * Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to the bucket, and provides information about those settings.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined
  
  /**
    * The Amazon Web Services Region that hosts the bucket.
    */
  var region: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to buckets for other Amazon Web Services accounts and, if so, which accounts.
    */
  var replicationDetails: js.UndefOr[ReplicationDetails] = js.undefined
  
  /**
    * Specifies whether the bucket encrypts new objects by default and, if so, the type of server-side encryption that's used.
    */
  var serverSideEncryption: js.UndefOr[BucketServerSideEncryption] = js.undefined
  
  /**
    *  Specifies whether the bucket is shared with another Amazon Web Services account. Possible values are: EXTERNAL - The bucket is shared with an Amazon Web Services account that isn't part of the same Amazon Macie organization. INTERNAL - The bucket is shared with an Amazon Web Services account that's part of the same Amazon Macie organization. NOT_SHARED - The bucket isn't shared with other Amazon Web Services accounts. UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
    */
  var sharedAccess: js.UndefOr[SharedAccess] = js.undefined
  
  /**
    * The total storage size, in bytes, of the bucket. If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object in the bucket.
    */
  var sizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket. If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest version of each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each applicable object in the bucket.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.undefined
  
  /**
    * An array that specifies the tags (keys and values) that are associated with the bucket.
    */
  var tags: js.UndefOr[listOfKeyValuePair] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
  
  /**
    * Specifies whether versioning is enabled for the bucket.
    */
  var versioning: js.UndefOr[boolean] = js.undefined
}
object BucketMetadata {
  
  inline def apply(): BucketMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketMetadata]
  }
  
  extension [Self <: BucketMetadata](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAllowsUnencryptedObjectUploads(value: AllowsUnencryptedObjectUploads): Self = StObject.set(x, "allowsUnencryptedObjectUploads", value.asInstanceOf[js.Any])
    
    inline def setAllowsUnencryptedObjectUploadsUndefined: Self = StObject.set(x, "allowsUnencryptedObjectUploads", js.undefined)
    
    inline def setBucketArn(value: string): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setBucketArnUndefined: Self = StObject.set(x, "bucketArn", js.undefined)
    
    inline def setBucketCreatedAt(value: js.Date): Self = StObject.set(x, "bucketCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setBucketCreatedAtUndefined: Self = StObject.set(x, "bucketCreatedAt", js.undefined)
    
    inline def setBucketName(value: string): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setClassifiableObjectCount(value: long): Self = StObject.set(x, "classifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setClassifiableObjectCountUndefined: Self = StObject.set(x, "classifiableObjectCount", js.undefined)
    
    inline def setClassifiableSizeInBytes(value: long): Self = StObject.set(x, "classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setClassifiableSizeInBytesUndefined: Self = StObject.set(x, "classifiableSizeInBytes", js.undefined)
    
    inline def setErrorCode(value: BucketMetadataErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: string): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setJobDetails(value: JobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
    
    inline def setJobDetailsUndefined: Self = StObject.set(x, "jobDetails", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setObjectCount(value: long): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
    
    inline def setObjectCountByEncryptionType(value: ObjectCountByEncryptionType): Self = StObject.set(x, "objectCountByEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setObjectCountByEncryptionTypeUndefined: Self = StObject.set(x, "objectCountByEncryptionType", js.undefined)
    
    inline def setObjectCountUndefined: Self = StObject.set(x, "objectCount", js.undefined)
    
    inline def setPublicAccess(value: BucketPublicAccess): Self = StObject.set(x, "publicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessUndefined: Self = StObject.set(x, "publicAccess", js.undefined)
    
    inline def setRegion(value: string): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReplicationDetails(value: ReplicationDetails): Self = StObject.set(x, "replicationDetails", value.asInstanceOf[js.Any])
    
    inline def setReplicationDetailsUndefined: Self = StObject.set(x, "replicationDetails", js.undefined)
    
    inline def setServerSideEncryption(value: BucketServerSideEncryption): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    
    inline def setSharedAccess(value: SharedAccess): Self = StObject.set(x, "sharedAccess", value.asInstanceOf[js.Any])
    
    inline def setSharedAccessUndefined: Self = StObject.set(x, "sharedAccess", js.undefined)
    
    inline def setSizeInBytes(value: long): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressed(value: long): Self = StObject.set(x, "sizeInBytesCompressed", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressedUndefined: Self = StObject.set(x, "sizeInBytesCompressed", js.undefined)
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setTags(value: listOfKeyValuePair): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: KeyValuePair*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUnclassifiableObjectCount(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectCountUndefined: Self = StObject.set(x, "unclassifiableObjectCount", js.undefined)
    
    inline def setUnclassifiableObjectSizeInBytes(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectSizeInBytesUndefined: Self = StObject.set(x, "unclassifiableObjectSizeInBytes", js.undefined)
    
    inline def setVersioning(value: boolean): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
  }
}
