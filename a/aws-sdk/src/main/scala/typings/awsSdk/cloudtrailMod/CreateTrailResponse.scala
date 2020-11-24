package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrailResponse extends js.Object {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail exists in one region or in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail is an organization trail.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether log file integrity validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the name of the trail.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
  
  /**
    * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
    */
  var SnsTopicARN: js.UndefOr[String] = js.native
  
  /**
    * This field is no longer in use. Use SnsTopicARN.
    */
  var SnsTopicName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the ARN of the trail that was created. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object CreateTrailResponse {
  
  @scala.inline
  def apply(): CreateTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrailResponse]
  }
  
  @scala.inline
  implicit class CreateTrailResponseOps[Self <: CreateTrailResponse] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLogsLogGroupArn(value: String): Self = this.set("CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsLogGroupArn: Self = this.set("CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = this.set("CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsRoleArn: Self = this.set("CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setIncludeGlobalServiceEvents(value: Boolean): Self = this.set("IncludeGlobalServiceEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGlobalServiceEvents: Self = this.set("IncludeGlobalServiceEvents", js.undefined)
    
    @scala.inline
    def setIsMultiRegionTrail(value: Boolean): Self = this.set("IsMultiRegionTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiRegionTrail: Self = this.set("IsMultiRegionTrail", js.undefined)
    
    @scala.inline
    def setIsOrganizationTrail(value: Boolean): Self = this.set("IsOrganizationTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOrganizationTrail: Self = this.set("IsOrganizationTrail", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLogFileValidationEnabled(value: Boolean): Self = this.set("LogFileValidationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFileValidationEnabled: Self = this.set("LogFileValidationEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = this.set("S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicARN(value: String): Self = this.set("SnsTopicARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicARN: Self = this.set("SnsTopicARN", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: String): Self = this.set("SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicName: Self = this.set("SnsTopicName", js.undefined)
    
    @scala.inline
    def setTrailARN(value: String): Self = this.set("TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailARN: Self = this.set("TrailARN", js.undefined)
  }
}
