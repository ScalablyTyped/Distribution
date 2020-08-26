package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceConfig extends js.Object {
  /**
    * The target processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}

object SourceConfig {
  @scala.inline
  def apply(): SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfig]
  }
  @scala.inline
  implicit class SourceConfigOps[Self <: SourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchitecture(value: Architecture): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("s3Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Key: Self = this.set("s3Key", js.undefined)
  }
  
}

