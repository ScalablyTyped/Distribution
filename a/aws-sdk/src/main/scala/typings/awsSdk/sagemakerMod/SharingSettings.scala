package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingSettings extends js.Object {
  /**
    * The notebook output option.
    */
  var NotebookOutputOption: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookOutputOption] = js.native
  /**
    * The AWS Key Management Service encryption key ID.
    */
  var S3KmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The Amazon S3 output path.
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

