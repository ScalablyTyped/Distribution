package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLOutputDataConfig extends js.Object {
  /**
    * The AWS KMS encryption key ID.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The Amazon S3 output path. Must be 128 characters or less.
    */
  var S3OutputPath: S3Uri = js.native
}

object AutoMLOutputDataConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri, KmsKeyId: KmsKeyId = null): AutoMLOutputDataConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLOutputDataConfig]
  }
}

