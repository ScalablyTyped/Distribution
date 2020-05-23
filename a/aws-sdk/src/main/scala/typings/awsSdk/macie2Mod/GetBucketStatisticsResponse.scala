package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketStatisticsResponse extends js.Object {
  /**
    * The total number of buckets.
    */
  var bucketCount: js.UndefOr[long] = js.native
  /**
    * The total number of buckets that are publicly accessible, based on a combination of permissions settings for each bucket.
    */
  var bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.native
  /**
    * The total number of buckets, grouped by server-side encryption type. This object also reports the total number of buckets that aren't encrypted.
    */
  var bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.native
  /**
    * The total number of buckets that are shared with another AWS account or configured to support cross-origin resource sharing (CORS).
    */
  var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.native
  /**
    * The total number of objects that Amazon Macie can monitor and analyze in all the buckets. These objects use a file format, file extension, or content type that Amazon Macie supports.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie last analyzed the buckets.
    */
  var lastUpdated: js.UndefOr[timestampIso8601] = js.native
  /**
    * The total number of objects in all the buckets.
    */
  var objectCount: js.UndefOr[long] = js.native
  /**
    * The total storage size, in bytes, of all the buckets.
    */
  var sizeInBytes: js.UndefOr[long] = js.native
  /**
    * The total compressed storage size, in bytes, of all the buckets.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.native
}

object GetBucketStatisticsResponse {
  @scala.inline
  def apply(
    bucketCount: js.UndefOr[long] = js.undefined,
    bucketCountByEffectivePermission: BucketCountByEffectivePermission = null,
    bucketCountByEncryptionType: BucketCountByEncryptionType = null,
    bucketCountBySharedAccessType: BucketCountBySharedAccessType = null,
    classifiableObjectCount: js.UndefOr[long] = js.undefined,
    lastUpdated: timestampIso8601 = null,
    objectCount: js.UndefOr[long] = js.undefined,
    sizeInBytes: js.UndefOr[long] = js.undefined,
    sizeInBytesCompressed: js.UndefOr[long] = js.undefined
  ): GetBucketStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bucketCount)) __obj.updateDynamic("bucketCount")(bucketCount.get.asInstanceOf[js.Any])
    if (bucketCountByEffectivePermission != null) __obj.updateDynamic("bucketCountByEffectivePermission")(bucketCountByEffectivePermission.asInstanceOf[js.Any])
    if (bucketCountByEncryptionType != null) __obj.updateDynamic("bucketCountByEncryptionType")(bucketCountByEncryptionType.asInstanceOf[js.Any])
    if (bucketCountBySharedAccessType != null) __obj.updateDynamic("bucketCountBySharedAccessType")(bucketCountBySharedAccessType.asInstanceOf[js.Any])
    if (!js.isUndefined(classifiableObjectCount)) __obj.updateDynamic("classifiableObjectCount")(classifiableObjectCount.get.asInstanceOf[js.Any])
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated.asInstanceOf[js.Any])
    if (!js.isUndefined(objectCount)) __obj.updateDynamic("objectCount")(objectCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInBytes)) __obj.updateDynamic("sizeInBytes")(sizeInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInBytesCompressed)) __obj.updateDynamic("sizeInBytesCompressed")(sizeInBytesCompressed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketStatisticsResponse]
  }
}

