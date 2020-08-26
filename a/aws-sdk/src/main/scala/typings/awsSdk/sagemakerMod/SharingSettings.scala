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
  def apply(): SharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingSettings]
  }
  @scala.inline
  implicit class SharingSettingsOps[Self <: SharingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotebookOutputOption(value: NotebookOutputOption): Self = this.set("NotebookOutputOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookOutputOption: Self = this.set("NotebookOutputOption", js.undefined)
    @scala.inline
    def setS3KmsKeyId(value: KmsKeyId): Self = this.set("S3KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3KmsKeyId: Self = this.set("S3KmsKeyId", js.undefined)
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = this.set("S3OutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3OutputPath: Self = this.set("S3OutputPath", js.undefined)
  }
  
}

