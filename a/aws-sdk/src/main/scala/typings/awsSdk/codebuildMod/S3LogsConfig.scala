package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LogsConfig extends js.Object {
  /**
    *  Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is my-bucket, and your path prefix is build-log, then acceptable formats are my-bucket/build-log or arn:aws:s3:::my-bucket/build-log. 
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The current status of the S3 build logs. Valid values are:    ENABLED: S3 build logs are enabled for this build project.    DISABLED: S3 build logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType = js.native
}

object S3LogsConfig {
  @scala.inline
  def apply(status: LogsConfigStatusType): S3LogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfig]
  }
  @scala.inline
  implicit class S3LogsConfigOps[Self <: S3LogsConfig] (val x: Self) extends AnyVal {
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
    def setStatus(value: LogsConfigStatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionDisabled(value: WrapperBoolean): Self = this.set("encryptionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionDisabled: Self = this.set("encryptionDisabled", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

