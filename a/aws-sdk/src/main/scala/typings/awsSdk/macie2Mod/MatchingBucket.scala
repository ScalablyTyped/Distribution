package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingBucket extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account that owns the bucket.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
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
    * Specifies whether any one-time or recurring classification jobs are configured to analyze objects in the bucket, and, if so, the details of the job that ran most recently.
    */
  var jobDetails: js.UndefOr[JobDetails] = js.undefined
  
  /**
    * The total number of objects in the bucket.
    */
  var objectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
    */
  var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined
  
  /**
    * The total storage size, in bytes, of the bucket. If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest version of each object in the bucket. This value doesn't reflect the storage size of all versions of each object in the bucket.
    */
  var sizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that are compressed (.gz, .gzip, .zip) files in the bucket. If versioning is enabled for the bucket, Amazon Macie calculates this value based on the size of the latest version of each applicable object in the bucket. This value doesn't reflect the storage size of all versions of each applicable object in the bucket.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined
  
  /**
    * The total storage size, in bytes, of the objects that Amazon Macie can't analyze in the bucket. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
}
object MatchingBucket {
  
  inline def apply(): MatchingBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingBucket]
  }
  
  extension [Self <: MatchingBucket](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
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
    
    inline def setObjectCount(value: long): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
    
    inline def setObjectCountByEncryptionType(value: ObjectCountByEncryptionType): Self = StObject.set(x, "objectCountByEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setObjectCountByEncryptionTypeUndefined: Self = StObject.set(x, "objectCountByEncryptionType", js.undefined)
    
    inline def setObjectCountUndefined: Self = StObject.set(x, "objectCount", js.undefined)
    
    inline def setSizeInBytes(value: long): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressed(value: long): Self = StObject.set(x, "sizeInBytesCompressed", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesCompressedUndefined: Self = StObject.set(x, "sizeInBytesCompressed", js.undefined)
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "sizeInBytes", js.undefined)
    
    inline def setUnclassifiableObjectCount(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectCountUndefined: Self = StObject.set(x, "unclassifiableObjectCount", js.undefined)
    
    inline def setUnclassifiableObjectSizeInBytes(value: ObjectLevelStatistics): Self = StObject.set(x, "unclassifiableObjectSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiableObjectSizeInBytesUndefined: Self = StObject.set(x, "unclassifiableObjectSizeInBytes", js.undefined)
  }
}
