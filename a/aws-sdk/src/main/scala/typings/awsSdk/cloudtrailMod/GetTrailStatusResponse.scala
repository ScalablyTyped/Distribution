package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetTrailStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailStatusResponse]
  }
  
  @scala.inline
  implicit class GetTrailStatusResponseOps[Self <: GetTrailStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setIsLogging(value: Boolean): Self = this.set("IsLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLogging: Self = this.set("IsLogging", js.undefined)
    
    @scala.inline
    def setLatestCloudWatchLogsDeliveryError(value: String): Self = this.set("LatestCloudWatchLogsDeliveryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestCloudWatchLogsDeliveryError: Self = this.set("LatestCloudWatchLogsDeliveryError", js.undefined)
    
    @scala.inline
    def setLatestCloudWatchLogsDeliveryTime(value: Date): Self = this.set("LatestCloudWatchLogsDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestCloudWatchLogsDeliveryTime: Self = this.set("LatestCloudWatchLogsDeliveryTime", js.undefined)
    
    @scala.inline
    def setLatestDeliveryAttemptSucceeded(value: String): Self = this.set("LatestDeliveryAttemptSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDeliveryAttemptSucceeded: Self = this.set("LatestDeliveryAttemptSucceeded", js.undefined)
    
    @scala.inline
    def setLatestDeliveryAttemptTime(value: String): Self = this.set("LatestDeliveryAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDeliveryAttemptTime: Self = this.set("LatestDeliveryAttemptTime", js.undefined)
    
    @scala.inline
    def setLatestDeliveryError(value: String): Self = this.set("LatestDeliveryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDeliveryError: Self = this.set("LatestDeliveryError", js.undefined)
    
    @scala.inline
    def setLatestDeliveryTime(value: Date): Self = this.set("LatestDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDeliveryTime: Self = this.set("LatestDeliveryTime", js.undefined)
    
    @scala.inline
    def setLatestDigestDeliveryError(value: String): Self = this.set("LatestDigestDeliveryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDigestDeliveryError: Self = this.set("LatestDigestDeliveryError", js.undefined)
    
    @scala.inline
    def setLatestDigestDeliveryTime(value: Date): Self = this.set("LatestDigestDeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestDigestDeliveryTime: Self = this.set("LatestDigestDeliveryTime", js.undefined)
    
    @scala.inline
    def setLatestNotificationAttemptSucceeded(value: String): Self = this.set("LatestNotificationAttemptSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestNotificationAttemptSucceeded: Self = this.set("LatestNotificationAttemptSucceeded", js.undefined)
    
    @scala.inline
    def setLatestNotificationAttemptTime(value: String): Self = this.set("LatestNotificationAttemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestNotificationAttemptTime: Self = this.set("LatestNotificationAttemptTime", js.undefined)
    
    @scala.inline
    def setLatestNotificationError(value: String): Self = this.set("LatestNotificationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestNotificationError: Self = this.set("LatestNotificationError", js.undefined)
    
    @scala.inline
    def setLatestNotificationTime(value: Date): Self = this.set("LatestNotificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestNotificationTime: Self = this.set("LatestNotificationTime", js.undefined)
    
    @scala.inline
    def setStartLoggingTime(value: Date): Self = this.set("StartLoggingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLoggingTime: Self = this.set("StartLoggingTime", js.undefined)
    
    @scala.inline
    def setStopLoggingTime(value: Date): Self = this.set("StopLoggingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopLoggingTime: Self = this.set("StopLoggingTime", js.undefined)
    
    @scala.inline
    def setTimeLoggingStarted(value: String): Self = this.set("TimeLoggingStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLoggingStarted: Self = this.set("TimeLoggingStarted", js.undefined)
    
    @scala.inline
    def setTimeLoggingStopped(value: String): Self = this.set("TimeLoggingStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLoggingStopped: Self = this.set("TimeLoggingStopped", js.undefined)
  }
}
