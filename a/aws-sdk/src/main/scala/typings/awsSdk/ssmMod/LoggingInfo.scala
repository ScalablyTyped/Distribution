package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingInfo extends js.Object {
  /**
    * The name of an S3 bucket where execution logs are stored .
    */
  var S3BucketName: typings.awsSdk.ssmMod.S3BucketName = js.native
  /**
    * (Optional) The S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.ssmMod.S3KeyPrefix] = js.native
  /**
    * The Region where the S3 bucket is located.
    */
  var S3Region: typings.awsSdk.ssmMod.S3Region = js.native
}

object LoggingInfo {
  @scala.inline
  def apply(S3BucketName: S3BucketName, S3Region: S3Region): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  @scala.inline
  implicit class LoggingInfoOps[Self <: LoggingInfo] (val x: Self) extends AnyVal {
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
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Region(value: S3Region): Self = this.set("S3Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3KeyPrefix(value: S3KeyPrefix): Self = this.set("S3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("S3KeyPrefix", js.undefined)
  }
  
}

