package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trail extends StObject {
  
  /**
    * Specifies an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether a trail has insight types specified in an InsightSelector list.
    */
  var HasInsightSelectors: js.UndefOr[Boolean] = js.native
  
  /**
    * The region in which the trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  
  /**
    * Set to True to include AWS API calls from AWS global services such as IAM. Otherwise, False.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail exists only in one region or exists in all regions.
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
    * Specifies whether log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the trail set by calling CreateTrail. The maximum length is 128 characters.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Name of the Amazon S3 bucket into which CloudTrail delivers your trail files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.The maximum length is 200 characters.
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
    * Specifies the ARN of the trail. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object Trail {
  
  @scala.inline
  def apply(): Trail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trail]
  }
  
  @scala.inline
  implicit class TrailMutableBuilder[Self <: Trail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setHasCustomEventSelectors(value: Boolean): Self = StObject.set(x, "HasCustomEventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCustomEventSelectorsUndefined: Self = StObject.set(x, "HasCustomEventSelectors", js.undefined)
    
    @scala.inline
    def setHasInsightSelectors(value: Boolean): Self = StObject.set(x, "HasInsightSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInsightSelectorsUndefined: Self = StObject.set(x, "HasInsightSelectors", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
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
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLogFileValidationEnabled(value: Boolean): Self = StObject.set(x, "LogFileValidationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileValidationEnabledUndefined: Self = StObject.set(x, "LogFileValidationEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicARN(value: String): Self = StObject.set(x, "SnsTopicARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicARNUndefined: Self = StObject.set(x, "SnsTopicARN", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: String): Self = StObject.set(x, "SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicNameUndefined: Self = StObject.set(x, "SnsTopicName", js.undefined)
    
    @scala.inline
    def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
