package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicy extends js.Object {
  /**
    * A value that indicates whether public read access for the bucket is enabled through a bucket policy.
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether public write access for the bucket is enabled through a bucket policy.
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.native
}

object BucketPolicy {
  @scala.inline
  def apply(
    AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined,
    AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
  ): BucketPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowsPublicReadAccess)) __obj.updateDynamic("AllowsPublicReadAccess")(AllowsPublicReadAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowsPublicWriteAccess)) __obj.updateDynamic("AllowsPublicWriteAccess")(AllowsPublicWriteAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicy]
  }
}

