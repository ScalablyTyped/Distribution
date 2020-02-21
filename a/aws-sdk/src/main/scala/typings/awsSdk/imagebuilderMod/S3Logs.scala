package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Logs extends js.Object {
  /**
    * The Amazon S3 bucket in which to store the logs.
    */
  var s3BucketName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon S3 path in which to store the logs.
    */
  var s3KeyPrefix: js.UndefOr[NonEmptyString] = js.native
}

object S3Logs {
  @scala.inline
  def apply(s3BucketName: NonEmptyString = null, s3KeyPrefix: NonEmptyString = null): S3Logs = {
    val __obj = js.Dynamic.literal()
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Logs]
  }
}

