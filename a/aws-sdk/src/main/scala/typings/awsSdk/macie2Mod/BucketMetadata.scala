package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketMetadata extends js.Object {
  /**
    * The unique identifier for the AWS account that's associated with the bucket.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var bucketArn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var bucketCreatedAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The name of the bucket.
    */
  var bucketName: js.UndefOr[string] = js.native
  /**
    * The total number of objects that Amazon Macie can monitor and analyze in the bucket. These objects use a file format, file extension, or content type that Amazon Macie supports.
    */
  var classifiableObjectCount: js.UndefOr[long] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when Amazon Macie last analyzed the bucket.
    */
  var lastUpdated: js.UndefOr[timestampIso8601] = js.native
  /**
    * The total number of objects in the bucket.
    */
  var objectCount: js.UndefOr[long] = js.native
  /**
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted.
    */
  var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.native
  /**
    * Specifies whether the bucket is publicly accessible. If this value is true, an access control list (ACL), bucket policy, or block public access settings allow the bucket to be accessed by the general public.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.native
  /**
    * The AWS Region that hosts the bucket.
    */
  var region: js.UndefOr[string] = js.native
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to buckets for other AWS accounts and, if so, which accounts.
    */
  var replicationDetails: js.UndefOr[ReplicationDetails] = js.native
  /**
    * Specifies whether the bucket is shared with another AWS account or configured to support cross-origin resource sharing (CORS). Valid values are: EXTERNAL - The bucket is shared with an AWS account that isn’t part of the Amazon Macie organization. INTERNAL - The bucket is shared with an AWS account that's part of the Amazon Macie organization. NOT_SHARED - The bucket isn't shared with other AWS accounts.
    */
  var sharedAccess: js.UndefOr[SharedAccess] = js.native
  /**
    * The total storage size, in bytes, of the bucket.
    */
  var sizeInBytes: js.UndefOr[long] = js.native
  /**
    * The total compressed storage size, in bytes, of the bucket.
    */
  var sizeInBytesCompressed: js.UndefOr[long] = js.native
  /**
    * An array that specifies the tags (keys and values) that are associated with the bucket.
    */
  var tags: js.UndefOr[listOfKeyValuePair] = js.native
  /**
    * Specifies whether versioning is enabled for the bucket.
    */
  var versioning: js.UndefOr[boolean] = js.native
}

object BucketMetadata {
  @scala.inline
  def apply(
    accountId: string = null,
    bucketArn: string = null,
    bucketCreatedAt: timestampIso8601 = null,
    bucketName: string = null,
    classifiableObjectCount: js.UndefOr[long] = js.undefined,
    lastUpdated: timestampIso8601 = null,
    objectCount: js.UndefOr[long] = js.undefined,
    objectCountByEncryptionType: ObjectCountByEncryptionType = null,
    publicAccess: BucketPublicAccess = null,
    region: string = null,
    replicationDetails: ReplicationDetails = null,
    sharedAccess: SharedAccess = null,
    sizeInBytes: js.UndefOr[long] = js.undefined,
    sizeInBytesCompressed: js.UndefOr[long] = js.undefined,
    tags: listOfKeyValuePair = null,
    versioning: js.UndefOr[boolean] = js.undefined
  ): BucketMetadata = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (bucketArn != null) __obj.updateDynamic("bucketArn")(bucketArn.asInstanceOf[js.Any])
    if (bucketCreatedAt != null) __obj.updateDynamic("bucketCreatedAt")(bucketCreatedAt.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (!js.isUndefined(classifiableObjectCount)) __obj.updateDynamic("classifiableObjectCount")(classifiableObjectCount.get.asInstanceOf[js.Any])
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated.asInstanceOf[js.Any])
    if (!js.isUndefined(objectCount)) __obj.updateDynamic("objectCount")(objectCount.get.asInstanceOf[js.Any])
    if (objectCountByEncryptionType != null) __obj.updateDynamic("objectCountByEncryptionType")(objectCountByEncryptionType.asInstanceOf[js.Any])
    if (publicAccess != null) __obj.updateDynamic("publicAccess")(publicAccess.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (replicationDetails != null) __obj.updateDynamic("replicationDetails")(replicationDetails.asInstanceOf[js.Any])
    if (sharedAccess != null) __obj.updateDynamic("sharedAccess")(sharedAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInBytes)) __obj.updateDynamic("sizeInBytes")(sizeInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInBytesCompressed)) __obj.updateDynamic("sizeInBytesCompressed")(sizeInBytesCompressed.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(versioning)) __obj.updateDynamic("versioning")(versioning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketMetadata]
  }
}

