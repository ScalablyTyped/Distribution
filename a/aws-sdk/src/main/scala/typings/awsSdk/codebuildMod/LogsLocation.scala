package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsLocation extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.native
  /**
    *  The ARN of Amazon CloudWatch Logs for a build project. Its format is arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}. For more information, see Resources Defined by Amazon CloudWatch Logs. 
    */
  var cloudWatchLogsArn: js.UndefOr[String] = js.native
  /**
    * The URL to an individual build log in Amazon CloudWatch Logs.
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs group for the build logs.
    */
  var groupName: js.UndefOr[String] = js.native
  /**
    *  The URL to a build log in an S3 bucket. 
    */
  var s3DeepLink: js.UndefOr[String] = js.native
  /**
    *  Information about S3 logs for a build project. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.native
  /**
    *  The ARN of S3 logs for a build project. Its format is arn:${Partition}:s3:::${BucketName}/${ObjectName}. For more information, see Resources Defined by Amazon S3. 
    */
  var s3LogsArn: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs stream for the build logs.
    */
  var streamName: js.UndefOr[String] = js.native
}

object LogsLocation {
  @scala.inline
  def apply(): LogsLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsLocation]
  }
  @scala.inline
  implicit class LogsLocationOps[Self <: LogsLocation] (val x: Self) extends AnyVal {
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
    def setCloudWatchLogsArn(value: String): Self = this.set("cloudWatchLogsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogsArn: Self = this.set("cloudWatchLogsArn", js.undefined)
    @scala.inline
    def setDeepLink(value: String): Self = this.set("deepLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLink: Self = this.set("deepLink", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    @scala.inline
    def setS3DeepLink(value: String): Self = this.set("s3DeepLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3DeepLink: Self = this.set("s3DeepLink", js.undefined)
    @scala.inline
    def setS3Logs(value: S3LogsConfig): Self = this.set("s3Logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Logs: Self = this.set("s3Logs", js.undefined)
    @scala.inline
    def setS3LogsArn(value: String): Self = this.set("s3LogsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3LogsArn: Self = this.set("s3LogsArn", js.undefined)
    @scala.inline
    def setStreamName(value: String): Self = this.set("streamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("streamName", js.undefined)
  }
  
}

