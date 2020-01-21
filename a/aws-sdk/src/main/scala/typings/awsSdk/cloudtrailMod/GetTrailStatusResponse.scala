package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailStatusResponse extends js.Object {
  /**
    * Whether the CloudTrail is currently logging AWS API calls.
    */
  var IsLogging: js.UndefOr[Boolean] = js.native
  /**
    * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.native
  /**
    * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptTime: js.UndefOr[String] = js.native
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDeliveryError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
    */
  var LatestDeliveryTime: js.UndefOr[Date] = js.native
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDigestDeliveryError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
    */
  var LatestDigestDeliveryTime: js.UndefOr[Date] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptTime: js.UndefOr[String] = js.native
  /**
    * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more information about Amazon SNS errors, see the Amazon SNS Developer Guide. 
    */
  var LatestNotificationError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file to an account's Amazon S3 bucket.
    */
  var LatestNotificationTime: js.UndefOr[Date] = js.native
  /**
    * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
    */
  var StartLoggingTime: js.UndefOr[Date] = js.native
  /**
    * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
    */
  var StopLoggingTime: js.UndefOr[Date] = js.native
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStarted: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStopped: js.UndefOr[String] = js.native
}

object GetTrailStatusResponse {
  @scala.inline
  def apply(
    IsLogging: js.UndefOr[scala.Boolean] = js.undefined,
    LatestCloudWatchLogsDeliveryError: String = null,
    LatestCloudWatchLogsDeliveryTime: Date = null,
    LatestDeliveryAttemptSucceeded: String = null,
    LatestDeliveryAttemptTime: String = null,
    LatestDeliveryError: String = null,
    LatestDeliveryTime: Date = null,
    LatestDigestDeliveryError: String = null,
    LatestDigestDeliveryTime: Date = null,
    LatestNotificationAttemptSucceeded: String = null,
    LatestNotificationAttemptTime: String = null,
    LatestNotificationError: String = null,
    LatestNotificationTime: Date = null,
    StartLoggingTime: Date = null,
    StopLoggingTime: Date = null,
    TimeLoggingStarted: String = null,
    TimeLoggingStopped: String = null
  ): GetTrailStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLogging)) __obj.updateDynamic("IsLogging")(IsLogging.asInstanceOf[js.Any])
    if (LatestCloudWatchLogsDeliveryError != null) __obj.updateDynamic("LatestCloudWatchLogsDeliveryError")(LatestCloudWatchLogsDeliveryError.asInstanceOf[js.Any])
    if (LatestCloudWatchLogsDeliveryTime != null) __obj.updateDynamic("LatestCloudWatchLogsDeliveryTime")(LatestCloudWatchLogsDeliveryTime.asInstanceOf[js.Any])
    if (LatestDeliveryAttemptSucceeded != null) __obj.updateDynamic("LatestDeliveryAttemptSucceeded")(LatestDeliveryAttemptSucceeded.asInstanceOf[js.Any])
    if (LatestDeliveryAttemptTime != null) __obj.updateDynamic("LatestDeliveryAttemptTime")(LatestDeliveryAttemptTime.asInstanceOf[js.Any])
    if (LatestDeliveryError != null) __obj.updateDynamic("LatestDeliveryError")(LatestDeliveryError.asInstanceOf[js.Any])
    if (LatestDeliveryTime != null) __obj.updateDynamic("LatestDeliveryTime")(LatestDeliveryTime.asInstanceOf[js.Any])
    if (LatestDigestDeliveryError != null) __obj.updateDynamic("LatestDigestDeliveryError")(LatestDigestDeliveryError.asInstanceOf[js.Any])
    if (LatestDigestDeliveryTime != null) __obj.updateDynamic("LatestDigestDeliveryTime")(LatestDigestDeliveryTime.asInstanceOf[js.Any])
    if (LatestNotificationAttemptSucceeded != null) __obj.updateDynamic("LatestNotificationAttemptSucceeded")(LatestNotificationAttemptSucceeded.asInstanceOf[js.Any])
    if (LatestNotificationAttemptTime != null) __obj.updateDynamic("LatestNotificationAttemptTime")(LatestNotificationAttemptTime.asInstanceOf[js.Any])
    if (LatestNotificationError != null) __obj.updateDynamic("LatestNotificationError")(LatestNotificationError.asInstanceOf[js.Any])
    if (LatestNotificationTime != null) __obj.updateDynamic("LatestNotificationTime")(LatestNotificationTime.asInstanceOf[js.Any])
    if (StartLoggingTime != null) __obj.updateDynamic("StartLoggingTime")(StartLoggingTime.asInstanceOf[js.Any])
    if (StopLoggingTime != null) __obj.updateDynamic("StopLoggingTime")(StopLoggingTime.asInstanceOf[js.Any])
    if (TimeLoggingStarted != null) __obj.updateDynamic("TimeLoggingStarted")(TimeLoggingStarted.asInstanceOf[js.Any])
    if (TimeLoggingStopped != null) __obj.updateDynamic("TimeLoggingStopped")(TimeLoggingStopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrailStatusResponse]
  }
}

