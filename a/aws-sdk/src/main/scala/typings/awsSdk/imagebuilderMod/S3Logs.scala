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
  def apply(): S3Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Logs]
  }
  @scala.inline
  implicit class S3LogsOps[Self <: S3Logs] (val x: Self) extends AnyVal {
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
    def setS3BucketName(value: NonEmptyString): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
    @scala.inline
    def setS3KeyPrefix(value: NonEmptyString): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
  }
  
}

