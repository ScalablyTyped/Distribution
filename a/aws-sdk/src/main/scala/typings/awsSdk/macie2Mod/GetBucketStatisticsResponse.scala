package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketStatisticsResponse extends StObject {
  
  /**
    * The total number of buckets.
    */
  var bucketCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that are publicly accessible based on a combination of permissions settings for each bucket.
    */
  var bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.undefined
  
  /**
    * The total number of buckets, grouped by server-side encryption type. This object also reports the total number of buckets that don't encrypt objects by default.
    */
  var bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.undefined
  
  /**
    * The total number of buckets that are shared with another AWS account.
    */
  var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the buckets from Amazon S3.
    */
  var lastUpdated: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The total number of objects in the buckets.
    */
  var objectCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the buckets.
    */
  var sizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total compressed storage size, in bytes, of the buckets.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
}
object GetBucketStatisticsResponse {
  
  inline def apply(): GetBucketStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketStatisticsResponse]
  }
  
  extension [Self <: GetBucketStatisticsResponse](x: Self) {
    
    inline def setBucketCount(value: long): Self = StObject.set(x, "bucketCount", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEffectivePermission(value: BucketCountByEffectivePermission): Self = StObject.set(x, "bucketCountByEffectivePermission", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEffectivePermissionUndefined: Self = StObject.set(x, "bucketCountByEffectivePermission", js.undefined)
    
    inline def setBucketCountByEncryptionType(value: BucketCountByEncryptionType): Self = StObject.set(x, "bucketCountByEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setBucketCountByEncryptionTypeUndefined: Self = StObject.set(x, "bucketCountByEncryptionType", js.undefined)
    
    inline def setBucketCountBySharedAccessType(value: BucketCountBySharedAccessType): Self = StObject.set(x, "bucketCountBySharedAccessType", value.asInstanceOf[js.Any])
    
    inline def setBucketCountBySharedAccessTypeUndefined: Self = StObject.set(x, "bucketCountBySharedAccessType", js.undefined)
    
    inline def setBucketCountUndefined: Self = StObject.set(x, "bucketCount", js.undefined)
    
    inline def setClassifiableObjectCount(value: long): Self = StObject.set(x, "classifiableObjectCount", value.asInstanceOf[js.Any])
    
    inline def setClassifiableObjectCountUndefined: Self = StObject.set(x, "classifiableObjectCount", js.undefined)
    
    inline def setClassifiableSizeInBytes(value: long): Self = StObject.set(x, "classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setClassifiableSizeInBytesUndefined: Self = StObject.set(x, "classifiableSizeInBytes", js.undefined)
    
    inline def setLastUpdated(value: timestampIso8601): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setObjectCount(value: long): Self = StObject.set(x, "objectCount", value.asInstanceOf[js.Any])
    
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
