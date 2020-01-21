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
  def apply(
    cloudWatchLogs: CloudWatchLogsConfig = null,
    cloudWatchLogsArn: String = null,
    deepLink: String = null,
    groupName: String = null,
    s3DeepLink: String = null,
    s3Logs: S3LogsConfig = null,
    s3LogsArn: String = null,
    streamName: String = null
  ): LogsLocation = {
    val __obj = js.Dynamic.literal()
    if (cloudWatchLogs != null) __obj.updateDynamic("cloudWatchLogs")(cloudWatchLogs.asInstanceOf[js.Any])
    if (cloudWatchLogsArn != null) __obj.updateDynamic("cloudWatchLogsArn")(cloudWatchLogsArn.asInstanceOf[js.Any])
    if (deepLink != null) __obj.updateDynamic("deepLink")(deepLink.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (s3DeepLink != null) __obj.updateDynamic("s3DeepLink")(s3DeepLink.asInstanceOf[js.Any])
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs.asInstanceOf[js.Any])
    if (s3LogsArn != null) __obj.updateDynamic("s3LogsArn")(s3LogsArn.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsLocation]
  }
}

