package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageSource extends js.Object {
  /**
    * Name of the bucket containing the package.
    */
  var S3BucketName: js.UndefOr[typings.awsSdk.esMod.S3BucketName] = js.native
  /**
    * Key (file name) of the package.
    */
  var S3Key: js.UndefOr[typings.awsSdk.esMod.S3Key] = js.native
}

object PackageSource {
  @scala.inline
  def apply(S3BucketName: S3BucketName = null, S3Key: S3Key = null): PackageSource = {
    val __obj = js.Dynamic.literal()
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageSource]
  }
}

