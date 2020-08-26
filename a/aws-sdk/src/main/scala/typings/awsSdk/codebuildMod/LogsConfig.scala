package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsConfig extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. Amazon CloudWatch Logs are enabled by default. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.native
  /**
    *  Information about logs built to an S3 bucket for a build project. S3 logs are not enabled by default. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.native
}

object LogsConfig {
  @scala.inline
  def apply(): LogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsConfig]
  }
  @scala.inline
  implicit class LogsConfigOps[Self <: LogsConfig] (val x: Self) extends AnyVal {
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
    def setCloudWatchLogs(value: CloudWatchLogsConfig): Self = this.set("cloudWatchLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogs: Self = this.set("cloudWatchLogs", js.undefined)
    @scala.inline
    def setS3Logs(value: S3LogsConfig): Self = this.set("s3Logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Logs: Self = this.set("s3Logs", js.undefined)
  }
  
}

