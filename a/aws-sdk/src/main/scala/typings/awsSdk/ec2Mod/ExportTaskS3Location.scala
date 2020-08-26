package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskS3Location extends js.Object {
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportTaskS3Location {
  @scala.inline
  def apply(): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskS3Location]
  }
  @scala.inline
  implicit class ExportTaskS3LocationOps[Self <: ExportTaskS3Location] (val x: Self) extends AnyVal {
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
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    @scala.inline
    def setS3Prefix(value: String): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Prefix: Self = this.set("S3Prefix", js.undefined)
  }
  
}

