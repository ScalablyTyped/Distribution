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
    * The total number of objects that Amazon Macie can analyze in the bucket. These objects use a file format, file extension, or content type that Amazon Macie supports.
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
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted or use client-side encryption.
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
    * Specifies whether the bucket is shared with another AWS account. Valid values are: EXTERNAL - The bucket is shared with an AWS account that isn’t part of the same Amazon Macie organization. INTERNAL - The bucket is shared with an AWS account that's part of the same Amazon Macie organization. NOT_SHARED - The bucket isn't shared with other AWS accounts.
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
  def apply(): BucketMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketMetadata]
  }
  @scala.inline
  implicit class BucketMetadataOps[Self <: BucketMetadata] (val x: Self) extends AnyVal {
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBucketArn(value: string): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketArn: Self = this.set("bucketArn", js.undefined)
    @scala.inline
    def setBucketCreatedAt(value: timestampIso8601): Self = this.set("bucketCreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketCreatedAt: Self = this.set("bucketCreatedAt", js.undefined)
    @scala.inline
    def setBucketName(value: string): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    @scala.inline
    def setClassifiableObjectCount(value: long): Self = this.set("classifiableObjectCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifiableObjectCount: Self = this.set("classifiableObjectCount", js.undefined)
    @scala.inline
    def setLastUpdated(value: timestampIso8601): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    @scala.inline
    def setObjectCount(value: long): Self = this.set("objectCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectCount: Self = this.set("objectCount", js.undefined)
    @scala.inline
    def setObjectCountByEncryptionType(value: ObjectCountByEncryptionType): Self = this.set("objectCountByEncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectCountByEncryptionType: Self = this.set("objectCountByEncryptionType", js.undefined)
    @scala.inline
    def setPublicAccess(value: BucketPublicAccess): Self = this.set("publicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccess: Self = this.set("publicAccess", js.undefined)
    @scala.inline
    def setRegion(value: string): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setReplicationDetails(value: ReplicationDetails): Self = this.set("replicationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationDetails: Self = this.set("replicationDetails", js.undefined)
    @scala.inline
    def setSharedAccess(value: SharedAccess): Self = this.set("sharedAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAccess: Self = this.set("sharedAccess", js.undefined)
    @scala.inline
    def setSizeInBytes(value: long): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInBytes: Self = this.set("sizeInBytes", js.undefined)
    @scala.inline
    def setSizeInBytesCompressed(value: long): Self = this.set("sizeInBytesCompressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInBytesCompressed: Self = this.set("sizeInBytesCompressed", js.undefined)
    @scala.inline
    def setTagsVarargs(value: KeyValuePair*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: listOfKeyValuePair): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersioning(value: boolean): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
  
}

