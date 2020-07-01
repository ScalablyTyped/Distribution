package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLevelPermissions extends js.Object {
  /**
    * Contains information on how Access Control Policies are applied to the bucket.
    */
  var AccessControlList: js.UndefOr[typings.awsSdk.guarddutyMod.AccessControlList] = js.native
  /**
    * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.BlockPublicAccess] = js.native
  /**
    * Contains information on the bucket policies for the S3 bucket.
    */
  var BucketPolicy: js.UndefOr[typings.awsSdk.guarddutyMod.BucketPolicy] = js.native
}

object BucketLevelPermissions {
  @scala.inline
  def apply(
    AccessControlList: AccessControlList = null,
    BlockPublicAccess: BlockPublicAccess = null,
    BucketPolicy: BucketPolicy = null
  ): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (BlockPublicAccess != null) __obj.updateDynamic("BlockPublicAccess")(BlockPublicAccess.asInstanceOf[js.Any])
    if (BucketPolicy != null) __obj.updateDynamic("BucketPolicy")(BucketPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLevelPermissions]
  }
}

