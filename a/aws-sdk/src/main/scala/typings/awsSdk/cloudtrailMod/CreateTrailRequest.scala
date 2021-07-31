package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrailRequest extends StObject {
  
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether log file integrity validation is enabled. The default is false.  When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail will not create digest files for log files that were delivered during a period in which log file integrity validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail. 
    */
  var EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the trail is created in the current region or in all regions. The default is false, which creates a trail only in the region where you are signed in. As a best practice, consider creating trails that log events in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account that is the master account for an organization in AWS Organizations.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique identifier. Examples:   alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012   12345678-1234-1234-1234-123456789012  
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the trail. The name must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)  
    */
  var Name: String
  
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: String
  
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files. The maximum length is 200 characters.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is 256 characters.
    */
  var SnsTopicName: js.UndefOr[String] = js.undefined
  
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.undefined
}
object CreateTrailRequest {
  
  @scala.inline
  def apply(Name: String, S3BucketName: String): CreateTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrailRequest]
  }
  
  @scala.inline
  implicit class CreateTrailRequestMutableBuilder[Self <: CreateTrailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setEnableLogFileValidation(value: Boolean): Self = StObject.set(x, "EnableLogFileValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLogFileValidationUndefined: Self = StObject.set(x, "EnableLogFileValidation", js.undefined)
    
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
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: String): Self = StObject.set(x, "SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicNameUndefined: Self = StObject.set(x, "SnsTopicName", js.undefined)
    
    @scala.inline
    def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    @scala.inline
    def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value :_*))
  }
}
