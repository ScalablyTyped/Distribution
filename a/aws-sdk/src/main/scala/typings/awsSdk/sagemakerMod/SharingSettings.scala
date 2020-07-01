package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingSettings extends js.Object {
  /**
    * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
    */
  var NotebookOutputOption: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookOutputOption] = js.native
  /**
    * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
    */
  var S3KmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to save the notebook cell output. If S3OutputPath isn't specified, a default bucket is used.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
}

object SharingSettings {
  @scala.inline
  def apply(
    NotebookOutputOption: NotebookOutputOption = null,
    S3KmsKeyId: KmsKeyId = null,
    S3OutputPath: S3Uri = null
  ): SharingSettings = {
    val __obj = js.Dynamic.literal()
    if (NotebookOutputOption != null) __obj.updateDynamic("NotebookOutputOption")(NotebookOutputOption.asInstanceOf[js.Any])
    if (S3KmsKeyId != null) __obj.updateDynamic("S3KmsKeyId")(S3KmsKeyId.asInstanceOf[js.Any])
    if (S3OutputPath != null) __obj.updateDynamic("S3OutputPath")(S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingSettings]
  }
}

