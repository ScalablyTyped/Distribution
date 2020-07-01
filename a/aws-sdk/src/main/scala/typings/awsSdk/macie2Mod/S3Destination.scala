package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * The name of the bucket.
    */
  var bucketName: string = js.native
  /**
    * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store classification results in the bucket.
    */
  var keyPrefix: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service customer master key (CMK) to use for encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
    */
  var kmsKeyArn: string = js.native
}

object S3Destination {
  @scala.inline
  def apply(bucketName: string, kmsKeyArn: string, keyPrefix: string = null): S3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
}

