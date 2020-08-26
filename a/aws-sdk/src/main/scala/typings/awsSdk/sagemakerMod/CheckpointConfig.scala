package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfig extends js.Object {
  /**
    * (Optional) The local directory where checkpoints are written. The default directory is /opt/ml/checkpoints/. 
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * Identifies the S3 path where you want Amazon SageMaker to store checkpoints. For example, s3://bucket-name/key-name-prefix.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}

object CheckpointConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): CheckpointConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfig]
  }
  @scala.inline
  implicit class CheckpointConfigOps[Self <: CheckpointConfig] (val x: Self) extends AnyVal {
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
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = this.set("LocalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPath: Self = this.set("LocalPath", js.undefined)
  }
  
}

