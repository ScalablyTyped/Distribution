package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Bucket extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The server-side encryption settings for the bucket.
    */
  var defaultServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[string] = js.native
  /**
    * The display name and account identifier for the user who owns the bucket.
    */
  var owner: js.UndefOr[S3BucketOwner] = js.native
  /**
    * The permissions settings that determine whether the bucket is publicly accessible.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.native
  /**
    * The tags that are associated with the bucket.
    */
  var tags: js.UndefOr[KeyValuePairList] = js.native
}

object S3Bucket {
  @scala.inline
  def apply(
    arn: string = null,
    createdAt: timestampIso8601 = null,
    defaultServerSideEncryption: ServerSideEncryption = null,
    name: string = null,
    owner: S3BucketOwner = null,
    publicAccess: BucketPublicAccess = null,
    tags: KeyValuePairList = null
  ): S3Bucket = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (defaultServerSideEncryption != null) __obj.updateDynamic("defaultServerSideEncryption")(defaultServerSideEncryption.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (publicAccess != null) __obj.updateDynamic("publicAccess")(publicAccess.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Bucket]
  }
}

