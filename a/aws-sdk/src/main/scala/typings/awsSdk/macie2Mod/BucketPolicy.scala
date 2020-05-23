package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicy extends js.Object {
  /**
    * Specifies whether the bucket policy allows the general public to have read access to the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the bucket policy allows the general public to have write access to the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.native
}

object BucketPolicy {
  @scala.inline
  def apply(
    allowsPublicReadAccess: js.UndefOr[boolean] = js.undefined,
    allowsPublicWriteAccess: js.UndefOr[boolean] = js.undefined
  ): BucketPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsPublicReadAccess)) __obj.updateDynamic("allowsPublicReadAccess")(allowsPublicReadAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsPublicWriteAccess)) __obj.updateDynamic("allowsPublicWriteAccess")(allowsPublicWriteAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicy]
  }
}

