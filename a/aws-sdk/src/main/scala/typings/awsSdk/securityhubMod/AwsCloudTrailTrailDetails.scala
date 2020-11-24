package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudTrailTrailDetails extends js.Object {
  
  /**
    * The ARN of the log group that CloudTrail logs are delivered to.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.native
  
  /**
    * The Region where the trail was created.
    */
  var HomeRegion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether the trail publishes events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the trail applies only to the current Region or to all Regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current AWS account.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * The AWS KMS key ID to use to encrypt the logs.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether CloudTrail log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the trail.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the S3 bucket where the log files are published.
    */
  var S3BucketName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
    */
  var S3KeyPrefix: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the SNS topic that is used for notifications of log file delivery.
    */
  var SnsTopicArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the SNS topic that is used for notifications of log file delivery.
    */
  var SnsTopicName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the trail.
    */
  var TrailArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsCloudTrailTrailDetails {
  
  @scala.inline
  def apply(): AwsCloudTrailTrailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudTrailTrailDetails]
  }
  
  @scala.inline
  implicit class AwsCloudTrailTrailDetailsOps[Self <: AwsCloudTrailTrailDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: NonEmptyString): Self = this.set("CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsLogGroupArn: Self = this.set("CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: NonEmptyString): Self = this.set("CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsRoleArn: Self = this.set("CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setHasCustomEventSelectors(value: Boolean): Self = this.set("HasCustomEventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCustomEventSelectors: Self = this.set("HasCustomEventSelectors", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: NonEmptyString): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRegion: Self = this.set("HomeRegion", js.undefined)
    
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
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLogFileValidationEnabled(value: Boolean): Self = this.set("LogFileValidationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogFileValidationEnabled: Self = this.set("LogFileValidationEnabled", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: NonEmptyString): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: NonEmptyString): Self = this.set("S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: NonEmptyString): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: NonEmptyString): Self = this.set("SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicName: Self = this.set("SnsTopicName", js.undefined)
    
    @scala.inline
    def setTrailArn(value: NonEmptyString): Self = this.set("TrailArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailArn: Self = this.set("TrailArn", js.undefined)
  }
}
