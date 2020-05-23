package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLevelPermissions extends js.Object {
  /**
    * The permissions settings of the access control list (ACL) for the bucket. This value is null if an ACL hasn't been defined for the bucket.
    */
  var accessControlList: js.UndefOr[AccessControlList] = js.native
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.native
  /**
    * The permissions settings of the bucket policy for the bucket. This value is null if a bucket policy hasn't been defined for the bucket.
    */
  var bucketPolicy: js.UndefOr[BucketPolicy] = js.native
}

object BucketLevelPermissions {
  @scala.inline
  def apply(
    accessControlList: AccessControlList = null,
    blockPublicAccess: BlockPublicAccess = null,
    bucketPolicy: BucketPolicy = null
  ): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    if (accessControlList != null) __obj.updateDynamic("accessControlList")(accessControlList.asInstanceOf[js.Any])
    if (blockPublicAccess != null) __obj.updateDynamic("blockPublicAccess")(blockPublicAccess.asInstanceOf[js.Any])
    if (bucketPolicy != null) __obj.updateDynamic("bucketPolicy")(bucketPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLevelPermissions]
  }
}

