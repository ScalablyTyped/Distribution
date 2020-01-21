package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DataConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Key Management Service (KMS) key that Amazon Personalize uses to encrypt or decrypt the input and output files of a batch inference job.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The file path of the Amazon S3 bucket.
    */
  var path: S3Location = js.native
}

object S3DataConfig {
  @scala.inline
  def apply(path: S3Location, kmsKeyArn: KmsKeyArn = null): S3DataConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataConfig]
  }
}

