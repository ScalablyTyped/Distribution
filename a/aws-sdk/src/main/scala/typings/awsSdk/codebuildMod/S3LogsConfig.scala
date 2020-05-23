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
  def apply(
    status: LogsConfigStatusType,
    encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
    location: String = null
  ): S3LogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfig]
  }
}

