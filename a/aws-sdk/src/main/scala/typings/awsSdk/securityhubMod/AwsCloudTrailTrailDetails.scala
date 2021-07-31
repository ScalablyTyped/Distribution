package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudTrailTrailDetails extends StObject {
  
  /**
    * The ARN of the log group that CloudTrail logs are delivered to.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the role that the CloudWatch Logs endpoint assumes when it writes to the log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Region where the trail was created.
    */
  var HomeRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the trail publishes events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the trail applies only to the current Region or to all Regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current AWS account.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS KMS key ID to use to encrypt the logs.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether CloudTrail log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the trail.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the S3 bucket where the log files are published.
    */
  var S3BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The S3 key prefix. The key prefix is added after the name of the S3 bucket where the log files are published.
    */
  var S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the SNS topic that is used for notifications of log file delivery.
    */
  var SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the SNS topic that is used for notifications of log file delivery.
    */
  var SnsTopicName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the trail.
    */
  var TrailArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudTrailTrailDetails {
  
  @scala.inline
  def apply(): AwsCloudTrailTrailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudTrailTrailDetails]
  }
  
  @scala.inline
  implicit class AwsCloudTrailTrailDetailsMutableBuilder[Self <: AwsCloudTrailTrailDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: NonEmptyString): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: NonEmptyString): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setHasCustomEventSelectors(value: Boolean): Self = StObject.set(x, "HasCustomEventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCustomEventSelectorsUndefined: Self = StObject.set(x, "HasCustomEventSelectors", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: NonEmptyString): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    @scala.inline
    def setIncludeGlobalServiceEvents(value: Boolean): Self = StObject.set(x, "IncludeGlobalServiceEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGlobalServiceEventsUndefined: Self = StObject.set(x, "IncludeGlobalServiceEvents", js.undefined)
    
    @scala.inline
    def setIsMultiRegionTrail(value: Boolean): Self = StObject.set(x, "IsMultiRegionTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiRegionTrailUndefined: Self = StObject.set(x, "IsMultiRegionTrail", js.undefined)
    
    @scala.inline
    def setIsOrganizationTrail(value: Boolean): Self = StObject.set(x, "IsOrganizationTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizationTrailUndefined: Self = StObject.set(x, "IsOrganizationTrail", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLogFileValidationEnabled(value: Boolean): Self = StObject.set(x, "LogFileValidationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileValidationEnabledUndefined: Self = StObject.set(x, "LogFileValidationEnabled", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: NonEmptyString): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: NonEmptyString): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: NonEmptyString): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: NonEmptyString): Self = StObject.set(x, "SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicNameUndefined: Self = StObject.set(x, "SnsTopicName", js.undefined)
    
    @scala.inline
    def setTrailArn(value: NonEmptyString): Self = StObject.set(x, "TrailArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailArnUndefined: Self = StObject.set(x, "TrailArn", js.undefined)
  }
}
