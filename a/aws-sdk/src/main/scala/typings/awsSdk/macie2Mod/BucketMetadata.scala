package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketMetadata extends StObject {
  
  /**
    * The unique identifier for the AWS account that owns the bucket.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var bucketArn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var bucketCreatedAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var bucketName: js.UndefOr[string] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that Amazon Macie can analyze in the bucket. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * Specifies whether any one-time or recurring classification jobs are configured to analyze data in the bucket, and, if so, the details of the job that ran most recently.
    */
  var jobDetails: js.UndefOr[JobDetails] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the bucket from Amazon S3.
    */
  var lastUpdated: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The total number of objects in the bucket.
    */
  var objectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
    */
  var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined
  
  /**
    * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket policy, or block public access settings allow the bucket to be accessed by the general public.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined
  
  /**
    * The AWS Region that hosts the bucket.
    */
  var region: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts and, if so, which accounts.
    */
  var replicationDetails: js.UndefOr[ReplicationDetails] = js.undefined
  
  /**
    *  Specifies whether the bucket is shared with another AWS account. Possible values are: EXTERNAL - The bucket is shared with an AWS account that isn't part of the same Amazon Macie organization. INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization. NOT_SHARED - The bucket isn't shared with other AWS accounts. UNKNOWN - Amazon Macie wasn't able to evaluate the shared access settings for the bucket.
    */
  var sharedAccess: js.UndefOr[SharedAccess] = js.undefined
  
  /**
    * The total storage size, in bytes, of the bucket.
    */
  var sizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total compressed storage size, in bytes, of the bucket.
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
  
  @scala.inline
  def apply(): BucketMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketMetadata]
  }
  
  @scala.inline
  implicit class BucketMetadataMutableBuilder[Self <: BucketMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBucketArn(value: string): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArnUndefined: Self = StObject.set(x, "bucketArn", js.undefined)
    
    @scala.inline
    def setBucketCreatedAt(value: timestampIso8601): Self = StObject.set(x, "bucketCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketCreatedAtUndefined: Self = StObject.set(x, "bucketCreatedAt", js.undefined)
    
    @scala.inline
    def setBucketName(value: string): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setClassifiableObjectCount(value: long): Self = StObject.set(x, "classifiableObjectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiableObjectCountUndefined: Self = StObject.set(x, "classifiableObjectCount", js.undefined)
    
    @scala.inline
    def setClassifiableSizeInBytes(value: long): Self = StObject.set(x, "classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifiableSizeInBytesUndefined: Self = StObject.set(x, "classifiableSizeInBytes", js.undefined)
    
    @scala.inline
    def setJobDetails(value: JobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDetailsUndefined: Self = StObject.set(x, "jobDetails", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: timestampIso8601): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setObjectCount(value: long): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCountByEncryptionType(value: ObjectCountByEncryptionType): Self = StObject.set(x, "objectCountByEncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCountByEncryptionTypeUndefined: Self = StObject.set(x, "objectCountByEncryptionType", js.undefined)
    
    @scala.inline
    def setObjectCountUndefined: Self = StObject.set(x, "objectCount", js.undefined)
    
    @scala.inline
    def setPublicAccess(value: BucketPublicAccess): Self = StObject.set(x, "publicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessUndefined: Self = StObject.set(x, "publicAccess", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setReplicationDetails(value: ReplicationDetails): Self = StObject.set(x, "replicationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationDetailsUndefined: Self = StObject.set(x, "replicationDetails", js.undefined)
    
    @scala.inline
    def setSharedAccess(value: SharedAccess): Self = StObject.set(x, "sharedAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccessUndefined: Self = StObject.set(x, "sharedAccess", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: long): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytesCompressed(value: long): Self = StObject.set(x, "sizeInBytesCompressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytesCompressedUndefined: Self = StObject.set(x, "sizeInBytesCompressed", js.undefined)
    
    @scala.inline
    def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    @scala.inline
    def setTags(value: listOfKeyValuePair): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: KeyValuePair*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUnclassifiableObjectCount(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclassifiableObjectCountUndefined: Self = StObject.set(x, "unclassifiableObjectCount", js.undefined)
    
    @scala.inline
    def setUnclassifiableObjectSizeInBytes(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclassifiableObjectSizeInBytesUndefined: Self = StObject.set(x, "unclassifiableObjectSizeInBytes", js.undefined)
    
    @scala.inline
    def setVersioning(value: boolean): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
  }
}
