package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketStatisticsResponse extends js.Object {
  
  /**
    * The total number of buckets.
    */
  var bucketCount: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that are publicly accessible based on a combination of permissions settings for each bucket.
    */
  var bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.native
  
  /**
    * The total number of buckets, grouped by server-side encryption type. This object also reports the total number of buckets that don't encrypt objects by default.
    */
  var bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.native
  
  /**
    * The total number of buckets that are shared with another AWS account.
    */
  var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.native
  
  /**
    * The total number of objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.native
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie most recently retrieved data about the buckets from Amazon S3.
    */
  var lastUpdated: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The total number of objects in the buckets.
    */
  var objectCount: js.UndefOr[long] = js.native
  
  /**
    * The total storage size, in bytes, of the buckets.
    */
  var sizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * The total compressed storage size, in bytes, of the buckets.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.native
  
  /**
    * The total number of objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.native
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can't analyze in the buckets. These objects don't use a supported storage class or don't have a file name extension for a supported file or storage format.
    */
  var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.native
}
object GetBucketStatisticsResponse {
  
  @scala.inline
  def apply(): GetBucketStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetBucketStatisticsResponseOps[Self <: GetBucketStatisticsResponse] (val x: Self) extends AnyVal {
    
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
    def setBucketCount(value: long): Self = this.set("bucketCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCount: Self = this.set("bucketCount", js.undefined)
    
    @scala.inline
    def setBucketCountByEffectivePermission(value: BucketCountByEffectivePermission): Self = this.set("bucketCountByEffectivePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCountByEffectivePermission: Self = this.set("bucketCountByEffectivePermission", js.undefined)
    
    @scala.inline
    def setBucketCountByEncryptionType(value: BucketCountByEncryptionType): Self = this.set("bucketCountByEncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCountByEncryptionType: Self = this.set("bucketCountByEncryptionType", js.undefined)
    
    @scala.inline
    def setBucketCountBySharedAccessType(value: BucketCountBySharedAccessType): Self = this.set("bucketCountBySharedAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCountBySharedAccessType: Self = this.set("bucketCountBySharedAccessType", js.undefined)
    
    @scala.inline
    def setClassifiableObjectCount(value: long): Self = this.set("classifiableObjectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifiableObjectCount: Self = this.set("classifiableObjectCount", js.undefined)
    
    @scala.inline
    def setClassifiableSizeInBytes(value: long): Self = this.set("classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifiableSizeInBytes: Self = this.set("classifiableSizeInBytes", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: timestampIso8601): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    
    @scala.inline
    def setObjectCount(value: long): Self = this.set("objectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectCount: Self = this.set("objectCount", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: long): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInBytes: Self = this.set("sizeInBytes", js.undefined)
    
    @scala.inline
    def setSizeInBytesCompressed(value: long): Self = this.set("sizeInBytesCompressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInBytesCompressed: Self = this.set("sizeInBytesCompressed", js.undefined)
    
    @scala.inline
    def setUnclassifiableObjectCount(value: ObjectLevelStatistics): Self = this.set("unclassifiableObjectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnclassifiableObjectCount: Self = this.set("unclassifiableObjectCount", js.undefined)
    
    @scala.inline
    def setUnclassifiableObjectSizeInBytes(value: ObjectLevelStatistics): Self = this.set("unclassifiableObjectSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnclassifiableObjectSizeInBytes: Self = this.set("unclassifiableObjectSizeInBytes", js.undefined)
  }
}
